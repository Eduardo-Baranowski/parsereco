grammar Eco;
abertura : lance* EOF ;
lance : NUMBER '.' 'b4' ID+ ;
NUMBER : [0-9]+ ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;
