grammar ReminderScript;

// Análise Sintática
start : com EOF ;

//Comandos
com : 'lembrete' nomeLembrete=STRING '{' 'mensagem' ':' mensagem=STRING ',' 'tempo' ':' dataRepeticao=DATA_HORA ',' 'repetir' ':' opcaoRepeticao=OPCOES_REPETICAO '}' #Lembrete
    ;

// Análise Léxica
STRING : '"' ('\\' . | ~["\\])* '"' ;
DATA_HORA : DIA '/' MES '/' ANO ' ' HORA ':' MINUTO ;
fragment DIA    : '0'[1-9] | [12][0-9] | '3'[01] ;
fragment MES  : '0'[1-9] | '1'[0-2] ;
fragment ANO   : [0-9][0-9][0-9][0-9] ;
fragment HORA   : '0'[0-9] | '1'[0-9] | '2'[0-3] ;
fragment MINUTO : [0-5][0-9] ;
OPCOES_REPETICAO: UNICO | DIARIO | SEMANAL | MENSAL;
fragment UNICO    : 'único' | 'Único';
fragment DIARIO  : 'diário' | 'Diário' ;
fragment SEMANAL   : 'semanal' | 'Semanal' ;
fragment MENSAL   : 'mensal' | 'Mensal' ;
ESPACOS : (' '|'\n'|'\r') -> skip ;