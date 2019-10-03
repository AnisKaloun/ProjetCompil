

grammar language;

lang : Variable*;





//partie Expression






//partie declaration de variable et de constante
decVar :'var' Variable '::=' type;
decConst: Variable '::=' (Number|'true'|'false');
type : Integer|Boolean|Array;
//la partie array n'ai tjrs pas faites

UOP :'-'|'not';
Arith: '+'|'-'|'*'|'/';
Logical:'and'|'or';
Compar :'<'|'≤'|'='|'='|'>'|'≥';
Variable : [a-zA-Z]+[0-9]*;
Number:[0-9]+;
NEWLINE:('\r'?'\n'|'\r')+ ;
WS : [ \t\r\n]+ -> skip;
Integer : 'integer';
Boolean : 'boolean';
Array : 'array of';
