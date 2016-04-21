/**
 * Define a grammar called DJP
 */
 
grammar DJP;

body: (statement | functionCall)* expression? ;

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
: var = Identifier '=' e = expression
;

inbuiltFuncCall
: 'println' '(' prExpLn=expression? ')' | 'print' '(' prExp=expression? ')'
;

ifStatement
: ifStat elseIfStat* elseStat?
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

functionCall : 'func' Identifier '(' variableDeclarationList? ')' '{' body '}';

variableDeclarationList : variableDeclaration (',' variableDeclaration)*;

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
	| 'return' expression                           #return
	| Boolean                                       #bool
	| Identifier                                    #ident
	| Digit                                         #digit
;

variableDeclaration: Type=type assign=assignment ;

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
