grammar Java;

compilationUnit
    :   importDeclaration* typeDeclaration* EOF
;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
;

typeDeclaration
    :   classModifier* classDeclaration
    |   ';'
;

classModifier
    :   (   'public'     // class or interface
        |   'protected'  // class or interface
        |   'private'    // class or interface
        |   'static'     // class or interface
        )
;

variableModifier
    :   'final'
    ;

classDeclaration
    :   'class' Identifier
        classBody
;

classBody
    :   '{' classBodyDeclaration* '}'
;

classBodyDeclaration
    :   ';'
    |   'static'? block
    |   classModifier* memberDeclaration
    ;

memberDeclaration
    :   methodDeclaration
    |   fieldDeclaration
;

methodDeclaration
    :   (typeType|'void') Identifier formalParameters ('[' ']')*
        (   methodBody
        |   ';'
        )
;

fieldDeclaration
    :   typeType variableDeclarators ';'
;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

variableInitializer
    :   expression
;

typeType
    :   classType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;

classType
    :   Identifier ('.' Identifier)*
    ;

primitiveType
    :   'boolean'
    |   'int'
;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifier* typeType '...' variableDeclaratorId
;

methodBody
    :   block
;

literal
    :   IntegerLiteral
    |   BooleanLiteral
    |   'null'
;

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    |   typeDeclaration
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   variableModifier* typeType variableDeclarators
    ;

statement
    :   block
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'return' expression? ';'
    |   ';'
    |   expression ';'
    |   Identifier ':' statement
;

forControl
    :   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;


parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;


expression
    :   primary
    |   expression '.' Identifier
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   '(' typeType ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   <assoc=right> expression
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        expression
;

primary
    :   '(' expression ')'
    |   literal
    |   Identifier
    |   typeType '.' 'class'
    |   'void' '.' 'class'
;

BOOLEAN       : 'boolean';
CLASS         : 'class';
CONST         : 'const';
DO            : 'do';
ELSE          : 'else';
FINAL         : 'final';
FOR           : 'for';
IF            : 'if';
IMPORT        : 'import';
INT           : 'int';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
STATIC        : 'static';
VOID          : 'void';
WHILE         : 'while';

IntegerLiteral
    :   Sign?
        (   '0'
        |   NonZeroDigit Digit*
        )
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
Sign
    :   [+-]
;

BooleanLiteral
    :   'true'
    |   'false'
;

NullLiteral
    :   'null'
;

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';


ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] 
    |   ~[\u0000-\u007F\uD800-\uDBFF]
    |   [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_]
    |   ~[\u0000-\u007F\uD800-\uDBFF]
    |   [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
;
