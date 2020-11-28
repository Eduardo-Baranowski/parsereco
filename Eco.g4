grammar Eco;

eco: jogada+ EOF;

jogada: ('0' | NUMC | '9')+'.' (PECA? COLUNA NUMC)+ jogada | ('0' | NUMC | '9')+'.' (PECA? COLUNA NUMC)+;

NUMC: [1-8];

COLUNA: [a-h];
PECA: ('K' | 'Q' | 'R' | 'B' | 'N')+;

WS : [ \t\r\n]+ -> skip ;
