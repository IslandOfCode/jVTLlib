package it.islandofcode.jvtllib.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * @author Pier Riccardo Monzo
 */
public class SimpleDate {
	
	public static final String[] DATEFORMAT = {
			"yyyy-MM-ddTHH:mm:ssZ",
			"dd/MM/uuuu",
			"uuuu-MM-dd kk:mm:ss.SSS",
			"uuuu-MM-dd",
			"uuuu-MM"
	};
	
	/**
	 * Questo sembra essere il formato di default delle data di Java
	 */
	//public static final String DEFAULTJAVADATEFORMAT = "dow mon dd hh:mm:ss zzz yyyy";
	public static final int DATE_FORMAT_UTC = 0;
	public static final int DATE_FORMAT_PRETTY = 1;
	public static final int DATE_FORMAT_DATETIME = 2;
	public static final int DATE_ISO_8601  = 3;
	public static final int DATE_FORMAT_YEARMONTH = 4;
	
	
	private LocalDate myDate = null;
	private int myformat = -1;
	
	private Boolean isDefault = false;

	/**
	 * Costruttore vuoto.
	 * Usa una data molto nel passato, da usare come valore nullo.
	 */
	public SimpleDate() {
		this.myDate = LocalDate.MIN;
		this.myformat = SimpleDate.DATE_ISO_8601;
		this.isDefault = true;
	}
	
	/**
	 * Accetta una data in input come stringa e crea un oggetto data.<br>
	 * La data Ã¨ accettata nel formato
	 * <ul>
	 * 	<li>TODO</li>
	 * </ul>
	 * Il costruttore tenterÃ  di capire quale dei vari formati sia quello giusto, altrimenti
	 * lancerï¿½ un {@link ParseException}.
	 * <br> 
	 * @param date
	 * @throws ParseException
	 */
	public SimpleDate(String date) /*throws ParseException*/ {
		for(int f=0; f<DATEFORMAT.length; f++) {
			try {
				this.myDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(DATEFORMAT[f]));
				this.myformat = f;
			} catch (DateTimeParseException | IllegalArgumentException e) {
				/*
				 * se non catturassi IllegalArgumentException, quando ho una stringa,
				 * proverei ad eseguire LocalDate.parse, che potrebbe (oopure no, dipende dalla stringa)
				 * andare in eccezione e l'esecuzione si bloccherebbe.
				 * Catturandolo, verrà ritornata una data di default, e quindi Scalar
				 * saprà che è una stringa.
				 */
				continue;
			}
		}
		
		if(this.myformat<0) {
			this.myDate = LocalDate.MIN;
			this.myformat = SimpleDate.DATE_ISO_8601;
			this.isDefault = true;
		}
	}
	
	/**
	 * Ritorna true se la data Ã¨ una data generata e non parsata.
	 * @return
	 */
	public boolean isDefaultDate() {
		return this.isDefault;
	}
	
	/**
	 * XXX
	 * @param format
	 * @param value
	 * @return
	 */
	public static Date toDateObj(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                //date = null;
            	return null;
            }
        } catch (ParseException ex) {
            //ex.printStackTrace();
        	return null;
        }
        return date;
    }
	
	public String getDateString() {
		return this.myDate.format( DateTimeFormatter.ofPattern(DATEFORMAT[this.myformat]) );
	}
	
	public String getFormat() {
		return SimpleDate.DATEFORMAT[myformat];
	}
	
	public LocalDate getDate() {
		return this.myDate;
	}
		

}
