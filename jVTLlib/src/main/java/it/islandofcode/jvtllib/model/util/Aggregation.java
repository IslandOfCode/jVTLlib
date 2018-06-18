package it.islandofcode.jvtllib.model.util;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;

/**
 * Classe per gestire le operazioni di aggregazione.
 * @author Pier Riccardo Monzo
 */
public class Aggregation {
	
	public static enum AGGROP{
		MIN,
		MAX,
		SUM,
		AVG
	}
	
	private HashMap<String,AggrTableRow> T;
	private AGGROP op;
	
	private DataStructure dstr;
	private String measComp;
	
	public Aggregation(DataStructure dstr, AGGROP o){
		T = new HashMap<>();
		op = o;
		this.dstr = dstr;
		for(String c : dstr.getKeys()) {
			if(dstr.getComponent(c).getType().equals(DataStructure.ROLE.Measure)) {
				this.measComp = c;
				break;
			}
		}
	}
	
	public AGGROP getAggrOp() {
		return op;
	}
	
	public String getMeasureCompName() {
		return measComp;
	}
	
	public void aggregateNext(DataPoint dp) {
		//ritorno se il valore dello scalare è nullo perchè non porterebbe beneficio all'operazione
		if(dp.getValue(measComp).isNull())
			return;
		
		DataPoint ndp = new DataPoint();
		String d = "";
		for(String c : dstr.getKeys()) {
			ndp.setValue(c, dp.getValue(c)); //creo il datapoint che andrà poi restituito
			if(c.equals(measComp)) //skip measure
				continue;
			
			d += dp.getValue(c).getScalar(); //creo la stringa che mi serve per l'hashing
		}
		
		AggrTableRow R = null;
		
		if(T.containsKey(Aggregation.hash(d))) {
			R = T.get(Aggregation.hash(d));
			R.aggregate(dp.getValue(measComp).getScalar());//prendo il valore dal datapoint passato
		} else {
			R = new AggrTableRow(ndp,measComp,this.op);
		}
		
		T.put(Aggregation.hash(d), R);
	}
	
	public ArrayList<DataPoint> retrive() {
		
		ArrayList<DataPoint> ret = new ArrayList<>();
		for(String K : T.keySet()) {
			AggrTableRow R = T.get(K);
			ret.add(R.getDataPoint());
		}
		
		return ret;
	}
	
	/**
	 * Algoritmo di hashing per stringhe. Uso SHA-256 per eliminare del tutto
	 * il problema delle collisioni.
	 * <br><br>
	 * L'affermazione precedente è vera in quanto SHA-256 è un algoritmo di hashing
	 * <i>crittografico</i> e in quanto tale eredita le proprietà di sicurezza.
	 * Se si trovasse una parola che generi una collisione, l'algoritmo stesso
	 * sarebbe da considerare violato.
	 * <br><br>
	 * Inoltre, la scelta è ricaduta su questo specifico algoritmo poichè sembra
	 * essere quello più performante.
	 * Una variante ancora migliore è MD4, ma non fa parte di {@link java.security}.
	 * <br><br>
	 * La lunghezza della stringa in input potrebbe però essere un problema.
	 * 
	 * @param in String
	 * @return Hash della stringa.
	 */
	private static final String hash(String in) {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(in.getBytes());
			return new String(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			//SHA-256 è presente, ma giusto come fallback metto anche questo.
			return ""+in.hashCode();
		}
	}
	
	/**
	 * Classe interna per mantenere in memoria i risultato dell'aggregazione
	 * e raggruppamento.
	 * @author Pier Riccardo Monzo
	 */
	private class AggrTableRow{
		private DataPoint data;
		private String measure;
		private BigDecimal accumulated;
		private int count;
		private AGGROP op;
		
		/**
		 * Costruttore. Accetta un {@link DataPoint}, la chiave per accedere
		 * al componente <i>Measure</i> del {@link DataPoint} e l'operazione
		 * di aggregazione designata.
		 * @param d {@link DataPoint}
		 * @param a String
		 * @param o {@link AGGROP}
		 */
		AggrTableRow(DataPoint d, String a, AGGROP o){
			this.data = d;
			this.measure = a;
			this.accumulated = new BigDecimal(d.getValue(a).getScalar());
			this.count = 0;
			this.op = o;
		}
		
		/**
		 * Stupida funzione per incrementare il contatore interno.
		 */
		private void countInc() {
			this.count+=1;
		}
		
		/**
		 * Recupera il valore corrente del contatore.
		 * <br>
		 * Indica quanti datapoint sono stati aggregati a ques'unica riga.
		 * @return int
		 */
		private int getCount() {
			return this.count;
		}
		
		/**
		 * Ritorna il {@link DataPoint} aggregato.
		 * Si fa notare che questa classe e la classe contenitrice ({@link Aggregation})
		 * usano un approccio <i>lazy update</i> per quanto riguarda la costruzione del {@link DataPoint}.
		 * Quest'ultimo infatti viene aggiornato SOLO quando questo metodo viene richiamato.
		 * Durante tutta la fase di esecuzione dell'aggregazione, i valori vengono calcolati su un campo
		 * separato ({@link BigDecimal}) che solo alla fine viene accorpato.
		 * 
		 * @return {@link DataPoint}
		 */
		public DataPoint getDataPoint() {
			this.data.setValue(
					measure,
					new Scalar(
							accumulated.toString(),
							data.getValue(measure).getScalarType()
						)
					);
			return this.data;
		}
		
		/**
		 * Operazione di aggregazione.
		 * Viene passato in input il nuovo valore da aggregare ai precedenti.
		 * Attualmente le operazioni supportate sono descritte dall'{@link Enum} {@link AGGROP}.
		 * @param nval
		 */
		public void aggregate(String nval) {
			BigDecimal nv = new BigDecimal(nval);
			countInc();
			
			switch(op) {
			case MAX:{
				if(this.accumulated.compareTo(nv)<0) {
					this.accumulated = nv;
				}
				break;
			}
			case MIN:{
				if(this.accumulated.compareTo(nv)>0) {
					this.accumulated = nv;
				}
				break;
			}
			case SUM:{
				this.accumulated = this.accumulated.add(nv);
				break;
			}
			case AVG:{
				/*
				 * Utilizzo una derivazione della formula della media, che dovrebbe funzionare.
				 * Data la media precedente U[n-1], il nuovo valore da mediare X[n] e il numero
				 * di elementi totale n (comprensivo del nuovo), si calcola la nuova media come:
				 * 					(n-1)*U[n-1]+X[n]
				 * 			U[n] =	-----------------
				 * 							n
				 * In questo modo i calcoli dovrebbero essere più veloci.
				 * Testato con MatLab, l'espressione funziona. Bisogna vedere se Java è all'altezza.
				 */

				//alternativa con double
				//Double tmp = (getCount()-1)*accumulated.doubleValue()+Double.parseDouble(nval);
				//this.accumulated = new BigDecimal(tmp/getCount());
				
				//verificare ordine delle operazioni.
				BigDecimal tmp = (new BigDecimal(getCount()-1)).multiply(accumulated).add(nv).divide(new BigDecimal(getCount()));
				this.accumulated = tmp;
				break;
			}
			default:
				//qui non ci arrivo mai.
				break;
			}
			
		}
	}//fine classe interna
	
	
	
	
	
	
	
	
	
	
	
}//fine classe
