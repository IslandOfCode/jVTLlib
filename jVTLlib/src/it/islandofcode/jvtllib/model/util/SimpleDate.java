package it.islandofcode.jvtllib.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Pier Riccardo Monzo
 */
public class SimpleDate {
	
	public static final String[] DATEFORMAT = {
			"yyyy-MM-dd'T'HH:mm:ss",
			"dd/MM/yyyy",
			"dd/MM/yyyy HH:mm:ss",
			"yyyy",
			"MM",
			"DD",
			"yyyy-MM"
	};
	
	public static final String[] REGEXFORMAT = {
			//TODO  non considera timezone e ore, si ferma al primo apostrofo prima di T
			"^[0-9]{4}-[0-9]{2}-[0-9]{2}'",
			"^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$",
			"^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2}$",
			"^[0-9]{4}$",
			"^[0-9]{2}$",
			"^[0-9]{2}$",
			"^[0-9]{4}-[0-9]{2}$"
	};
	
	/**
	 * Questo sembra essere il formato di default delle data di Java
	 */
	public static final String DEFAULTJAVADATEFORMAT = "dow mon dd hh:mm:ss zzz yyyy";
	
	public static final int DATE_ISO_8601 = 0;
	public static final int DATE_FORMAT_DATEONLY = 1;
	public static final int DATE_FORMAT_W_HOUR = 2;
	public static final int DATE_FORMAT_YEARONLY = 3;
	public static final int DATE_FORMAT_MONTHONLY = 4;
	public static final int DATE_FORMAT_DAYONLY = 5;
	public static final int DATE_FORMAT_YEARMONTH = 6;
	
	private Date mydate = null;
	private String myformat = "";
	
	private Boolean isDefault = false;

	/**
	 * Costruttore vuoto.
	 * Usa la data corrente.
	 */
	public SimpleDate() {
		this.mydate = new Date();
		this.myformat = DEFAULTJAVADATEFORMAT;
		this.isDefault = true;
	}

	/**
	 * Crea data specificando i millisecondi passati da "the epoch".<br>
	 * Non verrà mai usato, suppongo.
	 * @param arg0 long
	 */
	public SimpleDate(long arg0) {
		this.mydate = new Date(arg0);
		this.myformat = DEFAULTJAVADATEFORMAT;
		this.isDefault = true;
	}
	
	/**
	 * Accetta una data in input come stringa e crea un oggetto data.<br>
	 * La data è accettata nel formato
	 * <ul>
	 * 	<li><b>dd/MM/YYYY hh:mm:ss</b> (data più orario)
	 * 	<li><b>dd/MM/YYYY</b> (solo data)
	 * 	<li><b>yyyy-MM-dd'T'HH:mm:ss</b> (ISO 8601, formato internazionale)
	 * </ul>
	 * Il costruttore tenterà di capire quale dei tre formati sia quello giusto, altrimenti
	 * lancerà un {@link ParseException}.
	 * <br> 
	 * @param date
	 * @throws ParseException
	 */
	public SimpleDate(String date) /*throws ParseException*/ {
		for(int i=0; i<DATEFORMAT.length; i++) {
			this.mydate = SimpleDate.ToDateObj(SimpleDate.DATEFORMAT[i], SimpleDate.REGEXFORMAT[i]);
			this.myformat = SimpleDate.DATEFORMAT[i];
			if(this.mydate != null)
				break;
		}

		//TODO scegliere cosa fare se il formato non è riconosciuto.
		if(this.mydate == null) {
			this.mydate = new Date();
			this.myformat = DEFAULTJAVADATEFORMAT;
			this.isDefault = true;
			//throw new ParseException("Nessun formato riconosciuto",0);
		}
	}
	
	public boolean isDefaultDate() {
		return this.isDefault;
	}
	
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
		return this.mydate.toString();
	}
	
	//TODO valutare alternativa a switch/case, forse un ciclo while?
	public String getDateString(int format) {
		SimpleDateFormat sdf;
		switch(format) {
		case 0: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[0]);
			break;
		}
		case 1: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[1]);
			break;
		}
		case 2: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[2]);
			break;
		}
		case 3: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[3]);
			break;
		}
		case 4: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[4]);
			break;
		}
		case 5: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[5]);
			break;
		}
		case 6: {
			sdf = new SimpleDateFormat(SimpleDate.DATEFORMAT[6]);
			break;
		}
		default: {
			return getDateString();
		}
		}
		return sdf.format(mydate);
	}
	
	public String getDateString(String format) {
		if(format==null || format.length()<=0)
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(mydate);
	}
	
	public String getFormat() {
		return this.myformat;
	}
	
	public Date getDate() {
		return this.mydate;
	}
	
	/**
	 * Restituisce l'anno come YYYY.
	 * @return String
	 */
	public String getYear() {
		LocalDate ld = this.mydate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return ld.getYear()+"";
	}
	
	/**
	 * Restituisce il mese come MM.
	 * @return String
	 */
	public String getMonth() {
		LocalDate ld = this.mydate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if(ld.getMonthValue()<=9)
			return "0"+ld.getMonthValue();
		return ld.getMonthValue()+"";
	}
	
	/**
	 * Restituisce il giorno come DD.
	 * @return String
	 */
	public String getDay() {
		LocalDate ld = this.mydate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if(ld.getDayOfMonth()<=9)
			return "0"+ld.getDayOfMonth();
		return ld.getDayOfMonth()+"";
	}
	
	
	

}
