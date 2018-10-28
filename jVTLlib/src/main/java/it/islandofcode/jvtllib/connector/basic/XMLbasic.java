package it.islandofcode.jvtllib.connector.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;

public class XMLbasic implements IConnector {

	@Override
	public DataSet get(String location, String[] keep) {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		InputStream in;
		
		DataStructure dstr = new DataStructure("dstrXML");
		dstr.putComponent("Id", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Identifier);
		dstr.putComponent("PostHistoryTypeId", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Identifier);
		dstr.putComponent("PostId", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Identifier);
		dstr.putComponent("RevisionGUID", new Scalar(Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("CreationDate", new Scalar(Scalar.SCALARTYPE.Date), DataStructure.ROLE.Attribute);
		dstr.putComponent("UserId", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Identifier);
		dstr.putComponent("Comment", new Scalar(Scalar.SCALARTYPE.String), DataStructure.ROLE.Measure);
		dstr.putComponent("Text", new Scalar(Scalar.SCALARTYPE.String), DataStructure.ROLE.Measure);
		
		DataSet ds = new DataSet("posthistory", "XML di stackoverflow.com", dstr, true);

		try {
			in = new FileInputStream(location);
			XMLStreamReader streamReader = inputFactory.createXMLStreamReader(in);
			streamReader.nextTag(); // Advance to "book" element
			//System.out.println("ACTUAL: " + streamReader.getLocalName());
			streamReader.nextTag(); // Advance to "person" element
			//System.out.println("ACTUAL: " + streamReader.getLocalName());
			
			DataPoint dp;
			String local = "";
			String localValue = "";
			int count = 1;
			
			while (streamReader.hasNext()) {
				
				/*
				 * Questo IF serve per evitare che vengano eseguiti 3 cicli per riga.
				 * Ad ogni record sono associati almeno 3 eventi: START_ELEMENT, END_ELEMENT e CHARACTER.
				 * Data la struttura del record, abbiamo bisogno del solo START_ELEMENT, gli altri due sono
				 * inutili. In questo modo verranno eseguiti si 3 cicli per ogni rigo, ma almeno 2 saranno
				 * istantanei.
				 */
				if(streamReader.getEventType()!=1) {
					streamReader.next();
					continue;
				}
				
				//System.out.println("ACTUAL["+count+"]: " + streamReader.getEventType());
				
				dp = new DataPoint();
				int i = 0;
				while(i<8) {
					//local = streamReader.getAttributeName(i).getLocalPart();
					try {
						//se ho meno di 8 attributi, vado in eccezione.
						local = streamReader.getAttributeLocalName(i);
					} catch(IllegalStateException e) {
						break;
					}
					
					//dato che ci possono essere al più 8 attr, faccio questi cicli, ma se ho già
					//raggiunto il massimo, almeno un ciclo andrà a vuoto, quindi devo uscire.
					//per qualche motivo il break qui sopra non viene chiamato.
					if(local==null) {
						i++;
						break;
					}
					
					localValue = streamReader.getAttributeValue(null, local);
					
					switch(local) {
					case "Id":
						dp.setValue(local, new Scalar(localValue, Scalar.SCALARTYPE.Integer) );
						break;
					case "PostHistoryTypeId":
						dp.setValue(local, new Scalar(localValue, Scalar.SCALARTYPE.Integer) );
						break;
					case "PostId":
						dp.setValue(local, new Scalar(localValue, Scalar.SCALARTYPE.Integer) );
						break;
					case "RevisionGUID":
						dp.setValue(local, new Scalar(localValue, Scalar.SCALARTYPE.String) );
						break;
					case "CreationDate":
						dp.setValue(local, new Scalar(localValue, Scalar.SCALARTYPE.Date) );
						break;
					case "UserId":
						dp.setValue(local, new Scalar(localValue, Scalar.SCALARTYPE.Integer) );
						break;
					case "Comment":
						dp.setValue(local, new Scalar(localValue.substring(0, (localValue.length()>10)?10:localValue.length())+"...", Scalar.SCALARTYPE.String) );
						break;
					case "Text":
						dp.setValue(local, new Scalar(localValue.substring(0, (localValue.length()>10)?10:localValue.length())+"...", Scalar.SCALARTYPE.String) );
						break;
					}
					i++;
				}
				//alcune righe non hanno questi attributi, quindi li aggiungo manualmente nulli.
				if(!dp.getKeys().contains("Comment")) {
					dp.setValue("Comment", new Scalar(Scalar.SCALARTYPE.String));
				}
				if(!dp.getKeys().contains("Text")) {
					dp.setValue("Text", new Scalar(Scalar.SCALARTYPE.String));
				}

				count++;
				ds.setPoint(dp);
				streamReader.next();
				
				if((count % 100000) == 0)
					System.out.println("COUNT: " + count);
				
				//limito il numero di DataPoint ad una cifra arbitraria.
				if(count>=500000)
					break;
				
			}
		} catch (XMLStreamException | FileNotFoundException e) {
			e.printStackTrace();

		}

		return ds;
	}

	@Override
	public boolean put(String location, DataSet data) {
		// TODO Auto-generated method stub
		return false;
	}

}
