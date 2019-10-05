

grammar language;

lang : declarationP;

declarationP:(instruction|declaration)+;
//instruction

instruction :(condition|boucle|affectation)(';'instruction)*;


//affectation

affectation : Variable ':=' expression;


//partie Expression
expression : UOP expression | expression (Arith|Compar|Logical) expression

            |expression'[' expression ']'|affectation|Variable |Number; //pas encore fait le tableau

condition: 'if' expression 'then' (instruction)+'else' (instruction)+;

boucle :'while' expression 'do' instruction;

//partie declaration de variable et de constante
declaration :decVar|decConst;
decVar :'var' Variable ':' type;
decConst:'const' Variable ':' (Number|'true'|'false');

type : 'integer'|'boolean'|'array of';
//la partie array n'ai tjrs pas faites

UOP :'-'|'not';
Arith: '+'|'-'|'*'|'/';
Logical:'and'|'or';
Compar :'<'|'≤'|'='|'!='|'>'|'≥';
Variable : [a-zA-Z]+[0-9]*;
Number:[0-9]+;
NEWLINE:('\r'?'\n'|'\r')+ ->skip;
WS : [ \t\r\n]+ -> skip;
