grammar Synlong;

//=========================
// Program
//=========================
program
    : decls* EOF
    ;

//=========================
// Declarations
//=========================
decls
    : type_block
    | const_block
    | user_op_decl
    ;

//-------------------------
// Type Declarations
//-------------------------
type_block
    : 'type' (type_decl ';')+
    ;

type_decl
    : ID ('=' type_def)?
    ;

type_def
    : type_expr
    | 'enum' '{' ID (',' ID)* '}'
    ;

type_expr
    : 'bool'
    | 'char'
    | 'byte' | 'ubyte'
    | 'short' | 'ushort'
    | 'int' | 'uint'
    | 'long' | 'ulong'
    | 'float' | 'real'
    | typevar
    | '{' field_decl (',' field_decl)* '}'
    | type_expr '^' const_expr
    ;

field_decl
    : ID ':' type_expr
    ;

typevar
    : ID
    ;

//-------------------------
// Constant Block
//-------------------------
const_block
    : 'const' (const_decl ';')+
    ;

const_decl
    : ID ':' type_expr ('=' const_expr)?
    ;

const_expr
    : ID
    | atom
    | unary_arith_op const_expr
    | const_expr bin_arith_op const_expr
    | const_expr bin_bool_op const_expr
    | const_expr bin_relation_op const_expr
    | '[' const_list ']'
    | '{' const_label_expr (',' const_label_expr)* '}'
    ;

const_list
    : (const_expr (',' const_expr)*)?
    ;

const_label_expr
    : ID ':' const_expr
    ;

//=========================
// User Operation Declaration
//=========================
user_op_decl
    : op_kind ID params returns_clause op_body
    | op_kind 'imported' ID params returns_clause
    ;

op_kind
    : 'function'
    | 'node'
    ;

params
    : '(' (var_decls (';' var_decls)*)? ')'
    ;

returns_clause
    : RETURNS params
    ;

op_body
    : ';'
    | local_block? (LET (equation ';')+ TEL ';'?)?
    ;

local_block
    : VAR (var_decls ';')+
    ;

var_decls
    : var_id (',' var_id)* ':' type_expr (when_decl)? (last_decl)?
    ;

var_id
    : ID
    ;

when_decl
    : 'when' clock_expr
    ;

clock_expr
    : ID
    | 'not' ID
    ;

last_decl
    : 'last' '=' const_expr
    ;

//=========================
// Equations
//=========================
equation
    : lhs '=' expr
    | state_machine return_statement
    ;

lhs
    : '(' ')'
    | lhs_id (',' lhs_id)*
    ;

lhs_id
    : ID
    ;

return_statement
    : RETURNS returns_var
    ;

returns_var
    : ID+
    ;

//=========================
// State Machines
//=========================
state_machine
    : AUTOMATON ID? state_decl+
    ;

state_decl
    : INITIAL? FINAL? STATE ID
      (UNLESS transition+)?
      state_body
      (UNTIL transition+)?
    ;

transition
    : IF expr (RESUME | RESTART) ID ';'
    ;

// ★ 核心改动：state_body 不再可空，避免预测混乱
state_body
    : local_block LET (equation ';')* TEL
    | LET (equation ';')* TEL
    | local_block
    | equation ';'
    ;

//=========================
// Expressions
//=========================
expr
    : simple_expr
    | 'last' '\'' ID
    | tempo_expr
    | bool_expr
    | array_expr
    | struct_expr
    | mixed_constructor
    | switch_expr
    | apply_expr
    ;

simple_expr
    : ID
    | atom
    | simple_expr '[' const_expr ']'
    | simple_expr '.' ID
    | unary_arith_op simple_expr
    | simple_expr bin_arith_op simple_expr
    | simple_expr bin_bool_op simple_expr
    | simple_expr bin_relation_op simple_expr
    | '(' type_expr simple_expr ')'
    ;

tempo_expr
    : 'pre' simple_expr
    | simple_expr '->' simple_expr
    | 'fby' '(' simple_expr ';' const_expr ';' simple_expr ')'
    | simple_expr 'fby' simple_expr
    | simple_expr 'when' clock_expr
    | 'merge' ID '(' simple_expr ',' simple_expr ')'
    ;

bool_expr
    : '#' '(' list ')'
    ;

array_expr
    : simple_expr '[' INTEGER '..' INTEGER ']'
    | '(' simple_expr '.' index+ 'default' simple_expr ')'
    | simple_expr '^' const_expr
    | '[' list ']'
    ;

struct_expr
    : '{' label_expr (',' label_expr)* '}'
    ;

label_expr
    : ID ':' simple_expr
    ;

mixed_constructor
    : '(' ID 'with' label_or_index+ '=' simple_expr ')'
    ;

label_or_index
    : '.' ID
    | index
    ;

index
    : '[' simple_expr ']'
    ;

switch_expr
    : IF simple_expr 'then' simple_expr 'else' simple_expr
    | '(' 'case' simple_expr 'of' case_expr+ ')'
    ;

case_expr
    : '|' pattern ':' simple_expr
    ;

pattern
    : ID
    | CHAR
    | '-'? INTEGER
    | 'true'
    | 'false'
    | '_'
    ;

apply_expr
    : prefix_operator '(' list ')'
    | '(' iterator '<<' prefix_operator ';' const_expr '>>' ')' '(' list ')'
    | '(' 'mapw' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr 'default' '(' list ')' ')' '(' list ')'
    | '(' 'mapwi' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr 'default' '(' list ')' ')' '(' list ')'
    | '(' 'foldw' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr ')' '(' list ')'
    | '(' 'foldwi' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr ')' '(' list ')'
    ;

prefix_operator
    : ID
    | prefix_unary_operator
    | prefix_binary_operator
    | '(' 'make' ID ')'
    | '(' 'flatten' ID ')'
    ;

prefix_unary_operator
    : '+$' | '-$' | 'not$' | 'short$' | 'int$' | 'float$' | 'real$'
    ;

prefix_binary_operator
    : '$+$' | '$-$' | '$*$' | '$/$' | '$mod$' | '$div$'
    | '$=$' | '$<>$' | '$<$' | '$>$' | '$<=$' | '$>=$'
    | '$and$' | '$or$' | '$xor$'
    ;

iterator
    : 'map' | 'fold' | 'mapi' | 'foldi' | 'mapfold'
    ;

list
    : (simple_expr (',' simple_expr)*)?
    ;

//=========================
// Operators
//=========================
unary_arith_op
    : '-' | '+' | 'not'
    ;

bin_arith_op
    : '+' | '-' | '*' | '/' | 'mod' | 'div'
    ;

bin_relation_op
    : '=' | '<>' | '<' | '>' | '<=' | '>='
    ;

bin_bool_op
    : 'and' | 'or' | 'xor'
    ;

//=========================
// Atoms
//=========================
atom
    : 'true'
    | 'false'
    | CHAR
    | INTEGER
    | UINT
    | FLOAT
    | REAL
    | USHORT
    | SHORT
    ;

//=========================
// Lexer Rules
//=========================
// ★ 关键字优先，必须放在 ID 之前
IF      : 'if';
VAR     : 'var';
LET     : 'let';
TEL     : 'tel';
STATE   : 'state';
UNLESS  : 'unless';
UNTIL   : 'until';
RESUME  : 'resume';
RESTART : 'restart';
INITIAL : 'initial';
FINAL   : 'final';
AUTOMATON : 'automaton';
RETURNS : 'returns';

ID      : [a-zA-Z_][a-zA-Z_0-9]*;
CHAR    : '\'' . '\'';
INTEGER : '0' | [1-9][0-9]*;
UINT    : INTEGER 'u';
FLOAT   : [0-9]+ '.' [0-9]* ([eE] [+-]? [0-9]+)? [fF];
REAL    : [0-9]+ '.' [0-9]* ([eE] [+-]? [0-9]+)?;
USHORT  : INTEGER 'us';
SHORT   : INTEGER 's';

COMMENT : '--' (~[%\n\r] ~[\n\r]* | /* empty */) ('\r'? '\n')? -> skip;
WS      : [ \t\r\n]+ -> skip;
