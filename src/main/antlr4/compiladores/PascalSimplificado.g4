grammar PascalSimplificado;

options {
    caseInsensitive = true;
}

/** Regras gramaticais */

programa  : PROGRAM IDENTIFICADOR PONTOEVIRGULA corpo PONTO;
corpo     : declara BEGIN sentencas END;
declara   : (VAR dvar mais_dc)?;
mais_dc   : PONTOEVIRGULA cont_dc;
cont_dc   : (dvar mais_dc)?;
dvar      : variaveis DOISPONTOS tipo_var;
tipo_var  : INTEGER;
variaveis : IDENTIFICADOR mais_var;
mais_var  : (VIRGULA variaveis)?;
sentencas : comando mais_sentencas;
mais_sentencas : PONTOEVIRGULA cont_sentencas;
cont_sentencas : (sentencas)?;
var_read  : IDENTIFICADOR mais_var_read;
mais_var_read  : (VIRGULA var_read)?;
exp_write : IDENTIFICADOR mais_exp_write |
            STRING_LITERAL mais_exp_write |
            INTEIRO mais_exp_write;
mais_exp_write : (VIRGULA exp_write)?;
comando :
   READ PARENTESESESQ var_read PARENTESESDIR |
   WRITE PARENTESESESQ exp_write PARENTESESDIR |
   WRITELN PARENTESESESQ exp_write PARENTESESDIR |
   FOR IDENTIFICADOR ATRIBUICAO expressao TO expressao DO BEGIN sentencas END |
   REPEAT sentencas UNTIL PARENTESESESQ expressao_logica PARENTESESDIR |
   WHILE PARENTESESESQ expressao_logica PARENTESESDIR DO BEGIN sentencas END |
   IF PARENTESESESQ expressao_logica PARENTESESDIR THEN BEGIN sentencas END  pfalsa |
   IDENTIFICADOR ATRIBUICAO expressao;
pfalsa : (ELSE BEGIN sentencas END)?;
expressao_logica  : termo_logico mais_expr_logica;
mais_expr_logica  : (OR termo_logico mais_expr_logica)?;
termo_logico      : fator_logico mais_termo_logico;
mais_termo_logico : (AND fator_logico mais_termo_logico)?;
fator_logico : relacional |
               PARENTESESESQ expressao_logica PARENTESESDIR |
               NOT fator_logico |
               TRUE |
               FALSE;
relacional : expressao IGUAL      expressao |
             expressao MAIOR      expressao |
             expressao MAIORIGUAL expressao |
             expressao MENOR      expressao |
             expressao MENORIGUAL expressao |
             expressao DIFERENTE  expressao;
expressao  : termo mais_expressao;
/** mais_expressao : (SOMA termo mais_expressao |
                 SUBTRACAO termo mais_expressao)?; */
mais_expressao : (SOMA termo mais_expressao)? |
                 (SUBTRACAO termo mais_expressao)?;
termo : fator mais_termo;
mais_termo     : (MULTIPLICACAO fator mais_termo)? |
                 (DIVISAO fator mais_termo)?;
fator : IDENTIFICADOR | INTEIRO | PARENTESESESQ expressao PARENTESESDIR;


/** Itens léxicos */ 

AND       : 'AND';
ARRAY     : 'ARRAY';
BEGIN     : 'BEGIN';
CASE      : 'CASE';
CONST     : 'CONST';
DIV       : 'DIV';
DO        : 'DO';
DOWNTO    : 'DOWNTO';
ELSE      : 'ELSE';
END       : 'END';
FALSE     : 'FALSE';
FILE      : 'FILE';
FOR       : 'FOR';
FUNCTION  : 'FUNCTION';
GOTO      : 'GOTO';
IF        : 'IF';
IN        : 'IN';
LABEL     : 'LABEL';
MOD       : 'MOD';
NIL       : 'NIL';
NOT       : 'NOT';
OF        : 'OF';
OR        : 'OR';
PACKED    : 'PACKED';
PROCEDURE : 'PROCEDURE';
PROGRAM   : 'PROGRAM';
RECORD    : 'RECORD';
REPEAT    : 'REPEAT';
SET       : 'SET';
THEN      : 'THEN';
TO        : 'TO';
TYPE      : 'TYPE';
UNTIL     : 'UNTIL';
VAR       : 'VAR';
WHILE     : 'WHILE';
WITH      : 'WITH';
INTEGER   : 'INTEGER';
REAL      : 'REAL';
BOOLEAN   : 'BOOLEAN';
CHAR      : 'CHAR';
STRING    : 'STRING';
WRITE     : 'WRITE';
WRITELN   : 'WRITELN';
READ      : 'READ';
TRUE      : 'TRUE';

SOMA          : '+';
SUBTRACAO     : '-';
MULTIPLICACAO : '*';
DIVISAO       : '/';
MAIOR         : '>';
MENOR         : '<';
MAIORIGUAL    : '>=';
MENORIGUAL    : '<=';
DIFERENTE     : '<>';
IGUAL         : '=';
ATRIBUICAO    : ':=';
PONTOEVIRGULA : ';';
VIRGULA       : ',';
PONTO         : '.';
DOISPONTOS    : ':';
PARENTESESESQ : '(';
PARENTESESDIR : ')';

IDENTIFICADOR  : ('A' .. 'Z') ('A' .. 'Z' | '0' .. '9' | '_')*;
STRING_LITERAL : '\'' ('\'\'' | ~ ('\''))* '\'';
INTEIRO        : ('0' .. '9')+;

WS         : [ \t\r\n] -> skip;
COMENTARIO : '{' .*? '}' -> skip;

