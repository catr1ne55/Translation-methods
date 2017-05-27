grammar Java;

compilationUnit returns [String bytecode] 
    :   importDeclaration* typeDeclaration* EOF         {$bytecode = $typeDeclaration.bytecode;}
;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
;

typeDeclaration returns [String bytecode]
    :   classModifier* classDeclaration              {$bytecode = $classDeclaration.bytecode;}
    |   ';'
;

classModifier
    :   (   'public'     
        |   'protected'  
        |   'private'    
        |   'static'     
        )
;

variableModifier
    :   'final'
    ;

classDeclaration returns [String bytecode]
    :   'class' Identifier
        '{' classBodyDeclaration* '}'

    {StringBuilder s = new StringBuilder();
        for (ClassBodyDeclarationContext cbdc : _localctx.classBodyDeclaration()) {
             s.append(cbdc.bytecode);
        }
    $bytecode = ".class " + $Identifier.getText() + "\n" + s.toString();}
;

classBodyDeclaration returns [String bytecode]
    :   ';'
    |   classModifier* memberDeclaration     {$bytecode = $memberDeclaration.bytecode;}
    ;

memberDeclaration returns [String bytecode]
    :   methodDeclaration                    {$bytecode = $methodDeclaration.bytecode;}
    |   fieldDeclaration                     {$bytecode = $fieldDeclaration.bytecode;}
;

methodDeclaration returns [String bytecode]
    :   (typeType|'void') Identifier formalParameters ('[' ']')*
        (   methodBody
        |   ';'
        )                                    {$bytecode = ".func " + $Identifier.getText() + "\n" + $methodBody.bytecode + "ret\n\n";}
;

fieldDeclaration returns [String bytecode]
    :   typeType variableDeclarator ';'      {$bytecode = "." + $typeType.text + " " + $variableDeclarator.bytecode + "\n";}
;

variableDeclarator returns [String bytecode]
    :   variableDeclaratorId ('=' expression)?
        {String id = $variableDeclaratorId.text;
         String init = "ld 0\n";
         if (_localctx.expression() != null) {
             init = $expression.bytecode + "ldrax\npop rax\n";
         }
         $bytecode = id + "\n" + init;
        }
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
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

methodBody returns [String bytecode]
    :   '{' blockStatement* '}'
    {StringBuilder s = new StringBuilder();
     for (BlockStatementContext bsc : _localctx.blockStatement()) {
        s.append(bsc.bytecode);
      }
     $bytecode = s.toString();
    }
;

literal
    :   IntegerLiteral
    |   BooleanLiteral
    |   'null'
;


blockStatement returns [String bytecode]
    :   localVariableDeclarationStatement      {$bytecode = $localVariableDeclarationStatement.bytecode;}
    |   statement                              {$bytecode = " *** Statement -- to be written\n";}
    ;

localVariableDeclarationStatement returns [String bytecode]
    :    localVariableDeclaration ';'          {$bytecode = $localVariableDeclaration.bytecode;}
    ;

localVariableDeclaration returns [String bytecode]
    :   variableModifier* typeType variableDeclarator
    {$bytecode = "." + $typeType.text + " " + $variableDeclarator.bytecode + "\n";}
    ;

statement
    :   '{' blockStatement* '}'
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


expression returns [String bytecode]
    :   primary
    { $bytecode = $primary.bytecode;}
    |   expression '.' Identifier
    |   expression '(' expressionList? ')'
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

primary returns [String bytecode]
    :   '(' expression ')'          {$bytecode = $expression.bytecode;}
    |   literal                     {$bytecode = "push rax\nmov rax " + $literal.text + "\n";}
    |   Identifier                  {$bytecode = "push rax\nmov rax " + $Identifier.getText() + "\n";}
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
