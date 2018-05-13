package it.islandofcode.jvtllib.newparser.error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/**
 * Questo listener estende {@link BaseErrorListener} e implementa un nuovo
 * tipo di segnalazione d'errore, più semplice da interpretare,
 * con la sottolineatura della posizione dell'errore.
 * <br><br>
 * Per come è stato strutturato, quando ci si imbatte in un errore, lancia un'eccezione
 * {@link ParseException}.
 * <br><br>
 * Notare che, estendendo {@link RuntimeException}, l'eccezione supera tutto il flusso
 * di controllo di ANTLR e finisce nel main, dove bisogna catturarlo.
 * Questo comporta che il parser esce al primo errore individuato, anche se è presente più di un errore,
 * cosa che permette di evitare l'esecuzione del codice.
 * <br><br>
 * <b>Attenzione!</b> Dato che usa spazi e non tabs, la sottolineatura potrebbe essere leggermente
 * fuori asse rispetto all'errore. Vengono comunque stampate riga, colonna e messaggio.
 * 
 * @author Pier Riccardo Monzo
 */
public class UnderlineListener extends BaseErrorListener {
	
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSym,
			int line,
			int column,
			String msg,
			RecognitionException ex
			) {
		String posComplete = "Line ["+line+"], Char ["+column+"] -> " +msg;
		//System.err.println("Line ["+line+"], Char ["+column+"] -> " +msg);
		throw new ParseException(
				posComplete + underlineError(recognizer,(Token)offendingSym,line,column),
				ex,
				line);
	}

	protected String underlineError(Recognizer<?, ?> recog, Token offenSym, int line, int column) {
		String err2ret = "\n";
		CommonTokenStream tokens = (CommonTokenStream) recog.getInputStream();
		
		String in = tokens.getTokenSource().getInputStream().toString();
		String[] lines = in.split("\n");
		
		String errorLine = lines[line-1];
		//System.err.println(errorLine);
		err2ret +=errorLine+"\n";
		
		for(int i=0; i<column; i++) {
			//System.err.print(" ");
			err2ret += " ";
		}
		int start = offenSym.getStartIndex();
		int stop = offenSym.getStopIndex();
		if(start>=0 && stop>=0) {
			for (int i=start; i<=stop; i++) {
				//System.err.print("^");
				err2ret += "^";
			}
		}
		//System.err.println();
		return err2ret;
	}

}
