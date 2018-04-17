package it.islandofcode.jvtllib.newparser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.rits.cloning.Cloner;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.*;
import it.islandofcode.jvtllib.model.VTLObj.OBJTYPE;
import it.islandofcode.jvtllib.model.util.Component;
import it.islandofcode.jvtllib.newparser.antlr.newVTLBaseVisitor;
import it.islandofcode.jvtllib.newparser.antlr.newVTLParser;
import it.islandofcode.jvtllib.newparser.antlr.newVTLParser.*;
/**
 * @author Pier Riccardo Monzo
 */
public class NewEval extends newVTLBaseVisitor<VTLObj> {
	
	private static final Logger LOG = Logger.getLogger( NewEval.class.getName() );

	/**
	 * Effettua un deepclone di ogni oggetto.
	 * Problema <a href="https://gogs.islandofcode.it/gogsadmin/jVTLlib-parser-scratch/issues/4">Parser-scratch#4</a>
	 */
	Cloner CLONER;	
	Stack<Map<String,VTLObj>> stack;
	Map<String, VTLObj> MEMORY;
	Map<String, Object> GLOBAL;
	IConnector connector;

	public NewEval(IConnector con) {
		this.connector = con;
		CLONER = new Cloner();
		stack = new Stack<>();
		MEMORY = new HashMap<String, VTLObj>();
		GLOBAL = new HashMap<String,Object>();
		
		/*
		 * CAMBIAMI PER OTTENERE UN DIVERSO LIVELLO DI LOGGING
		 */
		//LOG.setLevel(Level.FINEST);
		Handler systemOut = new ConsoleHandler();
		systemOut.setLevel( Level.OFF );
		LOG.addHandler( systemOut );
		LOG.setLevel( Level.OFF );

		// Prevent logs from processed by default Console handler.
		LOG.setUseParentHandlers( false ); // Solution 1
		//Logger.getLogger("").setLevel( Level.OFF ); // Solution 2
	}
	

	@Override
	public VTLObj visitParse(ParseContext ctx) {
		LOG.info("Avvio del parser");
		MEMORY.clear(); // non è necessario, giusto per.
		LOG.info("MEMORY inizializzato.");
		return super.visitParse(ctx);
	}

	@Override
	public VTLObj visitAssignment(AssignmentContext ctx) {
		String varname = ctx.varname().getText(); // nome della variabile da assegnare (Sinistra)
		VTLObj value = this.visit(ctx.expr()); // questo è il valore dell'espressione.

		LOG.finest("ASSIGN VAR[" + varname + "] WITH VALUE [" + value + "]");

		return MEMORY.put(varname, CLONER.deepClone(value));
		// return super.visitAssignment(ctx);
	}
	
	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitPrecedenceexpr(it.islandofcode.jvtllib.newparser.newVTLParser.PrecedenceexprContext)
	 */
	@Override
	public VTLObj visitPrecedenceexpr(PrecedenceexprContext ctx) {
		return this.visit(ctx.expr());
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitUnaryexpr(it.islandofcode.jvtllib.newparser.newVTLParser.UnaryexprContext)
	 */
	@Override
	public VTLObj visitUnaryexpr(UnaryexprContext ctx) {
		
		VTLObj val = this.visit(ctx.expr());
		
		if(!(val instanceof Scalar))
			throw new RuntimeException("UNARY accept only Scalar.");
		else if( !((Scalar)val).isNumber() && !((Scalar)val).getScalarType().equals(Scalar.SCALARTYPE.Boolean) )
			throw new IllegalArgumentException("UNARY accept only Numeric or Boolean Scalar.");
	
		switch(ctx.op.getType()) {
		case(newVTLParser.NOT):{
			if( !((Scalar)val).getScalarType().equals(Scalar.SCALARTYPE.Boolean))
				throw new RuntimeException("UNARY NOT accept ONLY boolean value.");
			if( ((Scalar)val).asBoolean() )
				return Scalar.createBoolean(false);
			else
				return Scalar.createBoolean(true);
		}
		case(newVTLParser.PLUS):{
			//non serve praticamente a niente, quindi perchè lo considero?
			if( ((Scalar)val).getScalarType().equals(Scalar.SCALARTYPE.Boolean))
				throw new RuntimeException("UNARY PLUS undefiened for boolean value.");
			return val;
		}
		case(newVTLParser.MINUS):{
			if( ((Scalar)val).getScalarType().equals(Scalar.SCALARTYPE.Boolean))
				throw new RuntimeException("UNARY MINUS undefiened for boolean value.");
			//moltiplico valore preesistente per -1, in modo da alterarne il segno
			return new Scalar( ""+( ((Scalar)val).asDouble()*(-1) ), ((Scalar)val).getScalarType() );
		}
		default:
			throw new RuntimeException("Unknow UNARY operator " + ctx.op.getText());
		}
		
		//return super.visitUnaryexpr(ctx);
	}


	@SuppressWarnings("deprecation")
	@Override
	public VTLObj visitMathexpr(MathexprContext ctx) {
		VTLObj left = this.visit(ctx.expr(0));
		VTLObj right = this.visit(ctx.expr(1));

		if (left == null || right == null)
			throw new RuntimeException("Math operand cannot be null: left[" + left + "] OP right[" + right + "]");

		/*
		 * Passi da eseguire: A) inizializza variabili per i 4 casi (due scalari, due
		 * dataset) B) verifica in quale caso stiamo, con una serie di if: -solo scalari
		 * (caso 0) -scalare e colonna (caso 1) -colonna e scalare (caso 2) C)
		 * switch/case, esegue le operazioni sulle variabili del passo (A) D) ritorna la
		 * variabile risultante (da fare nello switch/case)
		 */

		Scalar a = null, b = null;
		DataSet dsa = null, dsb = null;
		String column = "";
		int caso = 3; // caso sconosciuto, vai in default

		// caso 0, solo scalari, il più semplice
		if (left.getObjType().equals(VTLObj.OBJTYPE.Scalar) && right.getObjType().equals(VTLObj.OBJTYPE.Scalar)) {
			// se sono due numeri
			if (((Scalar) left).isNumber() && ((Scalar) right).isNumber()) {
				caso = 0;
				a = (Scalar) left;
				b = (Scalar) right;
			} else {
				throw new RuntimeException("Both operand of a math operation HAS to be number.");
			}
		}

		// caso 1, scalare e colonna
		if (left.getObjType().equals(VTLObj.OBJTYPE.Scalar)
				&& right.getObjType().equals(VTLObj.OBJTYPE.DataSetColumn)) {

			if (!((Scalar) left).isNumber())
				throw new RuntimeException("Both operand of a math operation HAS to be number.");

			caso = 1;
			a = (Scalar) left;
			dsb = (DataSet) CLONER.deepClone( MEMORY.get(((DataSetColumn) right).getDataSetName()) );
			column = ((DataSetColumn) right).getColumnName();
			if (!dsb.getDataStructure().isSameType(column, OBJTYPE.Scalar, a.getScalarType()))
				throw new RuntimeException("Math operation with different operand type.");
		}

		// caso 2, colonna e scalare
		if (left.getObjType().equals(VTLObj.OBJTYPE.DataSetColumn)
				&& right.getObjType().equals(VTLObj.OBJTYPE.Scalar)) {

			if (!((Scalar) right).isNumber())
				throw new RuntimeException("Both operand of a math operation HAS to be number.");

			caso = 2;
			dsa = (DataSet) CLONER.deepClone( MEMORY.get(((DataSetColumn) left).getDataSetName()) );
			b = (Scalar) right;
			column = ((DataSetColumn) left).getColumnName();
			if (!dsa.getDataStructure().isSameType(column, OBJTYPE.Scalar, b.getScalarType()))
				throw new RuntimeException("Math operation with different operand type.");
		}

		switch (caso) {
		case (0): { // solo scalare
			if(!a.isNull()) {
				switch (ctx.op.getType()) {
				case (newVTLParser.PLUS): {
					return new Scalar(""+(a.asDouble() + b.asDouble()), a.getScalarType());
				}
				case (newVTLParser.MINUS): {
					return new Scalar(""+(a.asDouble() - b.asDouble()), a.getScalarType());
				}
				case (newVTLParser.MUL): {
					return new Scalar(""+(a.asDouble() * b.asDouble()), a.getScalarType());
				}
				case (newVTLParser.DIV): {
					if (b.asDouble() == 0)
						throw new RuntimeException("Division by ZERO!");

					return new Scalar(""+(a.asDouble() / b.asDouble()), a.getScalarType());
				}
				default: {
					throw new RuntimeException("Unknow math operator: " + ctx.op.getText());
				}
				}
			} else
				return new Scalar(a.getScalarType());
		}

		case (1): { // scalare, colonna
			DataPoint dp;
			Scalar stmp;
			for (int i = 0; i < dsb.getSize(); i++) {

				dp = dsb.getPoint(i); // prendi il punto
				// scegli la giusta operazione
				// e crea un nuovo scalare con il nuovo valore
				
				if(!dp.getValue(column).isNull()) {
					switch (ctx.op.getType()) {
					case (newVTLParser.PLUS): {
						stmp = new Scalar(""+dp.getValue(column).asDouble() + a.asDouble(),
								dp.getValue(column).getScalarType());
						break;
					}
					case (newVTLParser.MINUS): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() - a.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					case (newVTLParser.MUL): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() * a.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					case (newVTLParser.DIV): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() / a.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					default: {
						throw new RuntimeException("Unknow math operator: " + ctx.op.getText());
					}
					}
				} else
					stmp = new Scalar(dp.getValue(column).getScalarType());
				

				// imposta il nuovo valore nel datapoint
				dp.setValue(column, stmp);
				dsb.setPoint(i, dp); // impostail nuovo data point al posto del vecchio
			}
			return dsb;
		}

		case (2): { // colonna, scalare
			DataPoint dp;
			Scalar stmp;
			for (int i = 0; i < dsa.getSize(); i++) {

				dp = dsa.getPoint(i); // prendi il punto
				
				if(!dp.getValue(column).isNull()) {
					// scegli la giusta operazione
					// e crea un nuovo scalare con il nuovo valore
					switch (ctx.op.getType()) {
					case (newVTLParser.PLUS): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() + b.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					case (newVTLParser.MINUS): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() - b.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					case (newVTLParser.MUL): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() * b.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					case (newVTLParser.DIV): {
						stmp = new Scalar(""+(dp.getValue(column).asDouble() / b.asDouble()),
								dp.getValue(column).getScalarType());
						break;
					}
					default: {
						throw new RuntimeException("Unknow math operator: " + ctx.op.getText());
					}
					}
				} else
					stmp = new Scalar(dp.getValue(column).getScalarType());

				// imposta il nuovo valore nel datapoint
				dp.setValue(column, stmp);
				dsa.setPoint(i, dp); // impostail nuovo data point al posto del vecchio
			}
			return dsa;
		}

		default: {
			throw new RuntimeException("The operand has to be OR both Scalar OR one Scalar and one DataSet Column.");
		}
		}
		// return super.visitMathexpr(ctx);
	}
	
	
	//MATH FUNCTION
	
	
	@Override
	public VTLObj visitLogexpr(LogexprContext ctx) {
		//TODO CONTROLLI?!?!
		int base = ((Scalar) this.visit(ctx.integerLiteral()) ).asInteger();
		//TODO NOOOO DEVE FARLO PURE SUI DATASETTTT....
		Scalar value = (Scalar) this.visit(ctx.varname());
		
		if(!value.isNumber())
			throw new RuntimeException("LOG can't operate on non numerical value.");
		
		//TODO se intero, va aggiunto un Math.ceil al risultato
		return new Scalar(
				""+(Math.log(value.asDouble()) / Math.log(base)),
				value.getScalarType()
				);
		
		//return super.visitLogexpr(ctx);
	}


	@Override
	public VTLObj visitCeilFloorexpr(CeilFloorexprContext ctx) {
		Scalar value = (Scalar) this.visit(ctx.varname());
		if(!value.isNumber())
			throw new RuntimeException("CEIL/FLOOR can't operate on non numerical value.");
		
		if(ctx.op.getType() == newVTLParser.CEIL) {
			return new Scalar(
					""+Math.ceil(value.asDouble()),
					value.getScalarType()
					);
		} else if(ctx.op.getType() == newVTLParser.FLOOR) {
			return new Scalar(
					""+Math.floor(value.asDouble()),
					value.getScalarType()
					);
		} else {
			throw new RuntimeException("Unknown operator [" + ctx.op.getText()+"]");
		}
		
		//return super.visitCeilFloorexpr(ctx);
	}


	@Override
	public VTLObj visitRoundexpr(RoundexprContext ctx) {
		Scalar dbg = (Scalar) this.visit( ctx.integerLiteral() );
		int digit = dbg.asInteger();
		//TODO NOOOO DEVE FARLO PURE SUI DATASETTTT....
		Scalar value = (Scalar) this.visit(ctx.varname());
		
		if(!value.isNumber())
			throw new RuntimeException("ROUND can't operate on non numerical value.");
		
		if(digit<=0)
			throw new RuntimeException("ROUND digit has to be greater than 0");
		
		return new Scalar(
				""+(Math.round(value.asDouble() * Math.pow(10, digit)) / Math.pow(10, digit)),
				value.getScalarType()
				);

		//return super.visitRoundexpr(ctx);
	}



	@Override
	public VTLObj visitSingleparamMathfun(SingleparamMathfunContext ctx) {
		Scalar value = (Scalar) this.visit(ctx.varname());
		if(!value.isNumber())
			throw new RuntimeException("ABS/EXP/LN/SQRT can't operate on non numerical value.");
		
		switch(ctx.op.getType()) {
		case(newVTLParser.ABS):{
			return new Scalar(
					""+( (value.asDouble()<0)?(-value.asDouble()):value.asDouble() ),
					value.getScalarType()
					);
		}
		case(newVTLParser.EXP):{
			return new Scalar(
					""+Math.exp(value.asDouble()),
					value.getScalarType()
					);
		}
		case(newVTLParser.LOGN):{
			return new Scalar(
					""+Math.log(value.asDouble()),
					value.getScalarType()
					);
		}
		case(newVTLParser.SQRT):{
			return new Scalar(
					""+Math.sqrt(value.asDouble()),
					value.getScalarType()
					);
		}
		default:
			throw new RuntimeException("Unknown operator [" + ctx.op.getText()+"]");
		}
	}

	@Override
	public VTLObj visitDoubleparamMathfun(DoubleparamMathfunContext ctx) {
		int digit = ((Scalar) this.visit(ctx.integerLiteral()) ).asInteger();
		//TODO NOOOO DEVE FARLO PURE SUI DATASETTTT....
		Scalar value = (Scalar) this.visit(ctx.varname());
		
		if(!value.isNumber())
			throw new RuntimeException("TRUNC/POW/NROOT/MOD can't operate on non numerical value.");
		
		if(digit<0)
			throw new RuntimeException("2nd parameters has to be greater or equal than 0");
		
		switch(ctx.op.getType()) {
		case(newVTLParser.TRUNC):{
					//1.234 -> 234
			String newdigit = value.asString().substring(value.asString().indexOf(".")+1);
					
			//se il numero di cifre dopo la virgola è <= di quanto richiesto, torno la cifra direttamente
			if(digit>=newdigit.length())
				return value;
					
			newdigit = newdigit.substring(0, digit);
					
			return new Scalar(
				value.asString().substring(0, value.asString().indexOf(".")) + "." + newdigit,
				value.getScalarType()
			);
		}
		case(newVTLParser.POW):{
			return new Scalar(
					""+Math.pow(value.asDouble(),digit),
					value.getScalarType()
					);
		}
		case(newVTLParser.NROOT):{
			return new Scalar(
					""+Math.pow(
							value.asDouble(),
							(1/digit)		
							),
					value.getScalarType()
					);
		}
		case(newVTLParser.MOD):{
			return new Scalar(
					""+(value.asDouble()%digit),
					value.getScalarType()
					);
		}
		default:
			throw new RuntimeException("Unknown operator [" + ctx.op.getText()+"]");
		}
	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitRelationalCond(it.
	 * islandofcode.jvtllib.newparser.newVTLParser.RelationalCondContext)
	 */
	@Override
	public VTLObj visitRelationalCond(RelationalCondContext ctx) {
		LOG.fine("Valutazione RELATIONAL CONDITION");
		
		VTLObj left = this.visit(ctx.expr(0));
		VTLObj right = this.visit(ctx.expr(1));

		Scalar a = null, b = null;

		if (left == null || right == null)
			throw new RuntimeException("Relational operand cannot be null: left[" + left + "] OP right[" + right + "]");

		if (left.getObjType().equals(VTLObj.OBJTYPE.Scalar) && right.getObjType().equals(VTLObj.OBJTYPE.Scalar)) {
			a = (Scalar) left;
			b = (Scalar) right;
			if (!a.getScalarType().equals(b.getScalarType()))
				throw new RuntimeException("Relational op are possible ONLY if both operand have the same scalar type");
		}
		

			// me li preparo già da prima
			Scalar scatrue = Scalar.createBoolean(true);
			Scalar scafalse = Scalar.createBoolean(false);

			switch (ctx.op.getType()) {
			case (newVTLParser.EQ): {
				if (a.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					return (a.asBoolean() == b.asBoolean()) ? scatrue : scafalse;
				} else if (a.getScalarType().equals(Scalar.SCALARTYPE.Date)) {
					/*
					 * Converte la data in stringa, usando un formato a caso, e fa una comparazione
					 */
					return (a.asDate().getDateString(2).equals(b.asDate().getDateString(2))) ? scatrue : scafalse;
				} else if (a.isNumber()) {
					return (a.asDouble() == b.asDouble()) ? scatrue : scafalse;
				} else { // può essere solo una stringa
					return (a.asString().equals(b.asString())) ? scatrue : scafalse;
				}
			}
			case (newVTLParser.NE): {
				if (a.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					return (a.asBoolean() != b.asBoolean()) ? scatrue : scafalse;
				} else if (a.getScalarType().equals(Scalar.SCALARTYPE.Date)) {
					/*
					 * Converte la data in stringa, usando un formato a caso, e fa una comparazione
					 */
					return (!a.asDate().getDateString(2).equals(b.asDate().getDateString(2))) ? scatrue : scafalse;
				} else if (a.isNumber()) {
					return (a.asDouble() != b.asDouble()) ? scatrue : scafalse;
				} else { // può essere solo una stringa
					return (!a.asString().equals(b.asString())) ? scatrue : scafalse;
				}
			}
			case (newVTLParser.LT): {
				if (a.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					throw new RuntimeException("Relational op [LesserThan] not applicable with Boolean type");
				} else if (a.getScalarType().equals(Scalar.SCALARTYPE.Date)) {
					return (a.asDate().getDate().before(b.asDate().getDate())) ? scatrue : scafalse;
				} else if (a.isNumber()) {
					return (a.asDouble() < b.asDouble()) ? scatrue : scafalse;
				} else { // può essere solo una stringa
					return (a.asString().compareTo(b.asString()) < 0) ? scatrue : scafalse;
				}
			}
			case (newVTLParser.GT): {
				if (a.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					throw new RuntimeException("Relational op [GreaterThan] not applicable with Boolean type");
				} else if (a.getScalarType().equals(Scalar.SCALARTYPE.Date)) {
					return (a.asDate().getDate().after(b.asDate().getDate())) ? scatrue : scafalse;
				} else if (a.isNumber()) {
					return (a.asDouble() > b.asDouble()) ? scatrue : scafalse;
				} else { // può essere solo una stringa
					return (a.asString().compareTo(b.asString()) > 0) ? scatrue : scafalse;
				}
			}
			case (newVTLParser.LE): {
				if (a.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					throw new RuntimeException("Conditional op [LesserEquals] not applicable with Boolean type");
				} else if (a.getScalarType().equals(Scalar.SCALARTYPE.Date)) {
					return (a.asDate().getDate().before(b.asDate().getDate())
							|| a.asDate().getDateString(2).equals(b.asDate().getDateString(2))) ? scatrue : scafalse;
				} else if (a.isNumber()) {
					return (a.asDouble() <= b.asDouble()) ? scatrue : scafalse;
				} else { // può essere solo una stringa
					return (a.asString().compareTo(b.asString()) <= 0) ? scatrue : scafalse;
				}
			}
			case (newVTLParser.GE): {
				if (a.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					throw new RuntimeException("Relational op [GreaterEquals] not applicable with Boolean type");
				} else if (a.getScalarType().equals(Scalar.SCALARTYPE.Date)) {
					return (a.asDate().getDate().after(b.asDate().getDate())
							|| a.asDate().getDateString(2).equals(b.asDate().getDateString(2))) ? scatrue : scafalse;
				} else if (a.isNumber()) {
					return (a.asDouble() >= b.asDouble()) ? scatrue : scafalse;
				} else { // può essere solo una stringa
					return (a.asString().compareTo(b.asString()) >= 0) ? scatrue : scafalse;
				}
			}
			default: {
				// non dovrei mai arrivare qui...
				throw new RuntimeException("Unknow Relational operator: " + ctx.op.getText());
			}
			}// fine switch per i tipi del caso 0

		// return super.visitRelationalCond(ctx);
	}

	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitIsNullCondexpr(it.islandofcode.jvtllib.newparser.newVTLParser.IsNullCondexprContext)
	 */
	@Override
	public VTLObj visitIsNullCondexpr(IsNullCondexprContext ctx) {
		LOG.fine("Valutazione ISNULL CONDITION");
		VTLObj R = this.visit(ctx.expr());
		boolean not = (ctx.NOT(0)!=null)?true:false;
		if(R instanceof Scalar) {
			
			if( ((Scalar)R).isNull() )
				return Scalar.createBoolean(true^not);
			else
				return Scalar.createBoolean(false^not);
			
		} else 
			throw new RuntimeException("ISNULL operator allowed only on Scalar object.");
		//return super.visitIsNullCondexpr(ctx);
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitInCondexpr(it.islandofcode.jvtllib.newparser.newVTLParser.InCondexprContext)
	 */
	@Override
	public VTLObj visitInCondexpr(InCondexprContext ctx) {
		LOG.fine("Valutazione IN CONDITION");
		VTLObj R = this.visit(ctx.varname());
		List<LiteralContext> LL = ctx.literal();
		boolean not = (ctx.NOT()!=null)?true:false;
		Scalar column,tmp;
		if(R instanceof Scalar) {
			column = (Scalar)R;
			for(LiteralContext I : LL) {
				tmp = new Scalar(I.getText());
				if(tmp.isNumber() && column.isNumber()) {
					if(tmp.asDouble()==column.asDouble())
						return Scalar.createBoolean(true^not);
				} else if(tmp.asString().equals(column.asString())) {
					return Scalar.createBoolean(true^not);
				}
			}
		} else 
			throw new RuntimeException("IN operator allowed only on Scalar object.");
		return Scalar.createBoolean(false^not);
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitCondexpr(it.islandofcode.jvtllib.newparser.newVTLParser.CondexprContext)
	 */
	@Override
	public VTLObj visitLogicalexpr(LogicalexprContext ctx) {
		LOG.fine("Valutazione AND/OR CONDITION");
		/*
		 * 				    TABLE OF TRUTH
		 *			    1 TRUE, 0 FALSE, N NULL
		 * 
		 * 		| X | Y | X and Y | X or Y | X xor Y |
		 * 		| 1 | 1 |    1    |    1   |    0    |
		 * 		| 1 | 0 |    0    |    1   |    1    |
		 * 		| 1 | N |    N    |    1   |    N    |
		 * 		--------------------------------------
		 * 		| 0 | 1 |    0    |    1   |    1    |
		 * 		| 0 | 0 |    0    |    0   |    0    |
		 * 		| 0 | N |    0    |    N   |    N    |
		 * 		--------------------------------------
		 * 		| N | 1 |    N    |    1   |    N    |
		 * 		| N | 0 |    0    |    N   |    N    |
		 * 		| N | N |    N    |    N   |    N    |
		 */
		
		if(ctx.op == null)
			throw new RuntimeException("Missing conditional operator AND/OR/XOR.");
		
		//fai controllo su tipo, deve essere scalare.
		
		Scalar left = (Scalar) this.visit(ctx.left);
		Scalar right = (Scalar) this.visit(ctx.right);
		
		if(left==null || right==null)
			throw new RuntimeException("Conditional operand can't be null. Can, however, be a Scalar NULL.");
		
		if(left.isNull() && right.isNull())
			return new Scalar(Scalar.SCALARTYPE.Boolean); //ritorna un booleano nullo
		
		switch(ctx.op.getType()) {
		case(newVTLParser.AND):{
			if(!left.isNull() && left.asBoolean()) { //X TRUE
				if(!right.isNull() && right.asBoolean()) { //Y TRUE
					return Scalar.createBoolean(true);
				} else if (!right.isNull() && !right.asBoolean()) { //Y FALSE
					return Scalar.createBoolean(false);
				} else if(right.isNull()) { //Y NULL
					return new Scalar(Scalar.SCALARTYPE.Boolean);
				}
				
			} if(!left.isNull() && !left.asBoolean()) { //X FALSE
				return Scalar.createBoolean(false);
				
			} else if(left.isNull()) { //X NULL
				if(!right.asBoolean()) { //Y FALSE
					return Scalar.createBoolean(false);
				} else { //Y TRUE E NULL
					return new Scalar(Scalar.SCALARTYPE.Boolean);
				}
			}
		}//AND CASE
		case(newVTLParser.OR):{
			if(!left.isNull() && left.asBoolean()) { //X TRUE
				return Scalar.createBoolean(true);
			} if(!left.isNull() && !left.asBoolean()) { //X FALSE
				if(!right.isNull() && right.asBoolean()) { //Y TRUE
					return Scalar.createBoolean(true);
				} else if (!right.isNull() && !right.asBoolean()) { //Y FALSE
					return Scalar.createBoolean(false);
				} else if(right.isNull()) { //Y NULL
					return new Scalar(Scalar.SCALARTYPE.Boolean);
				}
			} else if(left.isNull()) { //X NULL
				if(right.asBoolean()) { //Y TRUE
					return Scalar.createBoolean(false);
				} else { //Y FALSE E NULL
					return new Scalar(Scalar.SCALARTYPE.Boolean);
				}
			}
		}//OR CASE
		default:
			throw new RuntimeException("Conditional operator has to be AND/OR.");
		}
		
		
		
		//return super.visitCondexpr(ctx);
	}


	
	

	@Override
	public VTLObj visitVarname(VarnameContext ctx) {
		LOG.finest("Found VARIABLE " + ctx.getText());
		if (MEMORY.containsKey(ctx.getText())) { // se la variabile esiste in memoria
			return CLONER.deepClone( MEMORY.get(ctx.getText()) ); // ritorna l'oggetto associato
		} else {
			return null;
			//throw new RuntimeException("No variable found with this name! ");
		}
		// return super.visitVarname(ctx);
	}

	@Override
	public VTLObj visitVarmember(VarmemberContext ctx) {
		LOG.finest("Found MEMBER " + ctx.right.getText());
		//verifica se, per caso, esista una variabile del tipo "ds UNDERSCORE column" (es. ds1_NAME) in memoria
		if(MEMORY.get(ctx.left.getText()+"_"+ctx.right.getText()) != null)
			return MEMORY.get(ctx.left.getText()+"_"+ctx.right.getText());
		// se il dataset non esiste in memoria, eccezione
		if (MEMORY.get(ctx.left.getText()) == null) {
			throw new RuntimeException("No DataSet found with this name in memory");
		}
		// se esiste una var con questo nome ma non è un dataset, eccezione
		if (!MEMORY.get(ctx.left.getText()).getObjType().equals(VTLObj.OBJTYPE.DataSet))
			throw new RuntimeException("The parent of the member parameter isn't a DataSet");
		// il dataset esiste
		// verifica se c'è correlazione
		if (!DataSetColumn.checkIfContain((DataSet) MEMORY.get(ctx.left.getText()), ctx.right.getText())) {
			throw new RuntimeException("The member parameter isn't part of the parent DataSet");
		}
		// c'è correlazione, quindi ritorno l'oggetto relativo
		return new DataSetColumn(ctx.left.getText(), ctx.right.getText());

		// return super.visitVarmember(ctx);
	}

	@Override
	public VTLObj visitLiteral(LiteralContext ctx) {
		Scalar sca = new Scalar(ctx.getText());

		LOG.finest("Found LITERAL " + ctx.getText() + " type[" + sca.getScalarType() + "]");
		// return super.visitLiteral(ctx);
		return sca;
	}
	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitIntegerLiteral(it.islandofcode.jvtllib.newparser.newVTLParser.IntegerLiteralContext)
	 */
	@Override
	public VTLObj visitIntegerLiteral(IntegerLiteralContext ctx) {
		Scalar sca = new Scalar(ctx.getText(), Scalar.SCALARTYPE.Integer);

		LOG.finest("Found INTEGER LITERAL " + ctx.getText() + " type[" + sca.getScalarType() + "]");
		// return super.visitLiteral(ctx);
		return sca;
	}
	
	
	/* FUNZIONI STRINGHE */
	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitStringLiteral(it.islandofcode.jvtllib.newparser.newVTLParser.StringLiteralContext)
	 */
	@Override
	public VTLObj visitStringLiteral(StringLiteralContext ctx) {
		Scalar sca = new Scalar(ctx.getText(), Scalar.SCALARTYPE.String);

		LOG.finest("Found STRING LITERAL " + ctx.getText() + " type[" + sca.getScalarType() + "]");
		// return super.visitLiteral(ctx);
		return sca;
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitStringFunSubstr(it.islandofcode.jvtllib.newparser.newVTLParser.StringFunSubstrContext)
	 */
	@Override
	public VTLObj visitStringFunSubstr(StringFunSubstrContext ctx) {
		VTLObj expr = this.visit(ctx.expr());
		Scalar str = null;
		
		if( !(expr instanceof Scalar) )
			throw new RuntimeException("SUBSTR accept only Scalar.");
		
		if( ((Scalar)expr).getScalarType().equals(Scalar.SCALARTYPE.String) )
			str = (Scalar)expr;
		else 
			throw new RuntimeException("SUBSTR accept only String");
		
		int start = -1, len = -1;
		
		//ho indicato solo un parametro integerliteral
		if(ctx.integerLiteral().size()>0) {
			start = ( (Scalar)this.visit(ctx.integerLiteral(0)) ).asInteger();
			if(start<0 || start>str.asString().length())
				throw new RuntimeException("SUBSTR start index out of bound!");
		} else {
			throw new RuntimeException("SUBSTR need at least the start index.");
		}
		
		//ho indicato due  parametri
		if(ctx.integerLiteral().size()>1) {
			len = ( (Scalar)this.visit(ctx.integerLiteral(1)) ).asInteger();
			if(len<0 || len>str.asString().length()) {
				throw new RuntimeException("SUBSTR lenght value out of bound!");
			} else if((start+len)>str.asString().length())
				len = -1;
			//Come da specifiche, se start+len > len stringa originaria, ignoro parametro len
		}
		
		//se ho indicato start=0 ma non l'end
		//oppure start+end = len stringa
		//torna la stringa originale
		if(start==0 && (len<0 || (start+len)==str.asString().length()) )
			return str;
		
		if(start>=0 && len<0) {
			//da start alla fine della stringa
			return new Scalar(
					str.asString().substring(start),
					Scalar.SCALARTYPE.String
					);
		} else {
			//da start a lunghezza
			return new Scalar(
					str.asString().substring(start,start+len),
					Scalar.SCALARTYPE.String
					);
		}

		//return super.visitStringFunSubstr(ctx);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitStringConcatVar(it.islandofcode.jvtllib.newparser.newVTLParser.StringConcatVarContext)
	 */
	@Override
	public VTLObj visitStringConcat(StringConcatContext ctx) {
		Scalar a = ((Scalar)this.visit(ctx.a));
		Scalar b = ((Scalar)this.visit(ctx.b));
		
		if(a.getScalarType().equals(Scalar.SCALARTYPE.String) && b.getScalarType().equals(Scalar.SCALARTYPE.String)) {
			return new Scalar(a.asString()+b.asString(), Scalar.SCALARTYPE.String);
		} else
			throw new RuntimeException("CONCAT need two string.");
	}

	/* VISITOR PER DEFINE DATAPOINT RULESET */
	//Ingresso della definizione della ruleset
	@Override
	public VTLObj visitDpruleset(DprulesetContext ctx) {
		//ctx.varname(0).getText() questo è il nome del ruleset
		//ctx.varname(i).getText() con 1<i<N sono i nomi di colonna
		
		//this.visit(ctx.dprulesetblock()); visita il blocco delle regole
		LOG.fine("RULESET ["+ctx.varname(0).getText()+"]");
		
		ArrayList<String> col = new ArrayList<String>();
		for(int i=1; i<ctx.varname().size(); i++) {
			LOG.finest("COLONNA ["+ctx.varname(i).getText()+"] AGGIUNTA");
			col.add(ctx.varname(i).getText());
		}
		
		DPRuleset rs = new DPRuleset(ctx.varname(0).getText(),col);
		
		for(int i=0; i<ctx.singlerule().size(); i++) {
			rs.addRule(ctx.singlerule(i));
			LOG.finest("REGOLA ["+ctx.singlerule(i).getText()+"] AGGIUNTA");
		}
		
		this.MEMORY.put(ctx.varname(0).getText(), rs);
		//return super.visitDpruleset(ctx);
		
		//questo serve per evitare di visitare di nuovo i figli (quindi le regole)
		return null;
	}
	
	

	//blocco delle regole.

	@Override
	public VTLObj visitSingleruleConsequenceOnly(SingleruleConsequenceOnlyContext ctx) {
		
		LOG.finest("EVAL SINGLERULE CONSEQUENCEONLY["+ctx.varname().getText()+"] IN CORSO");
		String err = "";
		if(ctx.errorCode()!=null) {
			if(ctx.errorCode().literal()!=null)
				err = ctx.errorCode().literal().getText();
		}
		
		
		if(!ctx.booleanLiteral().getText().equals("true")) {
			throw new RuntimeException("Antecedent condition cannot be a literal false. Only literal true or condition are allowed.");
		}
		
		VTLObj expr = this.visit(ctx.expr());
		
		if(expr instanceof Scalar)
			if(((Scalar)expr).getScalarType().equals(Scalar.SCALARTYPE.Boolean))
				if( !((Scalar)expr).asBoolean() ) {
					this.MEMORY.put("ErrMsg", new Scalar(err,Scalar.SCALARTYPE.String));//ctx.errorCode().literal().getText(),Scalar.SCALARTYPE.String));
					return Scalar.createBoolean(false);
				} else 
					return Scalar.createBoolean(true);
		
		throw new RuntimeException("The rule is not valid. Rule have to return a boolean!");
	}

	@Override
	public VTLObj visitSingleruleBoth(SingleruleBothContext ctx) {
		LOG.finest("EVAL SINGLERULE BOTH["+ctx.varname().getText()+"] IN CORSO");
		String err = "";
		if(ctx.errorCode()!=null) {
			if(ctx.errorCode().literal()!=null)
				err = ctx.errorCode().literal().getText();
		}
		
		VTLObj antexp = this.visit(ctx.expr(0));
		VTLObj conexp = this.visit(ctx.expr(1));
		
		if( (antexp instanceof Scalar) && (conexp instanceof Scalar)) { //se sono scalari
			Scalar a = (Scalar)antexp;
			Scalar c = (Scalar)conexp;
			
			if( ((Scalar) a).getScalarType().equals(Scalar.SCALARTYPE.Boolean) ) { //se ant è un bool
				if( !a.asBoolean() ) { //precondizione fallita, ignoro la regola.
					//this.MEMORY.put("ErrMsg", new Scalar(err,Scalar.SCALARTYPE.String));//ctx.errorCode().literal().getText(),Scalar.SCALARTYPE.String));
					return Scalar.createBoolean(true);
				} else { //se l'antecedente non ha ritornato false, verifico il conseguente
					if( c.getScalarType().equals(Scalar.SCALARTYPE.Boolean) ) //se cons è un bool
						if( !c.asBoolean() ) { //condizione fallita, torna errore
							this.MEMORY.put("ErrMsg", new Scalar(err,Scalar.SCALARTYPE.String));//ctx.errorCode().literal().getText(),Scalar.SCALARTYPE.String));
							return Scalar.createBoolean(false);
						} else
							return Scalar.createBoolean(true);
				}
				
				//qualche altro controllo qui?
				
			}
		}
		
		throw new RuntimeException("The rule is not valid. Rule have to return a boolean!");
		
		//return null;
		//return super.visitSingleruleBoth(ctx);
	}
	
	/* FINE VISITOR PER DEFINE DATAPOINT RULESET */

	/* VISITOR PER FUNZIONE CHECK */

	//SOLO DATASET E RULESET
	@Override
	public VTLObj visitCheckFunBase(CheckFunBaseContext ctx) {
		DataSet ds = (DataSet) CLONER.deepClone(this.MEMORY.get(ctx.varname(0).getText()));
		
		//creo una lista di ruleset e li recupero dalla memoria
		ArrayList<DPRuleset> LDPR = new ArrayList<>();
		//parto da 1, perchè il primo è il dataset, OVVIO!
		for(int i=1; i<ctx.varname().size(); i++) {
			LDPR.add((DPRuleset) CLONER.deepClone( this.MEMORY.get(ctx.varname(i).getText())) );
		}
		
		stack.push(CLONER.deepClone(MEMORY));
		this.MEMORY = new HashMap<String, VTLObj>();
		this.MEMORY.clear();
		
		
		/*
		 * Come visitCheckFunWithOpt, ma con (not valid,condition) come opzioni di default
		 */
		LOG.fine("Valutazione CHECKFUNBASE");
		//recupero datastructure e aggiungo colonna errormessage
		DataStructure dstr = ds.getDataStructure();
		dstr.putComponent("ERRORMESSAGE", new Scalar(Scalar.SCALARTYPE.String), DataStructure.type.Attribute);
		dstr.putComponent("CONDITION", new Scalar(Scalar.SCALARTYPE.Boolean), DataStructure.type.Measure);
		dstr.putComponent("RULE_ID", new Scalar(Scalar.SCALARTYPE.String), DataStructure.type.Attribute);
		
		DataSet ret = null;
			ret = new DataSet(
					ds.getName()+"_check",
					ds.getDescription(),
					dstr,
					false
					);
		
		//un datapoint vuoto che userò come var d'appoggio
		DataPoint dp = null;
		int numFailed = 0;
		Scalar ErrMsg, ErrID;
		
		//ciclo su tutte le righe del dataset
		for(int i=0; i<ds.getSize(); i++) {
			//resetto contatori
			numFailed = 0;
			ErrMsg = new Scalar(Scalar.SCALARTYPE.String);
			ErrID = new Scalar(Scalar.SCALARTYPE.String);
			this.MEMORY.put("ErrMsg", ErrMsg);
			//ciclo sui ruleset presenti nella lista
			for(DPRuleset RS : LDPR) {
				
				//prima di tutto, popolo le colonne da usare per la regola corrente in memoria
				for(String C : RS.getColums()) {
					this.MEMORY.put(C, ds.getPoint(i).getValue(C));
				}
				
				//ciclo sulle SingleRule
				for(SingleruleContext SRC : RS.getRuleContexts()) {
					/* Se fallisce anche una sola regola
					 * incremento contatore e spezzo il ciclo 
					 */
					if( !((Scalar) this.visit(SRC)).asBoolean() ) {
						//if(ErrMsg.asString().isEmpty()) continue;
						numFailed++;
						ErrID = new Scalar(RS.getRuleId()+"_"+SRC.getChild(0).getText(), Scalar.SCALARTYPE.String);
						break;
					}
				}
				//esco al primo errore.
				if(numFailed>0)
					break;
			}
			
			/*
			 * In caso di fallimento, ritorno il primo errorcode
			 * (del primo SingleRule)
			 * del primo ruleset che ha generato errore.
			 */
			
			ErrMsg = (Scalar) this.MEMORY.get("ErrMsg");
			//se ho avuto uno o più fallimenti
			if(numFailed>0) {
				dp = ds.getPoint(i); //recupero un datapoint
				
				if(numFailed>1) //messaggio generico
					ErrMsg = new Scalar("More than one rule have failed.",Scalar.SCALARTYPE.String);
				
				dp.setValue("ERRORMESSAGE", ErrMsg);
				dp.setValue("CONDITION", Scalar.createBoolean(false));
				dp.setValue("RULE_ID", ErrID);
				ret.setPoint(dp);
			}
			//questa riga ha passato i controlli quindi la scarto
		}
		
		this.MEMORY = null;
		this.MEMORY = this.stack.pop();
		return ret;
		//return super.visitCheckFunBase(ctx);
	}

	//DATASET, RULESET e OPZIONI
	@Override
	public VTLObj visitCheckFunWithOpt(CheckFunWithOptContext ctx) {
		DataSet ds = (DataSet) CLONER.deepClone(this.MEMORY.get(ctx.varname(0).getText()));
		
		//creo una lista di ruleset e li recupero dalla memoria
		ArrayList<DPRuleset> LDPR = new ArrayList<>();
		//parto da 1, perchè il primo è il dataset, OVVIO!
		for(int i=1; i<ctx.varname().size(); i++) {
			LDPR.add((DPRuleset) CLONER.deepClone( this.MEMORY.get(ctx.varname(i).getText())) );
		}
		
		stack.push(CLONER.deepClone(MEMORY));
		Map<String, VTLObj> MEMORY = new HashMap<String, VTLObj>();
		MEMORY.clear();
		
		LOG.fine("Valutazione CHECKFUNWITHOPT ["+ctx.checkParamEnum().getText()+"]["+ctx.checkParamOpt().getText()+"]");

		//***********************verifico presenza e compatibilità opzioni
		//questo if viene chiamato solo se uno dei due è assente
		//se mancano entrambi, viene chiamato visitCheckFunBase.
		if(ctx.checkParamEnum().getText().replace(",", "").isEmpty() || ctx.checkParamOpt().getText().replace(",", "").isEmpty()) {
			throw new RuntimeException("Check() need both option specified.");
		}
		
		if(ctx.checkParamEnum().ALL()!=null && ctx.checkParamOpt().MEASURES()!=null) {
			throw new RuntimeException("Incompatible check() option: can't use [ALL] with [MEASURES]");
		}
		
		//recupero datastructure e aggiungo colonna errormessage
		DataStructure dstr = ds.getDataStructure();
		dstr.putComponent("ERRORMESSAGE", new Scalar(Scalar.SCALARTYPE.String), DataStructure.type.Attribute);
		if(ctx.checkParamOpt().CONDITION() != null) {
			dstr.putComponent("CONDITION", new Scalar(Scalar.SCALARTYPE.Boolean), DataStructure.type.Measure);
		}
		dstr.putComponent("RULE_ID", new Scalar(Scalar.SCALARTYPE.String), DataStructure.type.Attribute);
		
		DataSet ret = null;
			ret = new DataSet(
					ds.getName()+"_checked",
					ds.getDescription(),
					dstr,
					false
					);
		
		//un datapoint vuoto che userò come var d'appoggio
		DataPoint dp = null;
		int numFailed = 0;
		Scalar ErrMsg, ErrID;
		
		//ciclo su tutte le righe del dataset
		for(int i=0; i<ds.getSize(); i++) {
			//resetto contatori
			numFailed = 0;
			ErrID = ErrMsg = new Scalar(Scalar.SCALARTYPE.String);
			this.MEMORY.put("ErrMsg", ErrMsg);
			
			//ciclo sui ruleset presenti nella lista
			for(DPRuleset RS : LDPR) {	
				//prima di tutto, popolo le colonne da usare per la regola corrente in memoria
				for(String C : RS.getColums()) {
					this.MEMORY.put(C, ds.getPoint(i).getValue(C));
				}
				
				//ciclo sulle SingleRule
				for(SingleruleContext SRC : RS.getRuleContexts()) {
					/* Se fallisce anche una sola regola
					 * incremento contatore e spezzo il ciclo 
					 */
					if( !((Scalar) this.visit(SRC)).asBoolean() ) {
						//if(ErrMsg.asString().isEmpty()) continue;
						numFailed++;
						ErrID = new Scalar(RS.getRuleId()+"_"+SRC.getChild(0).getText(), Scalar.SCALARTYPE.String);
						break;
					}
				}
			}
			
			dp = ds.getPoint(i); //recupero un datapoint
			dp.setValue("RULE_ID", ErrID);
			
			ErrMsg = (Scalar) this.MEMORY.get("ErrMsg");
			//se ho avuto uno o più hit
			if(numFailed>0) {
				
				if(numFailed>1) //messaggio generico
					ErrMsg = new Scalar("More than one rule have failed.",Scalar.SCALARTYPE.String);
				
				dp.setValue("ERRORMESSAGE", ErrMsg);
				
				if(ctx.checkParamOpt().CONDITION() != null) {
					dp.setValue("CONDITION", Scalar.createBoolean(false));
				}
			} else {
				//nessuna regola ha fallito
				dp.setValue("ERRORMESSAGE", new Scalar("",Scalar.SCALARTYPE.String));
				
				if(ctx.checkParamOpt().CONDITION() != null) {
					dp.setValue("CONDITION", Scalar.createBoolean(true));
				}
			}
			
			if(ctx.checkParamEnum().VALID() != null && numFailed<=0) {
				ret.setPoint(dp);
			} else if(ctx.checkParamEnum().NVALID() != null && numFailed>0) {
				ret.setPoint(dp);
			} else if(ctx.checkParamEnum().ALL() != null) {
				ret.setPoint(dp);
			} else {
				continue;
			}
		}//fine for sulle righe
		
		this.MEMORY = null;
		this.MEMORY = this.stack.pop();
		return ret;
		//return super.visitCheckFunWithOpt(ctx);
	}

	/* FINE VISITOR PER FUNZIONE CHECK */
	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClausefun(it.islandofcode.jvtllib.newparser.newVTLParser.ClausefunContext)
	 */
	@Override
	public VTLObj visitClausebase(ClausebaseContext ctx) {
		/*
		 * 1-Push memory nello stack
		 * 2-popola nuova memoria con contenuto datastruct del dataset
		 * 3-visita clausebody
		 * 4-clausebody ritorna un dataset modificato
		 * 4a sostituisce workDS con il dataset modificato
		 * 4b ripeti 3-4 fino a quando non terminano i body.
		 * 5-ripristina la memoria
		 * 6-ritorna il dataset
		 */
		
		DataSet ds = (DataSet) CLONER.deepClone(this.visit(ctx.varname()));
		
		if(ds==null)
			throw new RuntimeException("Can't find [" + ctx.varname().getText() +"] in memory.");
		
		stack.push(CLONER.deepClone(MEMORY));
		this.MEMORY = new HashMap<String, VTLObj>();
		this.MEMORY.clear();
		this.MEMORY.put(ctx.varname().getText(), ds);
		/* questa var contiene il nome del data set.
		 * Si rende necessario perchè altrimenti dovremmo scorrere tutte le var per trovare il dataset.
		 * Ma se facciamo più di un clausebody, potremmo avere più di un dataset.
		 * Se invece usiamo JOIN, all'interno forziamo solo varmember e quindi non abbiamo più la necessità
		 * di questa variabile.
		 */
		
		DataSet tmp = null;
		for(int i=0; i<ctx.clausebody().size(); i++) {
			this.MEMORY.put("workDS", new Scalar(ctx.varname().getText(), Scalar.SCALARTYPE.String));
			tmp = (DataSet) this.visit(ctx.clausebody(i));
			
			if(tmp==null)
				throw new RuntimeException("Clause body return null.");
			
			//ripristino la memoria per un'eventuale prossima iterazione
			this.MEMORY.clear();
			this.MEMORY.put(ctx.varname().getText(), tmp);
		}
		
		this.MEMORY = null;
		this.MEMORY = this.stack.pop();
		return tmp;
	}
	

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClausejoin(it.islandofcode.jvtllib.newparser.newVTLParser.ClausejoinContext)
	 */
	@Override
	public VTLObj visitClausejoin(ClausejoinContext ctx) {
		
		DataSet joined = (DataSet) this.visit(ctx.joinblock());
		String refA = ((Scalar)this.MEMORY.get("refA")).asString()+"_";
		String refB = ((Scalar)this.MEMORY.get("refB")).asString()+"_";
		String prefixEx = "("+refA+"|"+refB+")";
		
		stack.push(CLONER.deepClone(MEMORY));
		this.MEMORY = new HashMap<String, VTLObj>();
		this.MEMORY.clear();
		this.MEMORY.put(joined.getName(), joined);
		
		DataSet tmp = null;
		for(int i=0; i<ctx.clausebody().size(); i++) {
			this.MEMORY.put("workDS", new Scalar(joined.getName(), Scalar.SCALARTYPE.String));
			tmp = (DataSet) this.visit(ctx.clausebody(i));
			
			if(tmp==null)
				throw new RuntimeException("Clause body return null.");
			
			//ripristino la memoria per un'eventuale prossima iterazione
			this.MEMORY.clear();
			this.MEMORY.put(joined.getName(), tmp);
		}
		
		//rimuovi prefissi alle colonne per ripristinare lo stato originale
		DataStructure tdstr = new DataStructure(tmp.getDataStructure().getName());
		for(String K : tmp.getDataStructure().getKeys()) {
			tdstr.putComponent(
					tmp.getDataStructure().getComponent(K).getId().replaceFirst(prefixEx, ""),
					tmp.getDataStructure().getComponent(K).getDataType(),
					tmp.getDataStructure().getComponent(K).getType()
					);
		}
		DataSet ret = new DataSet(tmp.getName(), tmp.getDescription(), tdstr, false);
		DataPoint dp = null;
		for(int r=0; r<tmp.getSize(); r++) {
			dp = new DataPoint();
			for(String P : tmp.getPoint(r).getKeys()) {
				dp.setValue(P.replaceFirst(prefixEx, ""), tmp.getPoint(r).getValue(P));
			}
			ret.setPoint(dp);
		}
		
		this.MEMORY = null;
		this.MEMORY = this.stack.pop();
		return ret;
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitJoinblockInner(it.islandofcode.jvtllib.newparser.newVTLParser.JoinblockInnerContext)
	 */
	@Override
	public VTLObj visitJoinblockInner(JoinblockInnerContext ctx) {
		if(ctx.stringLiteral().size()!=2)
			throw new RuntimeException("You have to aliases both DataSet in Join Clause.");
		
		if(ctx.varname().size()!=2)
			throw new RuntimeException("JOIN need exactly 2 DataSet as input.");
		
		VTLObj tmp = this.MEMORY.get(ctx.varname(0).getText());
		if( !(tmp instanceof DataSet))
			throw new RuntimeException("Parameter 1 of INNER has to be a valid DataSet.");
		DataSet A = (DataSet) this.MEMORY.get(ctx.varname(0).getText());
		
		tmp = this.MEMORY.get(ctx.varname(1).getText());
		if( !(tmp instanceof DataSet))
			throw new RuntimeException("Parameter 2 of INNER has to be a valid DataSet.");
		DataSet B = (DataSet) this.MEMORY.get(ctx.varname(1).getText());

		tmp = null;
		
		stack.push(CLONER.deepClone(MEMORY));
		this.MEMORY = new HashMap<String, VTLObj>();
		this.MEMORY.clear();
		
		//riferimenti ai nomi dei DS
		String refA = ((Scalar)this.visit(ctx.stringLiteral(0))).asString();
		String refB = ((Scalar)this.visit(ctx.stringLiteral(1))).asString();
		
		this.MEMORY.put(
				refA
				//(ctx.stringLiteral().size()==2)?((Scalar)this.visit(ctx.stringLiteral(0))).asString():"workDS_A"
				, A);
		this.MEMORY.put(
				refB
				//(ctx.stringLiteral().size()==2)?((Scalar)this.visit(ctx.stringLiteral(1))).asString():"workDS_B"
				, B);
		
		DataStructure dstr = A.getDataStructure();
		DataStructure ndstr = new DataStructure(dstr.getName()+"_"+B.getDataStructure().getName());
		for(String k : dstr.getKeys()) {
			ndstr.putComponent(refA+"_"+dstr.getComponent(k).getId(), dstr.getComponent(k).getDataType(), dstr.getComponent(k).getType());
		}
		dstr = B.getDataStructure();
		for(String k2 : dstr.getKeys()) {
			if(!ndstr.containtComponent(k2))
				ndstr.putComponent(refB+"_"+dstr.getComponent(k2).getId(), dstr.getComponent(k2).getDataType(), dstr.getComponent(k2).getType());
		}
		dstr = null;
		
		// DataStructure popolato
		// Creo DataSet
		DataSet ds = null;

			ds = new DataSet(A.getName()+"_"+B.getName(), "inner joined dataset", ndstr, false);
			DataPoint dpA = null,dpB = null, dpR = null;
			for(int a=0; a<A.getSize(); a++) {
				dpR = new DataPoint();
				dpA = A.getPoint(a);
				//esplodo A in memoria
				//aggiungo il riferimento al DS come prefisso.
				for(String K : dpA.getKeys()) {
					this.MEMORY.put(refA+"_"+K, dpA.getValue(K));
					dpR.setValue(refA+"_"+K, dpA.getValue(K));
				}
				for(int b=0; b<B.getSize(); b++) {
					dpB = B.getPoint(b);
					//esplodo B in memoria
					//aggiungo il riferimento al DS come prefisso.
					for(String K2 : dpB.getKeys()) {
						this.MEMORY.put(refB+"_"+K2, dpB.getValue(K2));
						//NB le chiavi di B vengono sovrascritte ad ogni iterazione!
						dpR.setValue(refB+"_"+K2, dpB.getValue(K2));
					}
					//Verifico ora le condizioni
					tmp = this.visit(ctx.expr());
					if(tmp instanceof Scalar)
						if( ((Scalar)tmp).getScalarType().equals(Scalar.SCALARTYPE.Boolean) ){
							if(((Scalar)tmp).asBoolean()){
								ds.setPoint(dpR);
								continue;
							}
						} else
							throw new RuntimeException("The condition expression has to return a Scalar Boolean.");
					else
						throw new RuntimeException("The condition expression has to return a Scalar.");
				}//for B
				
			}//for A
			
		
		this.MEMORY = null;
		this.MEMORY = this.stack.pop();
		this.MEMORY.put("refA", new Scalar(refA));
		this.MEMORY.put("refB", new Scalar(refB));
		
		return ds;
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitJoinblockLeft(it.islandofcode.jvtllib.newparser.newVTLParser.JoinblockLeftContext)
	 */
	@Override
	public VTLObj visitJoinblockLeft(JoinblockLeftContext ctx) {
		// TODO Auto-generated method stub
		return super.visitJoinblockLeft(ctx);
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClauseKeepRename(it.islandofcode.jvtllib.newparser.newVTLParser.ClauseKeepRenameContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public VTLObj visitClauseKeepRename(ClauseKeepRenameContext ctx) {
		String ref = ((Scalar) this.MEMORY.get("workDS")).asString();
		//inserisco in memoria l'operazione richiesta
		this.MEMORY.put("opToken", new Scalar(ctx.op.getText().toLowerCase()));
		
		//recupero datastructure
		DataStructure dstr = CLONER.deepClone( ((DataSet)this.MEMORY.get(ref)).getDataStructure() );
		//pusho in memoria il datastructure e un riferimento ad esso per le elaborazioni successive
		this.MEMORY.put(dstr.getName(), dstr);
		this.MEMORY.put("oldDSTR", new Scalar(dstr.getName(), Scalar.SCALARTYPE.String));
		
		//creo un nuovo datastructure
		//aggiungo n all'inizio per distinguerlo dal vecchio datastructure
		DataStructure ndstr = new DataStructure("n"+dstr.getName());
		//pusho il nuovo datastructure in memoria per elaborazioni
		this.MEMORY.put(ndstr.getName(), ndstr);
		this.MEMORY.put("newDSTR", new Scalar(ndstr.getName(), Scalar.SCALARTYPE.String));

		//inizializzo una map per il mapping (appunto) tra vecchi nomi e nuovi
		this.GLOBAL.put("keepMapping", new HashMap<String,String>());
		
		//ciclo per creare component e pusharli nel ndstr
		for(int k=0; k<ctx.clausebodyparam().size(); k++) {
			this.visit(ctx.clausebodyparam(k));
		}
		
		
		//recupero la mappa
		HashMap<String,String> map = (HashMap<String,String>) this.GLOBAL.get("keepMapping");
		
		//se è rename, devo aggiungere tutti i component rimanenti
		if(ctx.op.getText().toLowerCase().equals("rename")) {
			//prima di tutto controllo se la dimensione è inferiore
			if(dstr.getKeys().size() > ndstr.getKeys().size()) {
				//mi mancano componenti
				for(String OK : dstr.getKeys()) {
					if(map.get(OK)==null)
						if(ndstr.getComponent(OK)==null) {
							//aggiungo nuovo componente
							ndstr.putComponent(
									dstr.getComponent(OK).getId(),
									dstr.getComponent(OK).getDataType(),
									dstr.getComponent(OK).getType()
									);
						}
						//non c'è nella mappa ma è presente nel nuovo dstr
					//è presente nella mappa, unitile andare oltre
				}//fine for
			}
			//la dimensione è la stessa, quindi potenzialmente ho tutti i componenti
		}
		
		
		
		//qui adesso devo creare un nuovo dataset con il nuovo datastructure
		DataSet ods = ((DataSet)this.MEMORY.get(ref));
		DataSet nds;
			
			nds = new DataSet(ods.getName(),ods.getDescription(),ndstr,false);
			DataPoint dp = new DataPoint();
			
			for(int r=0; r<ods.getSize(); r++) {
				for(String K : ods.getPoint(r).getKeySet()) {
					if(map.get(K) != null) //se esiste nel mapping
						dp.setValue(map.get(K), ods.getPoint(r).getValue(K));
					else //non esiste, prendo valore direttamente
						dp.setValue(K, ods.getPoint(r).getValue(K));
				}
				nds.setPoint(dp);
			}
			//pulizia
			map = null;


		//ripulisco la globale
		this.GLOBAL.remove("keepMapping");
		return nds;
	}
	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClauseFilter(it.islandofcode.jvtllib.newparser.newVTLParser.ClauseFilterContext)
	 */
	@Override
	public VTLObj visitClauseFilter(ClauseFilterContext ctx) {
		//SE EXPR TORNA NULL, QUESTO VA CONSIDERATO COME FALSE non soddisfatto
		
		String ref = ((Scalar) this.MEMORY.get("workDS")).asString();
		//recupero dataset
		DataSet ds = ((DataSet)this.MEMORY.get(ref));
		//prendo il dstr del dataset origine
		DataStructure dstr = CLONER.deepClone( ds.getDataStructure() );
		DataSet nds;
		
			//creo nuovo dataset
			nds = new DataSet(ds.getName(),ds.getDescription(),dstr,false);
						
			//ciclo sulle righe
			for(int r=0; r<ds.getSize(); r++) {
				DataPoint dp = ds.getPoint(r);
				
				/* Qui devo prendere i valori di ogni riga e metterli in memoria
				 * come se fossero singoli scalari. Così expr può accedervi facilmente.
				 * Ad ogni iterazione, memory.put sovrascrive i vecchi valori.
				 * 
				 * non ho trovato un'altro modo. L'alternativa era quello di salvarsi i
				 * varname di expr e salvare SOLO quelli in memoria, ma non so come accedere
				 * ai figli di expr senza effettivamente visitare expr.
				 */
				for(String K : dstr.getKeys()) {
					this.MEMORY.put(K, dp.getValue(K));
				}
				
				//visito tutte le espressioni con i dati correnti
				for(int e=0;e<ctx.expr().size();e++) {
					VTLObj ret = this.visit(ctx.expr(e));
					/* null è considerato alla pari di false
					 * quindi in questo caso scarto la riga e vado avanti
					 * purtroppo non ho modo di sapere perchè è tornato null
					 * e in ogni caso non dovrebbe mai tornare null se non in caso di errore.
					 * Lo metto per il momento, poi si vedrà.
					 * TODO
					 */
					if(ret==null)
						continue;
					
					if(ret instanceof Scalar) { //se è uno scalare
						Scalar s = (Scalar)ret;
						if(s.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) { //se è un booleano
							if(s.asBoolean()) {//è true
								//salva dp nel nuovo dataset nds
								nds.setPoint(dp);
							}
							//scarta riga o, se ho settato il punto, salta al punto successivo
							continue;
						} 
					}
					
					//non è uno scalare o non è un booleano, eccezione!
					throw new RuntimeException("FILTER need a boolean result for the expression.");
				}//fine for expr
				
			}


		return nds;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClausebodyparam(it.
	 * islandofcode.jvtllib.newparser.newVTLParser.ClausebodyparamContext)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public VTLObj visitClausebodyparam(ClausebodyparamContext ctx) {
		// recupero i riferimenti per accedere in memoria
		String refo = ((Scalar) this.MEMORY.get("oldDSTR")).asString();
		String refn = ((Scalar) this.MEMORY.get("newDSTR")).asString();
		//recupero l'operazione richiesta: keep o rename
		String opref = ((Scalar) this.MEMORY.get("opToken")).asString();
		
		// recupero i datastructure
		DataStructure O = (DataStructure) this.MEMORY.get(refo);
		DataStructure N = (DataStructure) this.MEMORY.get(refn);
		
		// recupero vecchio componente
		Component OC = null;
		//System.out.println("VARNAME "+ctx.varname());
		if(ctx.varname()!=null)
			OC = O.getComponent( ctx.varname().getText() );
		//System.out.println("VARMEMBER "+ctx.varmember() );
		if(ctx.varmember()!=null) {
			OC = O.getComponent( ctx.varmember().getText().replaceFirst("\\.", "_") );
			System.out.println("COMPONENT " + ctx.varmember().getText().replaceFirst("\\.", "_"));
		}
		//throw new RuntimeException("Bad key reference for clausebodyparam.");
		
		// recupero eventuali parametri
		String newid = (ctx.stringLiteral() != null) ? ctx.stringLiteral().getText().replace("\"", "") : null;
		String newrole = (ctx.componentRole() != null) ? ctx.componentRole().role.getText().toLowerCase() : null;
		
		//se l'operazione è rename, allora devo avere almeno uno tra AS e ROLE
		if(opref.equals("rename"))
				if(newid==null && newrole==null)
					throw new RuntimeException("RENAME clause need at least one parameter: AS, ROLE or both");
		//altrimenti è keep, quindi posso andare avanti
		
		// inserisco nuovo componente
		N.putComponent((newid != null) ? newid : OC.getId(), OC.getDataType(),
				(newrole != null) ? DataStructure.string2type(newrole) : OC.getType());

		// aggiungo coppia alla variabile globale keepMapping
		if (newid != null) { // se ho chiesto un AS
			HashMap<String, String> map = (HashMap<String, String>) this.GLOBAL.get("keepMapping");
			map.put(OC.getId(), newid);
			this.GLOBAL.put("keepMapping", map);
		}

		// sovrascrivo dstr in memoria con quello aggiornato.
		this.MEMORY.put(refn, N);
		// la visita finisce qui, non devo ritornare niente
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClausecalc(it.
	 * islandofcode.jvtllib.newparser.newVTLParser.ClausecalcContext)
	 */
	@Override
	public VTLObj visitClausecalc(ClausecalcContext ctx) {
		String ref = ((Scalar) this.MEMORY.get("workDS")).asString();
		//recupero dataset
		DataSet ds = ((DataSet)this.MEMORY.get(ref));
		// recupero datastructure
		DataStructure dstr = CLONER.deepClone(ds.getDataStructure());
		//XXX
		// pusho in memoria il datastructure e un riferimento ad esso per le
		// elaborazioni successive
		this.MEMORY.put(dstr.getName(), dstr);
		this.MEMORY.put("oldDSTR", new Scalar(dstr.getName(), Scalar.SCALARTYPE.String));

		// creo un nuovo datastructure
		// aggiungo n all'inizio per distinguerlo dal vecchio datastructure
		DataStructure ndstr = new DataStructure("n" + dstr.getName());
		// pusho il nuovo datastructure in memoria per elaborazioni
		this.MEMORY.put(ndstr.getName(), ndstr);
		this.MEMORY.put("newDSTR", new Scalar(ndstr.getName(), Scalar.SCALARTYPE.String));
		
		/* Variabile di flag
		 * Quando è true, devo calcolare expr solo per ottenere il tipo, ma il risultato viene scartato
		 * Alla fine del primo passaggio, avrò il datastructure completo e quindi potrò creare il dataset.
		 * Dopo, il flag viene impostato a false, così che clausebodycalc ignori la modellazione del dstr
		 * e si concentri a popolare i datapoint da pushare nel nuovo ds.
		 */
		this.MEMORY.put("f_calc_1pass", Scalar.createBoolean(true));
		
		/* Metto in memoria tutte le var del primo rigo del vecchio dstr */
		DataPoint dp = ds.getPoint(0);
		for(String K: dstr.getKeys()) {
			this.MEMORY.put(K, dp.getValue(K));
		}
		//ciclo una prima volta su tutti i body per popolare il nuovo dstr
		for(int c=0; c<ctx.clausebodycalc().size(); c++) {
			this.visit(ctx.clausebodycalc(c));
		}
		//recupero ndstr aggiornato
		ndstr = ((DataStructure)this.MEMORY.get(
					((Scalar) this.MEMORY.get("newDSTR")).asString()
				));
		/* 
		 * Questa copia del dstr mi serve come mapping.
		 * In pratica contiene solo le nuove colonne, e mi servirà in fase di popolamento
		 * dei datapoint per capire quali colonne sono vuote e quali no. 
		 */
		DataStructure tmpdstr = CLONER.deepClone(ndstr);
		
		//qui inserisco gli altri componenti, quelli non valutati
		for(String K: dstr.getKeys()) {
			if(!ndstr.containtComponent(K)) {
				ndstr.putComponent(
							dstr.getComponent(K).getId(),
							dstr.getComponent(K).getDataType(),
							dstr.getComponent(K).getType()
						);
			}
		}
		//reinserisco ndstr per la vera valutazione
		this.MEMORY.put(ndstr.getName(), ndstr);
		
		//inverto il flag
		this.MEMORY.put("f_calc_1pass", Scalar.createBoolean(false));
		
		//qui creo il nuovo dataset
		DataSet nds = null;
		DataPoint ndp;
		
			nds = new DataSet(ds.getName(), ds.getDescription(), ndstr, false);
			
			for(int r=0; r<ds.getSize(); r++) {
				ndp=new DataPoint();
				//metto in memoria tutte le variabili, di nuovo, sovrascrivendo le vecchie.
				dp = ds.getPoint(r);
				for(String K: dstr.getKeys()) {
					this.MEMORY.put(K, dp.getValue(K));
				}
				//carico in memoria globale in datapoint
				this.GLOBAL.put("nextDataPoint", ndp);
				//ciclo su tutti i body per popolare le nuove colonne
				for(int c=0; c<ctx.clausebodycalc().size(); c++) {
					this.visit(ctx.clausebodycalc(c));
				}
				//scarico dalla memoria globale
				ndp = (DataPoint) this.GLOBAL.get("nextDataPoint");
				//qui copio i vecchi valori
				for(String K: dstr.getKeys()) {
					//utilizzo quel datastructure che contiene SOLO le nuove colonne.
					if(!tmpdstr.containtComponent(K)) {
						ndp.setValue(K, dp.getValue(K));
					}
				}
				nds.setPoint(ndp);
			}
			
		
		return nds;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitClausebodyparamexpr(it.islandofcode.jvtllib.newparser.newVTLParser.ClausebodyparamexprContext)
	 */
	@Override
	public VTLObj visitClausebodycalc(ClausebodycalcContext ctx) {
		// recupero flag
		boolean flag = ((Scalar) this.MEMORY.get("f_calc_1pass")).asBoolean();

		// recupero i riferimenti per accedere in memoria
		String refn = ((Scalar) this.MEMORY.get("newDSTR")).asString();

		// recupero il datastructure
		DataStructure N = (DataStructure) this.MEMORY.get(refn);

		//recupero e verifico nome della nuova colonna
		String column = (ctx.stringLiteral() != null) ? ((Scalar) this.visit(ctx.stringLiteral())).asString()
				: null;
		if (column == null)
			throw new RuntimeException("CALC clause need at least the AS parameter. ROLE is optional.");
		
		// recupero valore dell'espressione
		VTLObj ret = this.visit(ctx.expr());
		Scalar s;
		// verifico che sia uno scalare
		if (ret instanceof Scalar) {
			s = (Scalar) ret;
		} else {
			throw new RuntimeException(
					"CALC clause need a scalar value as first parameter. [" + ret.getObjType() + "] found instead!");
		}

		if (flag) {
			//primo passaggio, popolo solo il datastructure nuovo
			
			String newrole = (ctx.componentRole() != null) ? ctx.componentRole().role.getText().toLowerCase()
					: "measure";

			N.putComponent(column, new Scalar(s.getScalarType()), DataStructure.string2type(newrole));
			// sovrascrivo dstr in memoria con quello aggiornato.
			this.MEMORY.put(refn, N);
		} else {
			// devo riempire il datapoint
			DataPoint ndp = (DataPoint) this.GLOBAL.get("nextDataPoint");
			
			ndp.setValue(column, s);
			
			this.GLOBAL.put("nextDataPoint", ndp);
		}

		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.antlr.newVTLBaseVisitor#visitClausedrop(it.islandofcode.jvtllib.newparser.antlr.newVTLParser.ClausedropContext)
	 */
	@Override
	public VTLObj visitClausedrop(ClausedropContext ctx) {
		//se una delle colonne passate non esiste, la ignoro. Se nessuna esiste, ritorno il ds senza modifiche.
		
		String ref = ((Scalar) this.MEMORY.get("workDS")).asString();
		//recupero dataset
		DataSet ds = ((DataSet)this.MEMORY.get(ref));
		//prendo il dstr del dataset origine
		DataStructure dstr = CLONER.deepClone( ds.getDataStructure() );
		//ne creo uno nuovo
		DataStructure ndstr = new DataStructure(dstr.getName());
		int find;
		for(String K : dstr.getKeys()) {
			find = -1;
			for(int c=0; c<ctx.varname().size(); c++) {
				if(K.equals(ctx.varname(c).getText())) {
					find = c;
					break;
				}
			}
			if(find<0) {//se non è nella lista da scartare, aggiungo
				ndstr.putComponent(
						dstr.getComponent(K).getId(),
						dstr.getComponent(K).getDataType(),
						dstr.getComponent(K).getType()
						);
			}
		}
		//se ho cancellato tutte le colonne, eccezione
		if(ndstr.getKeys().size()<=0)
			throw new RuntimeException("DROP cant return a empty ds (with zero component)");
		//se alla fine ho lo stesso numero di colonne, significa che non ne ho scartata alcuna, quindi ritorno il vecchio ds
		if(ndstr.getKeys().size()==dstr.getKeys().size())
			return ds;
		
		//creo nuovo dataset
		DataSet nds = new DataSet(ds.getName(),ds.getDescription(),ndstr,false);
		
		for(int p=0; p<ds.getSize(); p++) {
			nds.setPoint(ds.getPoint(p));
		}

		return nds;
	}


	@Override
	public VTLObj visitSetUnion(SetUnionContext ctx) {
		LOG.fine("Valutazione SET UNION");
		//secondo le specifiche, se passo un unico dataset, devo ritornarlo senza cambiamenti.
		if(ctx.varname().size()<=1)
			if( this.visit(ctx.varname(0)).getObjType().equals(VTLObj.OBJTYPE.DataSet) )
				return this.visit(ctx.varname(0));
		
		//altrimenti, verifica che siano tutti dataset e che abbiano tutti lo stesso datastructure
		ArrayList<DataSet> LDS = new ArrayList<>();
		for(int i=0; i<ctx.varname().size(); i++) {
			VTLObj tds = this.visit(ctx.varname(i));
			DataStructure tdstr = null;
			if(tds.getObjType().equals(VTLObj.OBJTYPE.DataSet)) {
				//è un dataset
				LDS.add(i,(DataSet)tds);
				//mi salvo il dstr per verificare che sia uguale al precedente
				tdstr = ((DataSet)tds).getDataStructure();
				if(i>0) { //se ho inserito solo il primo dataset, non posso fare controlli
					if(!LDS.get(i-1).getDataStructure().equals(tdstr)) {
						/* Se il datastructure precedente e l'attuale non sono uguali,
						 * lancia eccezione!
						 */
						throw new RuntimeException("UNION accept only DataSet with the same DataStructure.");
					}
				}
			} else {
				throw new RuntimeException("UNION accept only DataSet.");
			}
		}//fine for controllo tipo e dstr
		
		/*
		 * Adesso c'è la parte più difficile: devo ciclare su tutti i dataset per verificare
		 * se ci siano duplicati.
		 * 
		 * Questo è l'approccio migliore che mi è venuto in mente.
		 * Altri approcci, forse più performanti, prevedevano però l'ordinare gli elementi
		 * prima di verificare.
		 * 
		 * Avevo pensato di ordinare le tabelle per numero di elementi, ma comunque devo ciclare su ogni
		 * elemento delle tabelle, quindi con un O(N^m), dove m è il numero delle tabelle.
		 * 
		 * -copio la prima tabella. Questa sarà quella di partenza
		 * -ciclo sulle altre tabelle
		 * 		-ciclo su gli elementi della tabella attuale
		 * 			-ciclo sugli elementi della tabella di ritorno
		 * 				se l'elemento della tabella attuale è presente,
		 * 					spezzo il ciclo con booleano settato a true
		 * 			se booleano==false
		 * 				aggiungo l'elemento attuale nella tabella di ritorno.
		 * 		elimino riferimento alla tabella attuale, cosicchè il GC possa alleggerire la memoria
		 * ritorno la tabella finale
		 * 
		 * Ovviamente, ad ogni elemento aggiunto alla tabella di ritorno, il ciclo più interno aumenta.
		 * Più elementi duplicati ci sono, più lentamente la tabella cresce. Meno duplicati si trovano
		 * più velocemente la tabella aumenta di dimensione e quindi aumenta il tempo di computazione.
		 */
		
		//il primo elemento è la mia nuova tabella
		DataSet ret = null, tds = LDS.remove(0);
		DataStructure tdstr = tds.getDataStructure();
		//creamo un nuovo datastructure senza attributi
		DataStructure ndstr = new DataStructure("uniondstr");
		for(String C : tdstr.getKeys()) {
			if(tdstr.getComponent(C).getType().equals(DataStructure.type.Attribute))
				continue; //skip!
			ndstr.putComponent(
					tdstr.getComponent(C).getId(),
					tdstr.getComponent(C).getDataType(),
					tdstr.getComponent(C).getType());
		}
		//creiamo il DataSet di partenza
			ret = new DataSet("unionds","",ndstr,false);
			for(int p=0; p<tds.getSize(); p++)
				ret.setPoint(tds.getPoint(p));

		tds = null;
		tdstr = null;
		
		//ciclo su tutte le tabelle
		for(int g=0; g<LDS.size(); g++) { //g come global
			LOG.finest("GLOBAL iteration "+(g+1)+" of " + LDS.size());
			//ciclo sui datapoint della tabella attuale
			for(int a=0; a<LDS.get(g).getSize(); a++) { //a come actual
				LOG.finest("\tACTUAL iteration "+(a+1)+" of " + LDS.get(g).getSize());
				boolean dup = false;
				//ciclo sui datapoint della tabella da ritornare
				for(int r=0; r<ret.getSize(); r++) { //r come return
					LOG.finest("\t\tRETURN iteration "+(r+1)+" of " + ret.getSize());
					if(LDS.get(g).getPoint(a).equals(ret.getPoint(r), ret.getDataStructure(), false)) {
						//se l'elemento actual è presente in ret
						dup = true;
						//aggiungo il punto
					}
					//passo al prossimo datapoint
				}//fine r
				if(!dup) {
					LOG.finest("\t\t\tADD newpoint " + LDS.get(g).getPoint(a).getValue("NAME").asString());
					ret.setPoint(LDS.get(g).getPoint(a));
				}
			}//fine a
		}//fine g
		
		return ret;
	}


	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitSetIntersect(it.islandofcode.jvtllib.newparser.newVTLParser.SetIntersectContext)
	 */
	@Override
	public VTLObj visitSetIntersect(SetIntersectContext ctx) {
		LOG.fine("Valutazione SET INTERSECT");
		//qui le specifiche non sono chiare, ma torno il dataset originario se ne passo solo uno
		if(ctx.varname().size()<=1)
			if( this.visit(ctx.varname(0)).getObjType().equals(VTLObj.OBJTYPE.DataSet) )
				return this.visit(ctx.varname(0));
		
		//altrimenti, verifica che siano tutti dataset e che abbiano tutti lo stesso datastructure
		ArrayList<DataSet> LDS = new ArrayList<>();
		for(int i=0; i<ctx.varname().size(); i++) {
			VTLObj tds = this.visit(ctx.varname(i));
			DataStructure tdstr = null;
			if(tds.getObjType().equals(VTLObj.OBJTYPE.DataSet)) {
				//è un dataset
				LDS.add(i,(DataSet)tds);
				//mi salvo il dstr per verificare che sia uguale al precedente
				tdstr = ((DataSet)tds).getDataStructure();
				if(i>0) { //se ho inserito solo il primo dataset, non posso fare controlli
					if(!LDS.get(i-1).getDataStructure().equals(tdstr)) {
						/* Se il datastructure precedente e l'attuale non sono uguali,
						 * lancia eccezione!
						 */
						throw new RuntimeException("INTERSECT accept only DataSet with the same DataStructure.");
					}
				}
			} else {
				throw new RuntimeException("INTERSECT accept only DataSet.");
			}
		}//fine for controllo tipo e dstr
		
		/*
		 * Qui ordino l'array. Perchè nel peggiore dei casi l'intersezione
		 * di più insiemi avrà cardinalità pari a quella dell'insieme più piccolo.
		 * quindi ordinando in maniera crescente, il codice è più semplice da scrivere
		 * e più veloce nell'esecuzione.
		 */
		Collections.sort(LDS, new Comparator<DataSet>() {
				public int compare(DataSet ds1, DataSet ds2) {
					int a = ds1.getSize();
					int b = ds2.getSize();

					if(a>b)
						return 1;
					else if(a<b)
						return -1;
					else
						return 0;
				}
			}
		);
		
		
		//il primo elemento è la mia nuova tabella
		DataSet ret = null, tds = LDS.get(0);
		DataStructure tdstr = tds.getDataStructure();
		//creamo un nuovo datastructure senza attributi
		DataStructure ndstr = new DataStructure("uniondstr");
		for(String C : tdstr.getKeys()) {
			if(tdstr.getComponent(C).getType().equals(DataStructure.type.Attribute))
				continue; //skip!
			ndstr.putComponent(
					tdstr.getComponent(C).getId(),
					tdstr.getComponent(C).getDataType(),
					tdstr.getComponent(C).getType());
		}
		//creiamo il DataSet di partenza

			ret = new DataSet("unionds","",ndstr,false);

		//agevolo il GC
		tds = null;
		tdstr = null;
		ndstr = null;
		//ciclo su datapoint prima tabella
		for(int g=0; g<LDS.get(0).getSize(); g++) { //g come global
			LOG.finest("GLOBAL iteration "+(g+1)+" of " + LDS.size());
			//recupero datapoint
			DataPoint dp = LDS.get(0).getPoint(g);
			//init contatore
			int many = 0;
			//ciclo sulle restanti tabelle
			for(int o=1; o<LDS.size(); o++) { //o come other
				LOG.finest("\tOTHER iteration "+(o)+" of " + (LDS.size()-1));
				//ciclo sui datapoint della tabella attuale
				for(int a=0; a<LDS.get(o).getSize(); a++) {
					/*
					 * come dsrt gli passo quello del ds attuale, altrimenti equals va in eccezione
					 * perchè il ds di ret potrebbe non avere gli ATTR che dstr actual ha.
					 * Quindi andando a fare la verifica (nell'equal) se è un ATTR, questo controllo
					 * 	if((dstr.getComponent(K).getType().equals(DataStructure.type.Attribute) && !withAttr))
					 * va in eccezione NullPointer perchè getComponent ritornerebbe null.
					 * Usando invece il dstr della tabella attuale, questi problemi non si dovrebbero porre,
					 * perchè abbiamo già verificato che hanno gli stessi campi IDENT, MEAS.
					 * Quelli in più saranno sicuramente ATTR, che vengono ignorati.
					 */
					if(dp.equals(LDS.get(o).getPoint(a), LDS.get(o).getDataStructure(), false)) {
						//incremento contatore
						many++;
						//spezzo perchè idealmente non ci dovrebbero essere duplicati per ds
						break;
					}
				}//fine a
			}//fine o
			if(many==(LDS.size()-1)) {
				ret.setPoint(dp);
			}
			//altrimenti significa che la riga non è presente in tutti i ds
		}//fine g
		
		return ret;
	}

	
	
	@Override
	public VTLObj visitSetSetSymDiff(SetSetSymDiffContext ctx) {
		
		//if(ctx.op.getType() == newVTLParser.SYMDIFF)
			
		LOG.fine("Valutazione SET "+ctx.op.getText().toUpperCase());
		
		if(ctx.varname().size()!=2)
			throw new RuntimeException(ctx.op.getText().toUpperCase()+" need two parameter.");
		
		VTLObj a = this.visit(ctx.varname(0));
		VTLObj b = this.visit(ctx.varname(1));
		
		if( !a.getObjType().equals(VTLObj.OBJTYPE.DataSet) && !b.getObjType().equals(VTLObj.OBJTYPE.DataSet))
			throw new RuntimeException(ctx.op.getText().toUpperCase()+" need two DataSet.");
		
		DataSet ds1 = (DataSet)a;
		DataSet ds2 = (DataSet)b;
		a=null; b=null;
		
		if(!ds1.getDataStructure().equals(ds2.getDataStructure()))
			throw new RuntimeException(ctx.op.getText().toUpperCase()+" accept only DataSet with the same DataStructure.");
		
		//creo nuovo dataset
		DataSet ret = null;
			ret = new DataSet("diffds","",ds1.getDataStructure(), false);
		
		boolean dup;
		//ciclo da ds1 a ds2 e creo la prima parte di ret
		for(int i=0; i<ds1.getSize(); i++) {
			dup = false; //se true, ho trovato un duplicato
			for(int j=0; j<ds2.getSize(); j++) {
				if(ds1.getPoint(i).equals(ds2.getPoint(j))) {
					dup = true;
					break;
				}
			}
			if(!dup) {
				ret.setPoint(ds1.getPoint(i));
			}
		}
		//se è symdiff, ciclo da ds2 su ret per inserire altri nodi
		if(ctx.op.getType() == newVTLParser.SYMDIFF) {
			//ciclo da ret a ds2 e creo la seconda parte di ret
			for(int i=0; i<ds2.getSize(); i++) {
				dup = false; //se true, ho trovato un duplicato
				for(int j=0; j<ret.getSize(); j++) {
					if(ds2.getPoint(i).equals(ret.getPoint(j))) {
						dup = true;
						break;
					}
				}
				if(!dup) {
					ret.setPoint(ds2.getPoint(i));
				}
			}
		}
		
		return ret;
	}


	@Override
	public VTLObj visitNvlCondOp(NvlCondOpContext ctx) {
		VTLObj tmp = this.visit(ctx.varname());
		DataSet ds = null;
		if(tmp instanceof DataSet)
			ds = (DataSet)tmp;
		else
			throw new RuntimeException("NVL accept DataSet only as first parameter.");
		
		tmp = this.visit(ctx.expr());
		Scalar s = null;
		if(tmp instanceof Scalar)
			s = (Scalar)tmp;
		else
			throw new RuntimeException("NVL accept Scalar only as second parameter.");
		
		//controlla che tutti i campi measure abbiano lo stesso tipo
		DataStructure dstr = ds.getDataStructure();
		for(String K : dstr.getKeys()) {
			//ho trovato un campo measure
			if(dstr.getComponent(K).getType().equals(DataStructure.type.Measure)) {
				//confronto il tipo della misura con lo scalare in input
				if( !((Scalar)dstr.getComponent(K).getDataType()).getScalarType().equals(s.getScalarType()) ) {
					throw new RuntimeException("DataSet need to have all field Measure of the same type of the Scalar parameter.");
				}
			}
		}
		//se sono arrivato qui, significa che il controllo ha avuto successo
		//adesso devo creare un nuovo DataSet, con lo stesso DataStructure
		DataSet ret = null;
			ret = new DataSet(ds.getName(), ds.getDescription(), dstr, false);
			DataPoint dp = null;
			for(int p=0; p<ds.getSize(); p++) {
				dp = ds.getPoint(p);
				for(String K : dstr.getKeys()) {
					if(dstr.getComponent(K).getType().equals(DataStructure.type.Measure)) {
						dp.setValue(K, s);
					}
					//skip!
				}
			}


		return ret;
	}


	@Override
	public VTLObj visitIfThenElseCondOp(IfThenElseCondOpContext ctx) {
		// IF expr THEN expr (ELIF expr THEN expr)* ELSE expr
		/*
		 * Questo implica che ci devono essere tante expr quanti i token presenti.
		 * Inoltre, il primo expr è booleano
		 * il secondo è sicuramente Scalare o DS
		 * 		Se ci sono 3 expr, allora il terzo è Scalare/DS
		 * Altrimenti
		 * 		Cicla a due a due,
		 * 			il primo è booleano,
		 * 			il secondo è Scalare/DS
		 * Bisogna fare un fino lavoro di indici, perchè la struttura è controllata
		 * a livello di Grammatica.
		 * 
		 * Per quanto riguarda il controllo dei tipi, penso si debba fare aprioristicamente
		 * oppure si potrebbe pensare di farli man mano che si avanza nella struttura.
		 * Però questo implicherebbe che un eventuale errore verrebbe scoperto solo
		 * quando le condizioni sono tali da visitare quel specifico ramo.
		 * 
		 * Siccome però sono tutte expr, bisogna visitarle, e vistare un'expr significa fare una
		 * una valutazione che può essere anche pesante dal punto di vista computazione.
		 * Per evitare di fare due volte la stessa cosa, seguiamo l'approccio di analisi
		 * progressiva delle espressioni.
		 * Ignoriamo le problematiche per il momento, affidandoci all'attenzione dell'utente.
		 */
		VTLObj tmp = null;
		Scalar stmp = null;
		//mi fermo all'ultimo then, senza visitare l'else
		for(int e=0; e<(ctx.expr().size()-1); e+=2) { 
			//con e+2, salto da if ad if
			tmp = this.visit(ctx.expr(e));
			if(tmp instanceof Scalar) {
				stmp = (Scalar)tmp;
				if(stmp.getScalarType().equals(Scalar.SCALARTYPE.Boolean)) {
					if(stmp.asBoolean()) {
						//la condizione è true, quindi ritorno il then!
						return this.visit(ctx.expr(e+1));
					}
				}
			}			
		}
		//visito e ritorno l'else
		return this.visit(ctx.expr(ctx.expr().size()-1));
	}
	

	@Override
	public VTLObj visitNamedProcDef(NamedProcDefContext ctx) {
		// TODO Auto-generated method stub
		//return super.visitNamedProcDef(ctx);
		
		System.out.println("NAMED PROCEDURE [" + ctx.varname(0).getText() + "]");
		this.visit(ctx.procVarInList());
		System.out.println("\tOUTPUT on " + ctx.varname(ctx.varname().size()-1).getText());
		for(int i=0; i<ctx.assignment().size(); i++) {
			System.out.println("\tBODY["+i+"]{ " + ctx.assignment(i).getText() + " }");
		}
		
		return null;
	}

	
	
	@Override
	public VTLObj visitProcVarInList(ProcVarInListContext ctx) {
		// TODO Auto-generated method stub
		//return super.visitProcVarIn(ctx);
		
		for(int i=0; i<ctx.singleVarIn().size(); i++)
			this.visit(ctx.singleVarIn(i));
				
		return null;
	}

	@Override
	public VTLObj visitSingleVarIn(SingleVarInContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\tINPUT on " + ctx.varname().getText() + " type " + ctx.datatype.getText());
		return null;
	}


	@Override
	public VTLObj visitGetFunction(GetFunctionContext ctx) {
		if (this.connector == null)
			throw new RuntimeException("Connector cant be null!");
		// TODO è un pò debuluccia come implementazione. Andrebbero fatto mooolti
		// controlli.
		// per il momento ce la teniamo così
		LOG.info("GET from [" + ctx.stringLiteral().getText() + "]");
		String[] keep = null;
		if(ctx.varname().size()>0) {
			keep = new String[ctx.varname().size()];
			for(int k=0; k<ctx.varname().size(); k++) {
				keep[k] = ctx.varname(k).getText();
			}
		}
		return this.connector.get(ctx.stringLiteral().getText().replace("\"", ""), keep);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitPutData(it.
	 * islandofcode.jvtllib.newparser.newVTLParser.PutDataContext)
	 */
	@Override
	public VTLObj visitPutData(PutDataContext ctx) {
		if (this.connector == null)
			throw new RuntimeException("Connector cant be null!");
		
		LOG.info("PUT > " + ctx.putFunction().stringLiteral().getText());
		
		// TODO quindi? come gestire il tutto?
		return super.visitPutData(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitDBGprintvar(it.
	 * islandofcode.jvtllib.newparser.newVTLParser.DBGprintvarContext)
	 */
	@Override
	public VTLObj visitDBGprintvar(DBGprintvarContext ctx) {
		VTLObj var = this.MEMORY.get(ctx.varname().getText());
		switch(var.getObjType()) {
		case DataSet:{
			LOG.fine("[printvar] THIS IS A DATASET");
			DataSet ds = (DataSet) var;
			for(int i=0; i<ds.getSize(); i++) {
				DataPoint dp = ds.getPoint(i);
				System.out.print("\tROW["+i+"] {  ");
				for(String K : dp.getKeySet()) {
					System.out.print("["+K+"]->["+dp.getValue(K).asString()+"]  ");
				}
				System.out.println();
			}
			LOG.fine("[printvar] DATASET ROW COUNT: " + ds.getSize());
			break;
		}
		case DataPointRuleSet:
			LOG.fine("[printvar] THIS IS A DATAPOINTRULESET");
			break;
		case DataSetColumn:
			LOG.fine("[printvar] THIS IS A DATASETCOLUMN\n"	+ "COLUMN[" + ((DataSetColumn)var).getColumnName() + "]");
			break;
		case DataStructure:
			LOG.fine("[printvar] THIS IS A DATASTRUCTURE");
			break;
		case Scalar:
			LOG.fine("[printvar] THIS IS A SCALAR\n"+ "\tVALUE["+((Scalar)var).asString()+"]");
			break;
		case ValueDomain:
			LOG.fine("[printvar] THIS IS A VALUEDOMAIN");
			break;
		default:
			LOG.fine("[printvar] UNRECOGNIZABLE VTLOBJ TYPE");
			break;
		}
		return null;
		//return super.visitDBGprintvar(ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.islandofcode.jvtllib.newparser.newVTLBaseVisitor#visitDBGnop(it.
	 * islandofcode.jvtllib.newparser.newVTLParser.DBGnopContext)
	 */
	@Override
	public VTLObj visitDBGnop(DBGnopContext ctx) {
		// non faccio niente, nop appunto
		LOG.fine("! NOP !");
		return super.visitDBGnop(ctx);
	}

}

	