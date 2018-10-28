package it.islandofcode.jvtllib.connector;

import it.islandofcode.jvtllib.model.DataSet;

/**
 * Classe per esporre metodi per implementare get() e put() in VTL.<br>
 * Va implementata e passata come parametro al main.
 * 
 * @author Pier Riccardo Monzo
 */
public interface IConnector {
	
	/**
	 * Recupera un dataset da una specifica posizione.<br>
	 * La posizione dipende dal tipo di base di dati, ad esempio:<br>
	 * <ul>
	 * 	<li>Se database, la posizione è intesa come nome tabella.
	 * 	<li>Se file di testo (ad es. csv), la posizione può essere ignorata/vuota
	 *	<li>Se è un foglio dati (ad es. xsl/xslx), la posizione può essere vuota o<br>
	 *		indicare il foglio di lavoro specifico.
	 * </ul>
	 * @param location String
	 * @return {@link DataSet}
	 */
	public DataSet get(String location, String[] keep);
	
	/**
	 * Salva permanentemente un {@link DataSet} nella posizione specificata.<br>
	 * Il valore di <i>Location</i> è recuperabile tramite{@code getLocation()}.<br>
	 * Fare riferimento al javadoc di {@code get()} per i dettagli su <i>Location</i>.
	 * @param location String
	 * @param data {@link DataSet}
	 * @return boolean
	 */
	public boolean put(String location, DataSet data);

}
