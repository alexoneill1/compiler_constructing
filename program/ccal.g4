grammar ccal;

fragment A: 'a' | 'A';
fragment B: 'b' | 'B';
fragment C: 'c' | 'C';
fragment D: 'd' | 'D';
fragment E: 'e' | 'E';
fragment F: 'f' | 'F';
fragment G: 'g' | 'G';
fragment H: 'h' | 'H';
fragment I: 'i' | 'I';
fragment J: 'j' | 'J';
fragment K: 'k' | 'K';
fragment L: 'l' | 'L';
fragment M: 'm' | 'M';
fragment N: 'n' | 'N';
fragment O: 'o' | 'O';
fragment P: 'p' | 'P';
fragment Q: 'q' | 'Q';
fragment R: 'r' | 'R';
fragment S: 's' | 'S';
fragment T: 't' | 'T';
fragment U: 'u' | 'U';
fragment V: 'v' | 'V';
fragment W: 'w' | 'W';
fragment X: 'x' | 'X';
fragment Y: 'y' | 'Y';
fragment Z: 'z' | 'Z';
fragment Letter: [a-zA-Z]+;

VAR: V A R;
CONST: C O N S T;
RETURN: R E T U R N;
INTEGER: I N T E G E R;
BOOLEAN: B O O L E A N;
VOID: V O I D;
MAIN: M A I N;
IF: I F;
ELSE: E L S E;
TRUE: T R U E;
FALSE: F A L S E;
WHILE: W H I L E;
SK: S K I P;

COMMA: ',';
UNDERSCORE: '_';
SEMI: ';';
COLON: ':';
EQ: '=';
OPENCUR: '{';
CLOSEDCUR: '}';
OPENBRA: '(';
CLOSEDBRA: ')';
ADD: '+';
SUB: '-';
TIL: '~';
OR: '||';
AND: '&&';
EQUIV: '==';
NOTEQ: '!=';
LT: '<';
LTEQ: '<=';
GT: '>';
GTEQ: '>=';
NUMBER:   '0' | ([1-9]|'-')[0-9]*;
ID:   Letter (Letter | NUMBER | UNDERSCORE)*;
WS:     [ \n\t\r] -> skip ;
COMMENT:   '/*' (COMMENT| .)*? '*/' -> skip;
LINE_COMMENT:   '//' .*? '\n' -> skip;

program: decl_list function_list main;
decl_list: decl SEMI decl_list
        |/*epsilon*/;
decl: var_decl
        | const_decl;
var_decl: VAR ID COLON type;
const_decl: CONST ID COLON type EQ expression;
function_list: function function_list
        |/*epsilon*/;
function: type ID OPENBRA parameter_list CLOSEDBRA
        OPENCUR
        decl_list
        statement_block
        RETURN OPENBRA (/*epsilon*/| expression) CLOSEDBRA SEMI
        CLOSEDCUR;
type:   INTEGER
        | BOOLEAN
        | VOID;
parameter_list: nemp_paramter_list
        |/*epsilon*/;
nemp_paramter_list: ID COLON type
        | ID COLON type COMMA nemp_paramter_list;
main: MAIN OPENCUR decl_list statement_block CLOSEDCUR;
statement_block: statement statement_block
        |/*epsilon*/;
statement: ID EQ expression SEMI
        | ID OPENBRA arg_list CLOSEDBRA SEMI
        | OPENCUR statement_block CLOSEDCUR
        | IF condition OPENCUR statement_block CLOSEDCUR ELSE OPENCUR statement_block CLOSEDCUR
        | WHILE condition OPENCUR statement_block CLOSEDCUR
        | SK SEMI;
expression: frag binary_arith_op frag
        | OPENBRA expression CLOSEDBRA
        | ID OPENBRA arg_list CLOSEDBRA
        | frag;
binary_arith_op: ADD
        | SUB;
frag: ID
        | SUB ID
        | NUMBER
        | TRUE
        | FALSE
        | OPENBRA expression CLOSEDBRA
        ;
condition: TIL condition
        | OPENBRA condition CLOSEDBRA
        | expression comp_op expression
        | condition (OR | AND) condition;
comp_op: EQUIV
        | NOTEQ
        | GT
        | GTEQ
        | LT
        | LTEQ;
arg_list: nemp_arg_list
        |/*epsilon*/;
nemp_arg_list: ID
        | ID COMMA nemp_arg_list;
