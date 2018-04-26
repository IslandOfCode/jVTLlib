package it.islandofcode.jvtllib.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * @author Pier Riccardo Monzo
 */
public class SimpleDate {
	
	public static final String[] DATEFORMAT = {
			"dd/MM/uuuu",
			"uuuu-MM-dd kk:mm:ss.SSS",
			"uuuu-MM-dd",
			"uuuu-MM"
	};
	
	//XXX
	public static final String[] REGEXFORMAT = {
			"^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$",
			"^[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}$",
			"^[0-9]{4}-[0-9]{2}-[0-9]{2}$",
			"^[0-9]{4}-[0-9]{2}$"
	};
	
	/**
	 * Questo sembra essere il formato di default delle data di Java
	 */
	public static final String DEFAULTJAVADATEFORMAT = "dow mon dd hh:mm:ss zzz yyyy";
	
	public static final int DATE_FORMAT_PRETTY = 0;
	public static final int DATE_FORMAT_DATETIME = 1;
	public static final int DATE_ISO_8601  = 2;
	public static final int DATE_FORMAT_YEARMONTH = 3;
	
	
	private LocalDate myDate = null;
	private int myformat = -1;
	
	private Boolean isDefault = false;

	/**
	 * Costruttore vuoto.
	 * Usa la data corrente.
	 */
	public SimpleDate() {
		this.myDate = LocalDate.now();
		this.myformat = SimpleDate.DATE_ISO_8601;
		this.isDefault = true;
	}

	/**
	 * Crea data specificando i millisecondi passati da "the epoch".<br>
	 * Non verrà mai usato, suppongo.
	 * @param arg0 long
	 */
	public SimpleDate(long arg0) {
		this.myDate = LocalDate.ofEpochDay(arg0);
		this.myformat = SimpleDate.DATE_ISO_8601;
		this.isDefault = true;
	}
	
	/**
	 * Accetta una data in input come stringa e crea un oggetto data.<br>
	 * La data è accettata nel formato
	 * <ul>
	 * 	<li>TODO</li>
	 * </ul>
	 * Il costruttore tenterà di capire quale dei vari formati sia quello giusto, altrimenti
	 * lancerà un {@link ParseException}.
	 * <br> 
	 * @param date
	 * @throws ParseException
	 */
	public SimpleDate(String date) /*throws ParseException*/ {
		for(int f=0; f<DATEFORMAT.length; f++) {
			try {
				this.myDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(DATEFORMAT[f]));
				this.myformat = f;
			} catch (DateTimeParseException e) {
				continue;
			}
		}
		
		if(this.myformat<0) {
			this.myDate = LocalDate.now();
			this.myformat = SimpleDate.DATE_ISO_8601;
			this.isDefault = true;
		}
	}
	
	/**
	 * Ritorna true se la data è una data generata e non parsata.
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
	public static Date ToDateObj(String format, String value) {
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
