grammar QALC;

parse
 : function* EOF
 ;

 function
    :FUNCID '(' fpars ')' '{'block'}';

 block
  : stat*
  ;

stat
 : assigment
 | vatrib ';'
 | if_stat
 | while_stat
 | for_stat
 | RETURN expr ';'
 | BREAK';'
 | SWITCH '(' expr ')' '{' ('case' atom':' stat*)* ('default' ':' stat)? '}'
 | LKEY block RKEY
 ;

assigment
    :type VARID ';'
    ;

if_stat
 : IF '('expr')' stat_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

 condition_block
  : expr stat_block
  ;

 stat_block
  : LKEY block RKEY
  | stat
  |
  ;

 while_stat
  : WHILE '('expr')' stat_block
  ;

for_stat
    : FOR '(' expr ';' expr ';' expr ')' stat_block
    ;



vatrib : VARID '=' vatrib | expr ;

type
    : 'int'
    | 'float'
    | 'double'
    | 'bool'
    | 'char'
    ;

expr
    : NUML                                  #NumberLiteral
    | VARID                                 #VariableUse
    | VARID                                 #VartAtribution
    | RESID                                 #ResultUse
    | fcall                                 #FunctionCall
    | '(' expr ')'                          #ParenthesisExpression
    |<assoc=right> '!' expr                 #NotExpression
    |<assoc=right> expr '^' expr            #PowerExpression
    |<assoc=right> '+' expr                 #UnaryPlusExpression
    |<assoc=right> '-' expr                 #UnaryMinusExpression
    | expr '%' expr                         #ModExpression
    | expr '*' expr                         #TimesExpression
    | expr '/' expr                         #DivExpression
    | expr '+' expr                         #PlusExpression
    | expr '-' expr                         #MinusExpression
    | expr ('<' | '<=' | '>' | '>=') expr   #OrderingExpression
    | expr ('==' | '!=') expr               #EqualityExpression
    | expr '&&' expr                        #AndExpression
    | expr '||' expr                        #OrExpression
    | atom                                  #AtomLiteral;

atom
 : (TRUE | FALSE)           #booleanAtom
 | NUML                     #Numeroliteral
 | STRL                     #stringAtom
 | NULL                     #nilAtom
 ;



fcall : FUNCID '(' rpars ')' ;

fpars
    : type VARID (',' type VARID)*
    | // empty
    ;

rpars
    : expr (',' expr)*
    | // empty
    ;

RETURN  : 'return';
BREAK   : 'break';
INT     : 'int';
DOUBLE  : 'double';
FLOAT   : 'float';
CHAR    : 'char';
ELSE    : 'else';
IF      : 'if';
FOR     : 'for';
WHILE   : 'while';
SWITCH  : 'switch';
TRUE    : 'true';
FALSE   : 'false';
NULL    : 'null';


LKEY    : '{' ;
RKEY    : '}' ;
SEMI    : ';' ;
LPAREN  : '(' ;
RPAREN  : ')' ;

EQUAL   : '==';
NEQ     : '!=';
LEQ     : '<=';
LQ      : '<';
GEQ     : '>=';
GT      : '>';

NOT     : '!';
AND     : '&&';
OR      : '||';
INC     : '++';
DEC     : '--';
ATRIB   : '=' ;
CARET   : '^' ;
ADD     : '+' ;
SUB     : '-' ;
MOD     : '%' ;
MUL     : '*' ;
DIV     : '/' ;
COMMA   : ',' ;


VARID  : '$' [a-zA-Z]([0-9]|[a-zA-Z])* {br.ufc.comp.qalc.symbols.Symbol.getSymbolFor(this.getText());};
RESID  : '$' ([0-9]* [1-9] [0-9]* | '?') ;
FUNCID : '@' [0-9a-zA-Z]+ ;
NUML   : [0-9]+ ('.' [0-9]+)? ;
STRL   : '"' .*? '"';
COM    : '#' ~[\r\n]* -> skip ;
WHITE  : [ \t\r\n]+ -> skip ;