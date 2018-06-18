package it.islandofcode.jvtllib.newparser.error;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

/**
 * Questa strategia d'errore consiste nel bloccare il parser al primo errore individuato.
 * Non ha senso eseguire il codice se questo ha un problema dal punto di vista grammaticale.
 * 
 * @author Pier Riccardo Monzo
 */
public class BailOutErrorStrategy extends DefaultErrorStrategy {

	@Override
	public void recover(Parser recognizer, RecognitionException e) {
		throw e;
	}

	@Override
	public Token recoverInline(Parser recognizer) throws RecognitionException {
		throw new InputMismatchException(recognizer);
	}

	@Override
	public void sync(Parser arg0) throws RecognitionException {
		//vuoto
	}
	

}
