grammar Eco;

eco: jogada+ EOF;

jogada: C+'.' (P C)+ jogada | C+'.' (P C)+;

P: N+;
C: [1-8];

N: [a-z];

WS : [ \t\r\n]+ -> skip ;
