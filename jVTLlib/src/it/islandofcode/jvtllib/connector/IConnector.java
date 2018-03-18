package it.islandofcode.jvtllib.connector;

import it.islandofcode.jvtllib.model.DataSet;

/**
 * Classe per esporre metodi per implementare get() e put() in VTL.<br>
 * Va implementata e passata come parametro al main.
 * 
 * @author Pier Riccardo Monzo
 */
public interface IConnector {
	//TODO verificare e implementare ulteriormente laddove necessario.
	
	/**
	 * Recupera un dataset da una specifica posizione.<br>
	 * La posizione dipende dal tipo di base di dati, ad esempio:<br>
	 * <ul>
	 * 	<li>Se database, la posizione � intesa come nome tabella.
	 * 	<li>Se file di testo (ad es. csv), la posizione pu� essere ignorata/vuota
	 *	<li>Se � un foglio dati (ad es. xsl/xslx), la posizione pu� essere vuota o<br>
	 *		indicare il foglio di lavoro specifico.
	 * </ul>
	 * @param location String
	 * @return {@link DataSet}
	 */
	public DataSet get(String location);
	
	/**
	 * Salva permanentemente un {@link DataSet} nella posizione specificata.<br>
	 * Il valore di <i>Location</i> � recuperabile tramite funzione {@code getLocation()}.<br>
	 * Fare riferimento al javadoc di {@code get()} per i dettagli su <i>Location</i>.
	 * @param location String
	 * @param data {@link DataSet}
	 * @return boolean
	 */
	public boolean set(String location, DataSet data);
	
	/**
	 * Ritorna True se questo oggetto � collegato ad una base di dati<br>
	 * e se questo sia effettivamente raggiungibile e sia possibile operare <br>
	 * su di esso.
	 * @return boolean
	 */
	public boolean checkStatus();
	
	/**
	 * Ritorna la posizione usata per il recupero dei dati.<br>
	 * Se non � mai stato chiamato {@code get()}, il valore <br>
	 * di <i>Location</i> sar� stringa vuota.<br>
	 * Ovviamente, non � obbligatorio usare lo stesso valore:<br>
	 * se ad es. abbiamo modificato il valore di tab1 nel dataset ds1,<br>
	 * ma non vogliamo alterare tab1, possiamo indicare tab2 come <i>Location</i>.<br>
	 * @return String
	 */
	public String getLocation();
}
