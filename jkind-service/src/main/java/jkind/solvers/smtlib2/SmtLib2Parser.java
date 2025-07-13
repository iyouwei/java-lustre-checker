// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-service/src/main/java/jkind/solvers/smtlib2/SmtLib2.g4 by ANTLR 4.13.2
package jkind.solvers.smtlib2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SmtLib2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, BOOL=28, INT=29, REAL=30, ID=31, DIV0=32, 
		WS=33, ERROR=34;
	public static final int
		RULE_model = 0, RULE_define = 1, RULE_arg = 2, RULE_type = 3, RULE_body = 4, 
		RULE_binding = 5, RULE_fn = 6, RULE_symbol = 7, RULE_id = 8, RULE_qid = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "define", "arg", "type", "body", "binding", "fn", "symbol", 
			"id", "qid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'model'", "')'", "'define-fun'", "'Bool'", "'Int'", "'Real'", 
			"'let'", "'='", "'+'", "'*'", "'-'", "'/'", "'div'", "'mod'", "'and'", 
			"'or'", "'not'", "'=>'", "'ite'", "'>='", "'<='", "'<'", "'>'", "'to_real'", 
			"'to_int'", "'|'", null, null, null, null, "'/0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOL", "INT", "REAL", "ID", "DIV0", "WS", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SmtLib2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmtLib2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SmtLib2Parser.EOF, 0); }
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(21);
				match(T__1);
				}
			}

			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(24);
				define();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(T__2);
			setState(31);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefineContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(T__3);
			setState(35);
			id();
			setState(36);
			match(T__0);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(37);
				arg();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__2);
			setState(44);
			type();
			setState(45);
			body();
			setState(46);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			id();
			setState(50);
			type();
			setState(51);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetBodyContext extends BodyContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public LetBodyContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterLetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitLetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitLetBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsBodyContext extends BodyContext {
		public FnContext fn() {
			return getRuleContext(FnContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ConsBodyContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterConsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitConsBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitConsBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SymbolBodyContext extends BodyContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolBodyContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterSymbolBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitSymbolBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitSymbolBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SymbolBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				symbol();
				}
				break;
			case 2:
				_localctx = new ConsBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__0);
				setState(57);
				fn();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749570L) != 0)) {
					{
					{
					setState(58);
					body();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new LetBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__0);
				setState(67);
				match(T__7);
				setState(68);
				match(T__0);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(69);
					binding();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__2);
				setState(76);
				body();
				setState(77);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			id();
			setState(83);
			body();
			setState(84);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FnContext extends ParserRuleContext {
		public TerminalNode DIV0() { return getToken(SmtLib2Parser.DIV0, 0); }
		public FnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnContext fn() throws RecognitionException {
		FnContext _localctx = new FnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fn);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(T__12);
				}
				break;
			case DIV0:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(DIV0);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 13);
				{
				setState(98);
				match(T__19);
				}
				break;
			case T__0:
			case T__2:
			case T__26:
			case BOOL:
			case INT:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 15);
				{
				setState(100);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 16);
				{
				setState(101);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 17);
				{
				setState(102);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 18);
				{
				setState(103);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 19);
				{
				setState(104);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 20);
				{
				setState(105);
				match(T__25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(SmtLib2Parser.BOOL, 0); }
		public TerminalNode INT() { return getToken(SmtLib2Parser.INT, 0); }
		public TerminalNode REAL() { return getToken(SmtLib2Parser.REAL, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbol);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				id();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(REAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public TerminalNode ID() { return getToken(SmtLib2Parser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				qid();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmtLib2Parser.ID, 0); }
		public QidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).enterQid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmtLib2Listener ) ((SmtLib2Listener)listener).exitQid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmtLib2Visitor ) return ((SmtLib2Visitor<? extends T>)visitor).visitQid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QidContext qid() throws RecognitionException {
		QidContext _localctx = new QidContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__26);
			setState(119);
			match(ID);
			setState(120);
			match(T__26);
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

	public static final String _serializedATN =
		"\u0004\u0001\"{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0003\u0000\u0017\b"+
		"\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004"+
		"\n\u0004\f\u0004?\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004P\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006k\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007q\b\u0007\u0001\b\u0001\b\u0003\bu\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001\u0000\u0005\u0007\u008e\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u00040\u0001"+
		"\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000"+
		"\u0000\nQ\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0005\u0001\u0000\u0000\u0015\u0017\u0005\u0002\u0000"+
		"\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u001b\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f \u0005\u0000\u0000\u0001"+
		" \u0001\u0001\u0000\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\u0004"+
		"\u0000\u0000#$\u0003\u0010\b\u0000$(\u0005\u0001\u0000\u0000%\'\u0003"+
		"\u0004\u0002\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0003\u0000\u0000,-\u0003\u0006"+
		"\u0003\u0000-.\u0003\b\u0004\u0000./\u0005\u0003\u0000\u0000/\u0003\u0001"+
		"\u0000\u0000\u000001\u0005\u0001\u0000\u000012\u0003\u0010\b\u000023\u0003"+
		"\u0006\u0003\u000034\u0005\u0003\u0000\u00004\u0005\u0001\u0000\u0000"+
		"\u000056\u0007\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u00007P\u0003"+
		"\u000e\u0007\u000089\u0005\u0001\u0000\u00009=\u0003\f\u0006\u0000:<\u0003"+
		"\b\u0004\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AP\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0001\u0000\u0000CD\u0005\b\u0000\u0000DH\u0005\u0001\u0000"+
		"\u0000EG\u0003\n\u0005\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0003"+
		"\b\u0004\u0000MN\u0005\u0003\u0000\u0000NP\u0001\u0000\u0000\u0000O7\u0001"+
		"\u0000\u0000\u0000O8\u0001\u0000\u0000\u0000OB\u0001\u0000\u0000\u0000"+
		"P\t\u0001\u0000\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0003\u0010\b"+
		"\u0000ST\u0003\b\u0004\u0000TU\u0005\u0003\u0000\u0000U\u000b\u0001\u0000"+
		"\u0000\u0000Vk\u0005\t\u0000\u0000Wk\u0005\n\u0000\u0000Xk\u0005\u000b"+
		"\u0000\u0000Yk\u0005\f\u0000\u0000Zk\u0005\r\u0000\u0000[k\u0005 \u0000"+
		"\u0000\\k\u0005\u000e\u0000\u0000]k\u0005\u000f\u0000\u0000^k\u0005\u0010"+
		"\u0000\u0000_k\u0005\u0011\u0000\u0000`k\u0005\u0012\u0000\u0000ak\u0005"+
		"\u0013\u0000\u0000bk\u0005\u0014\u0000\u0000ck\u0001\u0000\u0000\u0000"+
		"dk\u0005\u0015\u0000\u0000ek\u0005\u0016\u0000\u0000fk\u0005\u0017\u0000"+
		"\u0000gk\u0005\u0018\u0000\u0000hk\u0005\u0019\u0000\u0000ik\u0005\u001a"+
		"\u0000\u0000jV\u0001\u0000\u0000\u0000jW\u0001\u0000\u0000\u0000jX\u0001"+
		"\u0000\u0000\u0000jY\u0001\u0000\u0000\u0000jZ\u0001\u0000\u0000\u0000"+
		"j[\u0001\u0000\u0000\u0000j\\\u0001\u0000\u0000\u0000j]\u0001\u0000\u0000"+
		"\u0000j^\u0001\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000j`\u0001\u0000"+
		"\u0000\u0000ja\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jc\u0001"+
		"\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000"+
		"jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000lq\u0003\u0010"+
		"\b\u0000mq\u0005\u001c\u0000\u0000nq\u0005\u001d\u0000\u0000oq\u0005\u001e"+
		"\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000"+
		"\u0000ru\u0003\u0012\t\u0000su\u0005\u001f\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000u\u0011\u0001\u0000\u0000\u0000vw\u0005"+
		"\u001b\u0000\u0000wx\u0005\u001f\u0000\u0000xy\u0005\u001b\u0000\u0000"+
		"y\u0013\u0001\u0000\u0000\u0000\t\u0016\u001b(=HOjpt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}