// Generated from Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOLEAN=2, CLASS=3, CONST=4, DO=5, ELSE=6, FINAL=7, FOR=8, IF=9, 
		IMPORT=10, INT=11, PACKAGE=12, PRIVATE=13, PROTECTED=14, PUBLIC=15, RETURN=16, 
		STATIC=17, VOID=18, WHILE=19, IntegerLiteral=20, BooleanLiteral=21, NullLiteral=22, 
		LPAREN=23, RPAREN=24, LBRACE=25, RBRACE=26, LBRACK=27, RBRACK=28, SEMI=29, 
		COMMA=30, DOT=31, ASSIGN=32, GT=33, LT=34, BANG=35, TILDE=36, QUESTION=37, 
		COLON=38, EQUAL=39, LE=40, GE=41, NOTEQUAL=42, AND=43, OR=44, INC=45, 
		DEC=46, ADD=47, SUB=48, MUL=49, DIV=50, BITAND=51, BITOR=52, CARET=53, 
		MOD=54, ADD_ASSIGN=55, SUB_ASSIGN=56, MUL_ASSIGN=57, DIV_ASSIGN=58, AND_ASSIGN=59, 
		OR_ASSIGN=60, XOR_ASSIGN=61, MOD_ASSIGN=62, LSHIFT_ASSIGN=63, RSHIFT_ASSIGN=64, 
		URSHIFT_ASSIGN=65, Identifier=66, WS=67, COMMENT=68, LINE_COMMENT=69;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_qualifiedName = 2, 
		RULE_typeDeclaration = 3, RULE_classModifier = 4, RULE_variableModifier = 5, 
		RULE_classDeclaration = 6, RULE_classBodyDeclaration = 7, RULE_memberDeclaration = 8, 
		RULE_methodDeclaration = 9, RULE_fieldDeclaration = 10, RULE_variableDeclarator = 11, 
		RULE_variableDeclaratorId = 12, RULE_typeType = 13, RULE_classType = 14, 
		RULE_primitiveType = 15, RULE_formalParameters = 16, RULE_formalParameterList = 17, 
		RULE_formalParameter = 18, RULE_lastFormalParameter = 19, RULE_methodBody = 20, 
		RULE_literal = 21, RULE_blockStatement = 22, RULE_localVariableDeclarationStatement = 23, 
		RULE_localVariableDeclaration = 24, RULE_statement = 25, RULE_forControl = 26, 
		RULE_forInit = 27, RULE_forUpdate = 28, RULE_parExpression = 29, RULE_expressionList = 30, 
		RULE_expression = 31, RULE_primary = 32;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "qualifiedName", "typeDeclaration", 
		"classModifier", "variableModifier", "classDeclaration", "classBodyDeclaration", 
		"memberDeclaration", "methodDeclaration", "fieldDeclaration", "variableDeclarator", 
		"variableDeclaratorId", "typeType", "classType", "primitiveType", "formalParameters", 
		"formalParameterList", "formalParameter", "lastFormalParameter", "methodBody", 
		"literal", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "forControl", "forInit", "forUpdate", "parExpression", "expressionList", 
		"expression", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'...'", "'boolean'", "'class'", "'const'", "'do'", "'else'", "'final'", 
		"'for'", "'if'", "'import'", "'int'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'static'", "'void'", "'while'", null, null, "'null'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
		"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
		"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BOOLEAN", "CLASS", "CONST", "DO", "ELSE", "FINAL", "FOR", 
		"IF", "IMPORT", "INT", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
		"STATIC", "VOID", "WHILE", "IntegerLiteral", "BooleanLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public String bytecode;
		public TypeDeclarationContext typeDeclaration;
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(66);
				importDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SEMI))) != 0)) {
				{
				{
				setState(72);
				((CompilationUnitContext)_localctx).typeDeclaration = typeDeclaration();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
			((CompilationUnitContext)_localctx).bytecode =  ((CompilationUnitContext)_localctx).typeDeclaration.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IMPORT);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(82);
				match(STATIC);
				}
			}

			setState(85);
			qualifiedName();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(86);
				match(DOT);
				setState(87);
				match(MUL);
				}
			}

			setState(90);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Identifier);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					match(DOT);
					setState(94);
					match(Identifier);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public ClassDeclarationContext classDeclaration;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(100);
					classModifier();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				((TypeDeclarationContext)_localctx).classDeclaration = classDeclaration();
				((TypeDeclarationContext)_localctx).bytecode =  ((TypeDeclarationContext)_localctx).classDeclaration.bytecode;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CLASS);
			setState(117);
			((ClassDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(118);
			match(LBRACE);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << SEMI))) != 0) || _la==Identifier) {
				{
				{
				setState(119);
				classBodyDeclaration();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(RBRACE);
			StringBuilder s = new StringBuilder();
			        for (ClassBodyDeclarationContext cbdc : _localctx.classBodyDeclaration()) {
			             s.append(cbdc.bytecode);
			        }
			    ((ClassDeclarationContext)_localctx).bytecode =  ".class " + ((ClassDeclarationContext)_localctx).Identifier.getText() + "\n" + s.toString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public MemberDeclarationContext memberDeclaration;
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(SEMI);
				}
				break;
			case BOOLEAN:
			case INT:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(129);
					classModifier();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				((ClassBodyDeclarationContext)_localctx).memberDeclaration = memberDeclaration();
				((ClassBodyDeclarationContext)_localctx).bytecode =  ((ClassBodyDeclarationContext)_localctx).memberDeclaration.bytecode;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public MethodDeclarationContext methodDeclaration;
		public FieldDeclarationContext fieldDeclaration;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memberDeclaration);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((MemberDeclarationContext)_localctx).methodDeclaration = methodDeclaration();
				((MemberDeclarationContext)_localctx).bytecode =  ((MemberDeclarationContext)_localctx).methodDeclaration.bytecode;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((MemberDeclarationContext)_localctx).fieldDeclaration = fieldDeclaration();
				((MemberDeclarationContext)_localctx).bytecode =  ((MemberDeclarationContext)_localctx).fieldDeclaration.bytecode;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public Token Identifier;
		public MethodBodyContext methodBody;
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case Identifier:
				{
				setState(148);
				typeType();
				}
				break;
			case VOID:
				{
				setState(149);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			((MethodDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(153);
			formalParameters();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(154);
				match(LBRACK);
				setState(155);
				match(RBRACK);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(161);
				((MethodDeclarationContext)_localctx).methodBody = methodBody();
				}
				break;
			case SEMI:
				{
				setState(162);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			((MethodDeclarationContext)_localctx).bytecode =  ".func " + ((MethodDeclarationContext)_localctx).Identifier.getText() + "\n" + ((MethodDeclarationContext)_localctx).methodBody.bytecode + "ret\n\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public TypeTypeContext typeType;
		public VariableDeclaratorContext variableDeclarator;
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((FieldDeclarationContext)_localctx).typeType = typeType();
			setState(168);
			((FieldDeclarationContext)_localctx).variableDeclarator = variableDeclarator();
			setState(169);
			match(SEMI);
			((FieldDeclarationContext)_localctx).bytecode =  "." + (((FieldDeclarationContext)_localctx).typeType!=null?_input.getText(((FieldDeclarationContext)_localctx).typeType.start,((FieldDeclarationContext)_localctx).typeType.stop):null) + " " + ((FieldDeclarationContext)_localctx).variableDeclarator.bytecode + "\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public String bytecode;
		public VariableDeclaratorIdContext variableDeclaratorId;
		public ExpressionContext expression;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((VariableDeclaratorContext)_localctx).variableDeclaratorId = variableDeclaratorId();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(173);
				match(ASSIGN);
				setState(174);
				((VariableDeclaratorContext)_localctx).expression = expression(0);
				}
			}

			String id = (((VariableDeclaratorContext)_localctx).variableDeclaratorId!=null?_input.getText(((VariableDeclaratorContext)_localctx).variableDeclaratorId.start,((VariableDeclaratorContext)_localctx).variableDeclaratorId.stop):null);
			         String init = "ld 0\n";
			         if (_localctx.expression() != null) {
			             init = ((VariableDeclaratorContext)_localctx).expression.bytecode + "ldrax\npop rax\n";
			         }
			         ((VariableDeclaratorContext)_localctx).bytecode =  id + "\n" + init;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Identifier);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(180);
				match(LBRACK);
				setState(181);
				match(RBRACK);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeType);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				classType();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(188);
					match(LBRACK);
					setState(189);
					match(RBRACK);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				primitiveType();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(196);
					match(LBRACK);
					setState(197);
					match(RBRACK);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Identifier);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(206);
				match(DOT);
				setState(207);
				match(Identifier);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LPAREN);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FINAL) | (1L << INT))) != 0) || _la==Identifier) {
				{
				setState(216);
				formalParameterList();
				}
			}

			setState(219);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				formalParameter();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						match(COMMA);
						setState(223);
						formalParameter();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(229);
					match(COMMA);
					setState(230);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(236);
				variableModifier();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			typeType();
			setState(243);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(245);
				variableModifier();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			typeType();
			setState(252);
			match(T__0);
			setState(253);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public String bytecode;
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LBRACE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << DO) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				{
				setState(256);
				blockStatement();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(RBRACE);
			StringBuilder s = new StringBuilder();
			     for (BlockStatementContext bsc : _localctx.blockStatement()) {
			        s.append(bsc.bytecode);
			      }
			     ((MethodBodyContext)_localctx).bytecode =  s.toString();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public String bytecode;
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement;
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockStatement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				((BlockStatementContext)_localctx).localVariableDeclarationStatement = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).bytecode =  ((BlockStatementContext)_localctx).localVariableDeclarationStatement.bytecode;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				statement();
				((BlockStatementContext)_localctx).bytecode =  " *** Statement -- to be written\n";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public String bytecode;
		public LocalVariableDeclarationContext localVariableDeclaration;
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((LocalVariableDeclarationStatementContext)_localctx).localVariableDeclaration = localVariableDeclaration();
			setState(276);
			match(SEMI);
			((LocalVariableDeclarationStatementContext)_localctx).bytecode =  ((LocalVariableDeclarationStatementContext)_localctx).localVariableDeclaration.bytecode;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public String bytecode;
		public TypeTypeContext typeType;
		public VariableDeclaratorContext variableDeclarator;
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(279);
				variableModifier();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			((LocalVariableDeclarationContext)_localctx).typeType = typeType();
			setState(286);
			((LocalVariableDeclarationContext)_localctx).variableDeclarator = variableDeclarator();
			((LocalVariableDeclarationContext)_localctx).bytecode =  "." + (((LocalVariableDeclarationContext)_localctx).typeType!=null?_input.getText(((LocalVariableDeclarationContext)_localctx).typeType.start,((LocalVariableDeclarationContext)_localctx).typeType.stop):null) + " " + ((LocalVariableDeclarationContext)_localctx).variableDeclarator.bytecode + "\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(LBRACE);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << DO) | (1L << FINAL) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					{
					setState(290);
					blockStatement();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(IF);
				setState(298);
				parExpression();
				setState(299);
				statement();
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(300);
					match(ELSE);
					setState(301);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(FOR);
				setState(305);
				match(LPAREN);
				setState(306);
				forControl();
				setState(307);
				match(RPAREN);
				setState(308);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(WHILE);
				setState(311);
				parExpression();
				setState(312);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(DO);
				setState(315);
				statement();
				setState(316);
				match(WHILE);
				setState(317);
				parExpression();
				setState(318);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(RETURN);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (IntegerLiteral - 20)) | (1L << (BooleanLiteral - 20)) | (1L << (NullLiteral - 20)) | (1L << (LPAREN - 20)) | (1L << (BANG - 20)) | (1L << (TILDE - 20)) | (1L << (INC - 20)) | (1L << (DEC - 20)) | (1L << (ADD - 20)) | (1L << (SUB - 20)) | (1L << (Identifier - 20)))) != 0)) {
					{
					setState(321);
					expression(0);
					}
				}

				setState(324);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				expression(0);
				setState(327);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(329);
				match(Identifier);
				setState(330);
				match(COLON);
				setState(331);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << FINAL) | (1L << INT) | (1L << IntegerLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(334);
				forInit();
				}
			}

			setState(337);
			match(SEMI);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (IntegerLiteral - 20)) | (1L << (BooleanLiteral - 20)) | (1L << (NullLiteral - 20)) | (1L << (LPAREN - 20)) | (1L << (BANG - 20)) | (1L << (TILDE - 20)) | (1L << (INC - 20)) | (1L << (DEC - 20)) | (1L << (ADD - 20)) | (1L << (SUB - 20)) | (1L << (Identifier - 20)))) != 0)) {
				{
				setState(338);
				expression(0);
				}
			}

			setState(341);
			match(SEMI);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (IntegerLiteral - 20)) | (1L << (BooleanLiteral - 20)) | (1L << (NullLiteral - 20)) | (1L << (LPAREN - 20)) | (1L << (BANG - 20)) | (1L << (TILDE - 20)) | (1L << (INC - 20)) | (1L << (DEC - 20)) | (1L << (ADD - 20)) | (1L << (SUB - 20)) | (1L << (Identifier - 20)))) != 0)) {
				{
				setState(342);
				forUpdate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forInit);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LPAREN);
			setState(352);
			expression(0);
			setState(353);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			expression(0);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				expression(0);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String bytecode;
		public PrimaryContext primary;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case LPAREN:
			case Identifier:
				{
				setState(364);
				((ExpressionContext)_localctx).primary = primary();
				 ((ExpressionContext)_localctx).bytecode =  ((ExpressionContext)_localctx).primary.bytecode;
				}
				break;
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(367);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(368);
				expression(14);
				}
				break;
			case BANG:
			case TILDE:
				{
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(374);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(377);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(378);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(387);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(380);
							match(LT);
							setState(381);
							match(LT);
							}
							break;
						case 2:
							{
							setState(382);
							match(GT);
							setState(383);
							match(GT);
							setState(384);
							match(GT);
							}
							break;
						case 3:
							{
							setState(385);
							match(GT);
							setState(386);
							match(GT);
							}
							break;
						}
						setState(389);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(391);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(392);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(393);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(394);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(395);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(397);
						match(BITAND);
						setState(398);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(400);
						match(CARET);
						setState(401);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(402);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(403);
						match(BITOR);
						setState(404);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(405);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(406);
						match(AND);
						setState(407);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(409);
						match(OR);
						setState(410);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(412);
						match(QUESTION);
						setState(413);
						expression(0);
						setState(414);
						match(COLON);
						setState(415);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(417);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(418);
						_la = _input.LA(1);
						if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (ASSIGN - 32)) | (1L << (ADD_ASSIGN - 32)) | (1L << (SUB_ASSIGN - 32)) | (1L << (MUL_ASSIGN - 32)) | (1L << (DIV_ASSIGN - 32)) | (1L << (AND_ASSIGN - 32)) | (1L << (OR_ASSIGN - 32)) | (1L << (XOR_ASSIGN - 32)) | (1L << (MOD_ASSIGN - 32)) | (1L << (LSHIFT_ASSIGN - 32)) | (1L << (RSHIFT_ASSIGN - 32)) | (1L << (URSHIFT_ASSIGN - 32)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(419);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(421);
						match(DOT);
						setState(422);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(423);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(424);
						match(LPAREN);
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (IntegerLiteral - 20)) | (1L << (BooleanLiteral - 20)) | (1L << (NullLiteral - 20)) | (1L << (LPAREN - 20)) | (1L << (BANG - 20)) | (1L << (TILDE - 20)) | (1L << (INC - 20)) | (1L << (DEC - 20)) | (1L << (ADD - 20)) | (1L << (SUB - 20)) | (1L << (Identifier - 20)))) != 0)) {
							{
							setState(425);
							expressionList();
							}
						}

						setState(428);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public String bytecode;
		public ExpressionContext expression;
		public LiteralContext literal;
		public Token Identifier;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primary);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(LPAREN);
				setState(437);
				((PrimaryContext)_localctx).expression = expression(0);
				setState(438);
				match(RPAREN);
				((PrimaryContext)_localctx).bytecode =  ((PrimaryContext)_localctx).expression.bytecode;
				}
				break;
			case IntegerLiteral:
			case BooleanLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((PrimaryContext)_localctx).literal = literal();
				((PrimaryContext)_localctx).bytecode =  "push rax\nmov rax " + (((PrimaryContext)_localctx).literal!=null?_input.getText(((PrimaryContext)_localctx).literal.start,((PrimaryContext)_localctx).literal.stop):null) + "\n";
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				((PrimaryContext)_localctx).Identifier = match(Identifier);
				((PrimaryContext)_localctx).bytecode =  "push rax\nmov rax " + ((PrimaryContext)_localctx).Identifier.getText() + "\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\5\3V\n\3\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\4\3\4\3\4\7"+
		"\4b\n\4\f\4\16\4e\13\4\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\5\5"+
		"q\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b"+
		"\3\b\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\3\t\5\t\u008d\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\13\3\13\5\13\u0099\n\13\3\13"+
		"\3\13\3\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\13\3\13\5\13"+
		"\u00a6\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b2\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\7\16\u00b9\n\16\f\16\16\16\u00bc\13\16\3\17\3\17"+
		"\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3\17\3\17\3\17\7\17\u00c9"+
		"\n\17\f\17\16\17\u00cc\13\17\5\17\u00ce\n\17\3\20\3\20\3\20\7\20\u00d3"+
		"\n\20\f\20\16\20\u00d6\13\20\3\21\3\21\3\22\3\22\5\22\u00dc\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\7\23\u00e3\n\23\f\23\16\23\u00e6\13\23\3\23\3\23"+
		"\5\23\u00ea\n\23\3\23\5\23\u00ed\n\23\3\24\7\24\u00f0\n\24\f\24\16\24"+
		"\u00f3\13\24\3\24\3\24\3\24\3\25\7\25\u00f9\n\25\f\25\16\25\u00fc\13\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u0104\n\26\f\26\16\26\u0107\13\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0114\n\30"+
		"\3\31\3\31\3\31\3\31\3\32\7\32\u011b\n\32\f\32\16\32\u011e\13\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\7\33\u0126\n\33\f\33\16\33\u0129\13\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0131\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0145"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u014f\n\33\3\34\5\34"+
		"\u0152\n\34\3\34\3\34\5\34\u0156\n\34\3\34\3\34\5\34\u015a\n\34\3\35\3"+
		"\35\5\35\u015e\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u0169\n"+
		" \f \16 \u016c\13 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0176\n!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0186\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\5!\u01ad\n!\3!\3!\3!\7!\u01b2\n!\f!\16!\u01b5\13!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c1\n\"\3\"\2\3@#\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\r\4\2\17\21\23\23"+
		"\4\2\4\4\r\r\3\2\26\30\3\2/\62\3\2%&\4\2\63\6488\3\2\61\62\4\2#$*+\4\2"+
		")),,\4\2\"\"9C\3\2/\60\2\u01e4\2G\3\2\2\2\4S\3\2\2\2\6^\3\2\2\2\bp\3\2"+
		"\2\2\nr\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20\u008c\3\2\2\2\22\u0094\3\2\2"+
		"\2\24\u0098\3\2\2\2\26\u00a9\3\2\2\2\30\u00ae\3\2\2\2\32\u00b5\3\2\2\2"+
		"\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 \u00d7\3\2\2\2\"\u00d9\3\2\2\2$\u00ec"+
		"\3\2\2\2&\u00f1\3\2\2\2(\u00fa\3\2\2\2*\u0101\3\2\2\2,\u010b\3\2\2\2."+
		"\u0113\3\2\2\2\60\u0115\3\2\2\2\62\u011c\3\2\2\2\64\u014e\3\2\2\2\66\u0151"+
		"\3\2\2\28\u015d\3\2\2\2:\u015f\3\2\2\2<\u0161\3\2\2\2>\u0165\3\2\2\2@"+
		"\u0175\3\2\2\2B\u01c0\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\b\5\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3QR\b\2\1\2R\3\3\2\2\2SU\7\f\2"+
		"\2TV\7\23\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WZ\5\6\4\2XY\7!\2\2Y[\7\63"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\37\2\2]\5\3\2\2\2^c\7D\2\2_`"+
		"\7!\2\2`b\7D\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\7\3\2\2\2ec"+
		"\3\2\2\2fh\5\n\6\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2k"+
		"i\3\2\2\2lm\5\16\b\2mn\b\5\1\2nq\3\2\2\2oq\7\37\2\2pi\3\2\2\2po\3\2\2"+
		"\2q\t\3\2\2\2rs\t\2\2\2s\13\3\2\2\2tu\7\t\2\2u\r\3\2\2\2vw\7\5\2\2wx\7"+
		"D\2\2x|\7\33\2\2y{\5\20\t\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\7\34\2\2\u0080\u0081\b\b\1\2\u0081\17\3\2"+
		"\2\2\u0082\u008d\7\37\2\2\u0083\u0085\5\n\6\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\22\n\2\u008a\u008b\b\t\1\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0086\3\2\2\2\u008d\21\3\2\2"+
		"\2\u008e\u008f\5\24\13\2\u008f\u0090\b\n\1\2\u0090\u0095\3\2\2\2\u0091"+
		"\u0092\5\26\f\2\u0092\u0093\b\n\1\2\u0093\u0095\3\2\2\2\u0094\u008e\3"+
		"\2\2\2\u0094\u0091\3\2\2\2\u0095\23\3\2\2\2\u0096\u0099\5\34\17\2\u0097"+
		"\u0099\7\24\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\7D\2\2\u009b\u00a0\5\"\22\2\u009c\u009d\7\35\2\2\u009d"+
		"\u009f\7\36\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a6\5*\26\2\u00a4\u00a6\7\37\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\13\1\2\u00a8\25\3\2\2\2\u00a9"+
		"\u00aa\5\34\17\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad"+
		"\b\f\1\2\u00ad\27\3\2\2\2\u00ae\u00b1\5\32\16\2\u00af\u00b0\7\"\2\2\u00b0"+
		"\u00b2\5@!\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b4\b\r\1\2\u00b4\31\3\2\2\2\u00b5\u00ba\7D\2\2\u00b6\u00b7"+
		"\7\35\2\2\u00b7\u00b9\7\36\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c2\5\36\20\2\u00be\u00bf\7\35\2\2\u00bf\u00c1\7\36\2"+
		"\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00ce\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\5 \21\2\u00c6"+
		"\u00c7\7\35\2\2\u00c7\u00c9\7\36\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00bd\3\2\2\2\u00cd\u00c5\3\2\2\2\u00ce\35\3\2\2"+
		"\2\u00cf\u00d4\7D\2\2\u00d0\u00d1\7!\2\2\u00d1\u00d3\7D\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\37\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8!\3\2\2\2\u00d9"+
		"\u00db\7\31\2\2\u00da\u00dc\5$\23\2\u00db\u00da\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\32\2\2\u00de#\3\2\2\2\u00df\u00e4"+
		"\5&\24\2\u00e0\u00e1\7 \2\2\u00e1\u00e3\5&\24\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7 \2\2\u00e8\u00ea\5(\25\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\5("+
		"\25\2\u00ec\u00df\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed%\3\2\2\2\u00ee\u00f0"+
		"\5\f\7\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5\34"+
		"\17\2\u00f5\u00f6\5\32\16\2\u00f6\'\3\2\2\2\u00f7\u00f9\5\f\7\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\34\17\2\u00fe"+
		"\u00ff\7\3\2\2\u00ff\u0100\5\32\16\2\u0100)\3\2\2\2\u0101\u0105\7\33\2"+
		"\2\u0102\u0104\5.\30\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\34\2\2\u0109\u010a\b\26\1\2\u010a+\3\2\2\2\u010b\u010c\t\4\2"+
		"\2\u010c-\3\2\2\2\u010d\u010e\5\60\31\2\u010e\u010f\b\30\1\2\u010f\u0114"+
		"\3\2\2\2\u0110\u0111\5\64\33\2\u0111\u0112\b\30\1\2\u0112\u0114\3\2\2"+
		"\2\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114/\3\2\2\2\u0115\u0116"+
		"\5\62\32\2\u0116\u0117\7\37\2\2\u0117\u0118\b\31\1\2\u0118\61\3\2\2\2"+
		"\u0119\u011b\5\f\7\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\5\34\17\2\u0120\u0121\5\30\r\2\u0121\u0122\b\32\1\2\u0122\63\3"+
		"\2\2\2\u0123\u0127\7\33\2\2\u0124\u0126\5.\30\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u014f\7\34\2\2\u012b\u012c\7\13\2\2\u012c"+
		"\u012d\5<\37\2\u012d\u0130\5\64\33\2\u012e\u012f\7\b\2\2\u012f\u0131\5"+
		"\64\33\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u014f\3\2\2\2\u0132"+
		"\u0133\7\n\2\2\u0133\u0134\7\31\2\2\u0134\u0135\5\66\34\2\u0135\u0136"+
		"\7\32\2\2\u0136\u0137\5\64\33\2\u0137\u014f\3\2\2\2\u0138\u0139\7\25\2"+
		"\2\u0139\u013a\5<\37\2\u013a\u013b\5\64\33\2\u013b\u014f\3\2\2\2\u013c"+
		"\u013d\7\7\2\2\u013d\u013e\5\64\33\2\u013e\u013f\7\25\2\2\u013f\u0140"+
		"\5<\37\2\u0140\u0141\7\37\2\2\u0141\u014f\3\2\2\2\u0142\u0144\7\22\2\2"+
		"\u0143\u0145\5@!\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u014f\7\37\2\2\u0147\u014f\7\37\2\2\u0148\u0149\5@!\2\u0149"+
		"\u014a\7\37\2\2\u014a\u014f\3\2\2\2\u014b\u014c\7D\2\2\u014c\u014d\7("+
		"\2\2\u014d\u014f\5\64\33\2\u014e\u0123\3\2\2\2\u014e\u012b\3\2\2\2\u014e"+
		"\u0132\3\2\2\2\u014e\u0138\3\2\2\2\u014e\u013c\3\2\2\2\u014e\u0142\3\2"+
		"\2\2\u014e\u0147\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u014b\3\2\2\2\u014f"+
		"\65\3\2\2\2\u0150\u0152\58\35\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0155\7\37\2\2\u0154\u0156\5@!\2\u0155\u0154"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\7\37\2\2"+
		"\u0158\u015a\5:\36\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\67"+
		"\3\2\2\2\u015b\u015e\5\62\32\2\u015c\u015e\5> \2\u015d\u015b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e9\3\2\2\2\u015f\u0160\5> \2\u0160;\3\2\2\2\u0161\u0162"+
		"\7\31\2\2\u0162\u0163\5@!\2\u0163\u0164\7\32\2\2\u0164=\3\2\2\2\u0165"+
		"\u016a\5@!\2\u0166\u0167\7 \2\2\u0167\u0169\5@!\2\u0168\u0166\3\2\2\2"+
		"\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b?\3"+
		"\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\b!\1\2\u016e\u016f\5B\"\2\u016f"+
		"\u0170\b!\1\2\u0170\u0176\3\2\2\2\u0171\u0172\t\5\2\2\u0172\u0176\5@!"+
		"\20\u0173\u0174\t\6\2\2\u0174\u0176\5@!\17\u0175\u016d\3\2\2\2\u0175\u0171"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u01b3\3\2\2\2\u0177\u0178\f\16\2\2"+
		"\u0178\u0179\t\7\2\2\u0179\u01b2\5@!\17\u017a\u017b\f\r\2\2\u017b\u017c"+
		"\t\b\2\2\u017c\u01b2\5@!\16\u017d\u0185\f\f\2\2\u017e\u017f\7$\2\2\u017f"+
		"\u0186\7$\2\2\u0180\u0181\7#\2\2\u0181\u0182\7#\2\2\u0182\u0186\7#\2\2"+
		"\u0183\u0184\7#\2\2\u0184\u0186\7#\2\2\u0185\u017e\3\2\2\2\u0185\u0180"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u01b2\5@!\r\u0188"+
		"\u0189\f\13\2\2\u0189\u018a\t\t\2\2\u018a\u01b2\5@!\f\u018b\u018c\f\n"+
		"\2\2\u018c\u018d\t\n\2\2\u018d\u01b2\5@!\13\u018e\u018f\f\t\2\2\u018f"+
		"\u0190\7\65\2\2\u0190\u01b2\5@!\n\u0191\u0192\f\b\2\2\u0192\u0193\7\67"+
		"\2\2\u0193\u01b2\5@!\t\u0194\u0195\f\7\2\2\u0195\u0196\7\66\2\2\u0196"+
		"\u01b2\5@!\b\u0197\u0198\f\6\2\2\u0198\u0199\7-\2\2\u0199\u01b2\5@!\7"+
		"\u019a\u019b\f\5\2\2\u019b\u019c\7.\2\2\u019c\u01b2\5@!\6\u019d\u019e"+
		"\f\4\2\2\u019e\u019f\7\'\2\2\u019f\u01a0\5@!\2\u01a0\u01a1\7(\2\2\u01a1"+
		"\u01a2\5@!\5\u01a2\u01b2\3\2\2\2\u01a3\u01a4\f\3\2\2\u01a4\u01a5\t\13"+
		"\2\2\u01a5\u01b2\5@!\3\u01a6\u01a7\f\23\2\2\u01a7\u01a8\7!\2\2\u01a8\u01b2"+
		"\7D\2\2\u01a9\u01aa\f\22\2\2\u01aa\u01ac\7\31\2\2\u01ab\u01ad\5> \2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b2\7\32"+
		"\2\2\u01af\u01b0\f\21\2\2\u01b0\u01b2\t\f\2\2\u01b1\u0177\3\2\2\2\u01b1"+
		"\u017a\3\2\2\2\u01b1\u017d\3\2\2\2\u01b1\u0188\3\2\2\2\u01b1\u018b\3\2"+
		"\2\2\u01b1\u018e\3\2\2\2\u01b1\u0191\3\2\2\2\u01b1\u0194\3\2\2\2\u01b1"+
		"\u0197\3\2\2\2\u01b1\u019a\3\2\2\2\u01b1\u019d\3\2\2\2\u01b1\u01a3\3\2"+
		"\2\2\u01b1\u01a6\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4A\3\2\2\2"+
		"\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7\31\2\2\u01b7\u01b8\5@!\2\u01b8\u01b9"+
		"\7\32\2\2\u01b9\u01ba\b\"\1\2\u01ba\u01c1\3\2\2\2\u01bb\u01bc\5,\27\2"+
		"\u01bc\u01bd\b\"\1\2\u01bd\u01c1\3\2\2\2\u01be\u01bf\7D\2\2\u01bf\u01c1"+
		"\b\"\1\2\u01c0\u01b6\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"C\3\2\2\2.GMUZcip|\u0086\u008c\u0094\u0098\u00a0\u00a5\u00b1\u00ba\u00c2"+
		"\u00ca\u00cd\u00d4\u00db\u00e4\u00e9\u00ec\u00f1\u00fa\u0105\u0113\u011c"+
		"\u0127\u0130\u0144\u014e\u0151\u0155\u0159\u015d\u016a\u0175\u0185\u01ac"+
		"\u01b1\u01b3\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}