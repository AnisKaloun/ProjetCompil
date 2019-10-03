

grammar language;

lang : Variable*;

//affectation

affectation : Variable ':=' expression;


//partie Expression
expression :Variable |Number | UOP expression | expression (Arith|Compar|Logical) expression

            |expression'[' expression ']'; //pas encore fait le tableau



//partie declaration de variable et de constante
decVar :'var' Variable ':' type;
decConst: Variable ':=' (Number|'true'|'false');

type : 'integer'|'boolean'|'array of';
//la partie array n'ai tjrs pas faites

UOP :'-'|'not';
Arith: '+'|'-'|'*'|'/';
Logical:'and'|'or';
Compar :'<'|'≤'|'='|'!='|'>'|'≥';
Variable : [a-zA-Z]+[0-9]*;
Number:[0-9]+;
NEWLINE:('\r'?'\n'|'\r')+ ;
WS : [ \t\r\n]+ -> skip;
