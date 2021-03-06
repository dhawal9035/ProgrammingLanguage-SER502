/**
 * Define a grammar called DJP
 */
 
grammar DJP;

body: (statement | functionDeclaration)* expression?;

statement
:
    variableDeclaration
	| assignment
	| inbuiltFuncCall
	| ifStatement
	| whileStat
	| expression
;

assignment
: var = Identifier ('=' e = expression)?
;

inbuiltFuncCall
: 'println' '(' prExpLn=expression? ')' | 'print' '(' prExp=expression? ')'
;

ifStatement
: ifs=ifStat elseIfStat* el=elseStat?
;

ifStat
: 'if' '(' ie=expression ')' '{' iftrue=body '}'
;

elseIfStat
: 'else if' '(' elseifex=expression ')' '{' ifelsetrue=body '}'
;

elseStat
: 'else' '{' elsetrue=body '}'
;

whileStat
: 'while' '(' whileEx=expression ')' '{' whileBody=body '}'
;

functionDeclaration : 'func' Identifier '(' para=parameterList ')' '{' funcBody=body '}';

parameterList : paraDec+=parameterDeclaration (',' paraDec+=parameterDeclaration)*
     |
;

parameterDeclaration : Type = type ident = Identifier ;

variableDeclaration: Type=type assign=assignment ;

functionCall: Identifier '(' expression (',' expression)* ')' ;

stack: stk='Stack' stckid=Identifier;

expression :
	left=expression DIV right=expression            #div
	| left=expression MUL right=expression          #mul
	| left=expression ADD right=expression          #add
	| left=expression SUB right=expression          #sub
	| left=expression GTE right=expression          #gte
	| left=expression LTE right=expression          #lte
	| left=expression GT right=expression           #gt
	| left=expression LT right=expression           #lt
	| left=expression EQUAL right=expression        #eq
	| left=expression NOTEQUALS right=expression    #ne
	| left=expression AND right=expression          #and
	| left=expression OR right=expression           #or
	| 'return' right=expression                     #return
	| Boolean                                       #bool
	| Identifier                                    #ident
	| Digit                                         #digit
	| functionCall                                  #funCall
	| stack                                         #stackDec
	| stackOps                                      #stackOper
	| functionCall                                  #visitFunc
;

stackOps:
    var = Identifier '.' 'push(' dig = Digit ')'
    | var = Identifier '.' 'pop()'
    | var = Identifier '.' 'isEmpty()'
    | var = Identifier '.' 'top()'
;

type: 'Boolean' | 'Num' ;

Boolean
   :
	'true'
	| 'false'
;

Identifier: [a-zA-Z_] [a-zA-Z_0-9]* ;

Comment: ('//' ~ [\r\n]* | '/*' .*? '*/') -> skip ;

Space: [ \t\r\n\u000C]+ -> skip ;

OR : '||' ;
AND : '&&' ;
GT : '>' ;
LT : '<' ;
GTE : '>=' ;
LTE : '<=' ;
EQUAL : '==' ;
NOTEQUALS : '!=' ;
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
COMMA : ',' ;
COLON : ':' ;
OPTIONAL : '?' ;
SEMICOLON : ';' ;
OPENBRACE : '{' ;
CLOSEBRACE : '}' ;
OPENBRACKET : '(' ;
CLOSEBRACKET : ')' ;
OPENSQUARE : '[' ;
CLOSESQUARE : ']' ;
ASSIGNMENT : '=' ;

Digit : [0-9]+ ;
