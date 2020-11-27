grammar Eco;
abertura : lance* EOF ;

lance: lance (L* '.' N+ T* ) lance | (L* '.' N+ T* ) lance | (L* '.' N+ T* ) lance | (L* '.' N+ T* );
N: [a-hA-Z]+;
T: [1-8]+;
L: [0-9]+;

WS : [ \t\r\n]+ -> skip ;
