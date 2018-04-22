grammar newVTL;
//regola iniziale, in main si chiama questo per avviare l'esecuzione
parse : statement+ EOF;

//ogni riga può essere un assegnamento, una definizione, una put o, per il momento, istruzioni di debug personali.
statement : putFunction 	#putData
		  | define #definestatement //queste sono le istruzioni del VTL-DL
		  | callProc	#callProcStat //chiamata di procedura
		  | namedFunDef #defFunction //definizione di funzione
		  | assignment #assingstatement
		  | debug #debugstatement//queste istruzioni sono mie e non fanno parte del VTL
		  ;

/*
 * L'assegnamento è composto da:
 *	varname: il nome della variabile che ospiterà i risultati.
 *	ASSIGN: il simbolo per l'operazione di assegnamento (:=)
 *	expr: un'espressione che genera un risultato da salvare nella variabile
 */
assignment : varname ASSIGN expr;

/*
 * Questa è una delle parti più importanti: l'espressione
 * Per ogni riga c'è una possibile espressione divisa in base alle operazioni.
 * Importante notare che expr è ricorsiva, e scende fino alle foglie, cioè literal o variabili.
 */
expr : op=(NOT | PLUS | MINUS) right=expr						#unaryexpr
	 |LPAR expr RPAR											#precedenceexpr
	 //espressioni matematiche
	 | expr op=(PLUS | MINUS | MUL | DIV) expr					#mathexpr
	 //separo round e ceil/floor perchè funzionano diversamente
	 | ROUND LPAR varname COMMA integerLiteral RPAR				#roundexpr
	 | op=(CEIL|FLOOR) LPAR varname RPAR						#CeilFloorexpr
	 //funzioni matematiche
	 //separo quelle a singolo parametro da quelle a doppio parametro
	 | op=(ABS|EXP|LOGN|SQRT) LPAR varname RPAR							#singleparamMathfun
	 | op=(TRUNC|POW|NROOT|MOD) LPAR varname COMMA integerLiteral RPAR  #doubleparamMathfun
	 | LOG LPAR integerLiteral COMMA varname RPAR						#logexpr
	 //espressioni condizionali
	 | expr op=(EQ | NE | LE | LT | GE | GT) expr				#RelationalCond
	 //il NOT? è necessario perchè NOT expr non viene mai riconosciuto
	 | varname (NOT)? IN LPAR literal (COMMA literal)* RPAR			#InCondexpr
	 /* (NOT)* è un hack, visto che (NOT)? non viene assolutamente
	  * considerato. Quindi nel codice devo usare ctx.NOT(0), perchè
	  * pensa sia una lista e non un singolo. */
	 | (NOT)* ISNULL LPAR expr RPAR									#IsNullCondexpr
	 | left=expr op=(AND|OR) right=expr							#Logicalexpr
	 //funzioni di gestione stringhe
	 | a=expr CONCAT b=expr														#StringConcat
	 | SUBSTR LPAR expr (COMMA integerLiteral)? (COMMA integerLiteral)? RPAR	#StringFunSubstr
	 //funzioni di validazione (check)
	 | checkfunction											#checkExpr
	 //funzioni di manipolazione delle colonne
	 | clausefun												#clauseExpr
	 //funzioni su tabelle
	 | setfun													#setExpr
	 | callFun													#callFunExpr
	 //le uniche funzioni di I/O
	 | getFunction												#getData
	 //le unità di base, le foglie dell'albero se vogliamo
	 | varmember												#membershipexpr
	 | varname													#varexpr
	 | literal													#literalexpr
	 ;

/*
 * Questo blocco definisce tutte le alternative della funzione check
 * per la validazione dei dataset.
 * Per iniziare verranno implementate:
 *	check(with datapoint ruleset)
 *	check(single rule)
 */
checkfunction : CHECK LPAR varname (COMMA varname)+ RPAR								#checkFunBase
			  | CHECK LPAR varname (COMMA varname)+ checkParamEnum checkParamOpt RPAR	#checkFunWithOpt
			  ;
/*
 * indica quali dp ritornare:
 *	VALID quelli che rispettato il dprs (torna true)
 *	NVALID quelli che non lo rispettano (torna false)
 *  ALL tutti quanti (si usa SOLO in combinazione con CONDITION)
 */
checkParamEnum : (COMMA (VALID | NVALID | ALL) )? ;
/*
 * indica quali colonne vanno restituite
 *	CONDITION torna un ds con tutti i campi ID, un unico campo MEASURE che contiene
 * 				un booleano con il risultato della validazione e ERRORMESSAGE se presente
 * 				null altrimenti.
 *	MEASURES  torna il dataset originale con l'aggiunta di ERRORMESSAGE (se non presente imposta
 * 				a null il campo)
 */
checkParamOpt  : (COMMA (CONDITION | MEASURES) )? ;


/*
 * Questo blocco definisce tutte le operazioni di definizione.
 */
define : dpruleset					#datapointruleset
	   | DEFINE 'variable' varname	#definevariable
	   | namedProcDef				#defineProcedure
	   ;

/* le regole specifiche per datapoint ruleset */
dpruleset : DEFINE DATAPOINT RULESET varname LPAR varname(COMMA varname)* RPAR LBRA singlerule+ RBRA;//dprulesetblock;
/* Qui prendo la regola e la inserisco nel ruleset (3) */
singlerule : varname COLON WHEN booleanLiteral THEN expr (errorCode)? 		#singleruleConsequenceOnly
		   | varname COLON WHEN expr THEN expr (errorCode)?					#singleruleBoth
		   ;

//accetta un literal come codice di errore
errorCode : ERRCODE LPAR literal RPAR;

/* Funzioni per input/output */
getFunction : GET LPAR stringLiteral (COMMA KEEP LPAR varname (COMMA varname)* RPAR)? RPAR;
putFunction : PUT LPAR stringLiteral COMMA varname RPAR;


/* CLAUSE FUNCTION */
clausefun: varname LSQR clausebody (COMMA clausebody)* RSQR					#clausebase
		 | LSQR joinblock RSQR LBRA clausebody (COMMA clausebody)* RBRA		#clausejoin
		 ;

//tutti i possibili "corpi"
clausebody : op=(KEEP|RENAME) LPAR clausebodyparam (COMMA clausebodyparam)* RPAR #clauseKeepRename
		   | FILTER LPAR expr (COMMA expr)* RPAR #clauseFilter
		   //lo separo da keep/ename, perchè questo deve solo aggiungere una/più colonna
		   //dopo aver calcolato un'expr
		   | CALC LPAR clausebodycalc (COMMA clausebodycalc)* RPAR #clausecalc
		   | DROP LPAR varname (COMMA varname)* RPAR #clausedrop
		   ;

//blocco per keep/rename
clausebodyparam   : (varname|varmember) (AS stringLiteral)? (ROLE componentRole)?;
//blocco per calc
//AS è obbligatorio, ROLE opz. Se non specificato, è Measure.
clausebodycalc : expr AS stringLiteral (ROLE componentRole)?;


//join
joinblock : INNER varname AS stringLiteral (COMMA varname AS stringLiteral)+ ON expr			#joinblockInner
			//ATTENZIONE! LEFT non fa parte di VTL! Per questo lo metto in un blocco a parte.
		  | LEFT  varname AS stringLiteral (COMMA varname AS stringLiteral)+ ON expr			#joinblockLeft
		  ;

/* SET FUNCTION */
setfun: UNION LPAR varname (COMMA varname)* RPAR		#setUnion
	  | INTERSECT LPAR varname (COMMA varname)* RPAR	#setIntersect
	  | op=(SYMDIFF|SETDIFF) LPAR varname COMMA varname RPAR			#setSetSymDiff
	  ;

/* CONDITONAL OPERATORS */
//operatori condizionali, praticamente solo NVL e IFTHENELSE
condOperator: NVL LPAR varname COMMA expr RPAR							#nvlCondOp
			| IF expr THEN expr (ELSEIF expr THEN expr)* ELSE expr		#IfThenElseCondOp
			;


/* NAMED PROCEDURES */
namedProcDef : DEFINE PROCEDURE varname LPAR procVarInList (COMMA OUTPUT varname AS datatype=(DATASET|STRINGTYPE)) RPAR LBRA assignment+ RBRA;
procVarInList : singleVarIn (COMMA singleVarIn)*;
singleVarIn : (INPUT varname AS datatype=(DATASET|STRINGTYPE));
//call procedure
callProc : varname LPAR varname (COMMA varname)* RPAR;
/* NAMED FUNCTIONS */
namedFunDef : CREATE FUNCTION varname LPAR varname (COMMA varname)* RPAR LBRA RETURN expr AS (scalartype|DATASET) RBRA;
callFun : CALL varname LPAR varname (COMMA varname)* RPAR;

/*
 * Qui le istruzioni personali
 */
debug : 'printvar' varname 		#DBGprintvar //printvar deve stampare info sulla variabile
	  | 'nop'					#DBGnop		 //No Operation, serve per il debug, per poter mettere dei breakpoint nel codice vtl.
	  ;


//********************* TOKEN/FRAGMENT *********************
/*
 * Qui di seguito si trovano tutti i token e i fragment che verranno usati nella grammatica
 */
//deve inziare per una lettera, seguono lettere, underscore e numeri.
varname : (REG_IDENTIFIER | ESCAPED_IDENTIFIER);
//per indicare una colonna, del tipo ds_1.k1
varmember : left=varname op=MEMBER right=varname ;

//racchiude i nomi di tutti gli scalari
scalartype : nulltype
     | booleantype
     | datetype
     | integertype
     | floattype
     | stringtype
     ;

nulltype : NULLTYPE;
booleantype : BOOLTYPE;
datetype : DATETYPE;
integertype : INTTYPE;
floattype : FLOATTYPE;
stringtype : STRINGTYPE;

/*
    literal indica tutti gli scalari, null compreso.
*/
literal : nullLiteral
         | booleanLiteral
         | dateLiteral
         | integerLiteral
         | floatLiteral
         | stringLiteral ;

//qui si definiscono i letterali a partire dai fragment.
nullLiteral     : NULLTYPE ;
booleanLiteral  : BOOLEAN_LITERAL ;
dateLiteral     : DATE_LITERAL ;
integerLiteral  : INTEGER_LITERAL ;
floatLiteral    : FLOAT_LITERAL ;
stringLiteral   : STRING_LITERAL ;

componentRole : role=(IDENTIFIER | MEASURE | ATTRIBUTE);

/* OPERATORS */
ASSIGN : ':=';
MEMBER : '.';

MUL : '*' ;
DIV : '/' ;
PLUS : '+';
MINUS : '-';

/* String op */
CONCAT : '||' ;

/* Relational op */
EQ : '='  ;
NE : '<>' ;
LE : '<=' ;
LT : '<'  ;
GE : '>=' ;
GT : '>'  ;

AND : 'and' ;
OR  : 'or' ;
XOR : 'xor' ;
NOT : 'not' ;
ISNULL : 'isnull' ;
ISNOTNULL : 'is not null' ;

/* RULE GENERIC SYM */
WHEN : 'when';
THEN : 'then';
IN : 'in';
AS : 'as';
ERRCODE : 'errorcode' ;

/* GRAMMAR SYMBOL */
LPAR : '(' ;
RPAR : ')' ;
LBRA : '{' ;
RBRA : '}' ;
LSQR : '[' ;
RSQR : ']' ;
COMMA : ',' ;
COLON : ':' ;
SCOL : ';';

/* FUNCTION */
RESTRICT : 'restrict';
GET : 'get';
PUT :'put';

CHECK : 'check';
VALID : 'valid';
NVALID : 'not valid';
ALL : 'all';
CONDITION : 'condition';
MEASURES : 'measures';

JOIN : 'join' ;
INNER : 'inner';
LEFT : 'left';
ON : 'on';

KEEP: 'keep';
RENAME : 'rename' ;
FILTER : 'filter' ;
CALC : 'calc';
DROP : 'drop';

UNION : 'union';
INTERSECT : 'intersect' ;
SYMDIFF : 'symdiff';
SETDIFF : 'setdiff';

NVL:'nvl';
IF:'if';
ELSEIF:'elseif';
ELSE:'else';

INPUT : 'input';
OUTPUT : 'output';

//math
ROUND : 'round' ;
CEIL : 'ceil' ;
FLOOR : 'floor' ;

ABS : 'abs';
EXP : 'exp';
LOGN : 'ln';
LOG : 'log';
POW : 'power';
SQRT : 'sqrt';
NROOT : 'nroot';
MOD : 'mod';
TRUNC : 'trunc';

//string
SUBSTR : 'substr';

/* IDENTIFICATORI */
ROLE : 'role';
IDENTIFIER : 'identifier' | 'IDENTIFIER' ;
MEASURE : 'measure' | 'MEASURE' ;
ATTRIBUTE : 'attribute' | 'ATTRIBUTE'  ;

/* Define */
DEFINE : 'define';
DEFVAR : 'defineVariable';
DEFVALUEDOM : 'defineValueDomain';
DEFDATSTRUCT : 'defineDataStructure';
DEFDATASET : 'defineDataSet';
DATAPOINT : 'datapoint';
RULESET : 'ruleset';
HIERARCHICAL : 'hierarchical';
MAPPING : 'mapping';
PROCEDURE : 'procedure';

//function
CREATE :'create';
FUNCTION : 'function';
CALL : 'call';
RETURN : 'return';

/* SCALAR TYPE */
NULLTYPE : 'null';
STRINGTYPE : 'string';
INTTYPE : 'integer';
FLOATTYPE : 'float';
BOOLTYPE : 'boolean';
DATETYPE : 'date';
DATASET : 'dataset';


/* LITERAL DEFINITION */
// "2000-01-01T00:00:00.000Z"
DATE_LITERAL : FULL_DATE 'T' FULL_TIME ('Z' | OFFSET ) ;
fragment FULL_DATE : DIGIT4 '-' DIGIT2 '-' DIGIT2 ;
fragment FULL_TIME : DIGIT2 ':' DIGIT2 ':' DIGIT2 ( '.' DIGIT+ )? ;
fragment OFFSET : ('+' | '-' ) DIGIT+ ':' DIGIT+ ;
fragment DIGIT4 : DIGIT2 DIGIT2 ;
fragment DIGIT2 : DIGIT DIGIT ;

//per il segno leggi float
//INTEGER_LITERAL  : (PLUS|MINUS)?DIGIT+;
INTEGER_LITERAL  : (LPAR MINUS RPAR)? DIGIT+;

STRING_LITERAL   :'"' (ESCAPED_QUOTE|~'"')* '"';
fragment ESCAPED_QUOTE : '""';
BOOLEAN_LITERAL  : 'true' | 'false' ;
/* Il +/- per indicare numeri positivi e negativi l'ho tolto dai fragment
 * a quanto pare, il +/- va gestito non come token, bensì come operatore unario
 * inoltre, questo deve avere la precedenza più alta in assoluto nell'espressione
 * infatti l'ho messo come prima alternativa a expr
 */
FLOAT_LITERAL    : /*(PLUS|MINUS)?*/(DIGIT)+ '.' (DIGIT)* FLOATEXP?
         	     | /*(PLUS|MINUS)?*/(DIGIT)+ FLOATEXP
         		 ;

fragment DIGIT    : '0'..'9' ;
fragment FLOATEXP : ('e'|'E')(PLUS|MINUS)?('0'..'9')+;

/* Variable */
/*
 * L'ho dovuto piazzare qui sotto per via di un problema di priorità.
 * Per evitare l'errore "mismatch 'X' expected {'X'...}", tutte le regole
 * devono trovarsi sopra quella usata per l'ID, nel mio caso varname.
 * Notare che si parla dei fragment usati per l'ID, non l'ID stesso,
 * infatti questo si trova come primo token.
 */
REG_IDENTIFIER : LETTER(LETTER|'_'|DIGIT)* ;
ESCAPED_IDENTIFIER:  QUOTE (~['\r\n] | '\'\'')+ QUOTE;
fragment QUOTE : '\'';


fragment LETTER   : 'A'..'Z' | 'a'..'z';

WS : [ \n\r\t\u000C] -> skip ;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : LineComment -> skip;

fragment LineComment
   : '//' ~ [\r\n]*
   ;

