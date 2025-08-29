// Generated from /Users/wei/IdeaProjects/java-lustre-checker/jkind-server/src/main/java/com/ecnu/synlong/parser/synlong/Synlong.g4 by ANTLR 4.13.2
package com.ecnu.synlong.parser.synlong.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SynlongParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, IF=100, VAR=101, LET=102, 
		TEL=103, STATE=104, UNLESS=105, UNTIL=106, RESUME=107, RESTART=108, INITIAL=109, 
		FINAL=110, AUTOMATON=111, RETURNS=112, ID=113, CHAR=114, INTEGER=115, 
		UINT=116, FLOAT=117, REAL=118, USHORT=119, SHORT=120, COMMENT=121, WS=122;
	public static final int
		RULE_program = 0, RULE_decls = 1, RULE_type_block = 2, RULE_type_decl = 3, 
		RULE_type_def = 4, RULE_type_expr = 5, RULE_field_decl = 6, RULE_typevar = 7, 
		RULE_const_block = 8, RULE_const_decl = 9, RULE_const_expr = 10, RULE_const_list = 11, 
		RULE_const_label_expr = 12, RULE_user_op_decl = 13, RULE_op_kind = 14, 
		RULE_params = 15, RULE_returns_clause = 16, RULE_op_body = 17, RULE_local_block = 18, 
		RULE_var_decls = 19, RULE_var_id = 20, RULE_when_decl = 21, RULE_clock_expr = 22, 
		RULE_last_decl = 23, RULE_equation = 24, RULE_lhs = 25, RULE_lhs_id = 26, 
		RULE_return_statement = 27, RULE_returns_var = 28, RULE_state_machine = 29, 
		RULE_state_decl = 30, RULE_state_body = 31, RULE_let_block = 32, RULE_transition = 33, 
		RULE_expr = 34, RULE_simple_expr = 35, RULE_tempo_expr = 36, RULE_bool_expr = 37, 
		RULE_array_expr = 38, RULE_struct_expr = 39, RULE_label_expr = 40, RULE_mixed_constructor = 41, 
		RULE_label_or_index = 42, RULE_index = 43, RULE_switch_expr = 44, RULE_case_expr = 45, 
		RULE_pattern = 46, RULE_apply_expr = 47, RULE_prefix_operator = 48, RULE_prefix_unary_operator = 49, 
		RULE_prefix_binary_operator = 50, RULE_iterator = 51, RULE_list = 52, 
		RULE_unary_arith_op = 53, RULE_bin_arith_op = 54, RULE_bin_relation_op = 55, 
		RULE_bin_bool_op = 56, RULE_atom = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decls", "type_block", "type_decl", "type_def", "type_expr", 
			"field_decl", "typevar", "const_block", "const_decl", "const_expr", "const_list", 
			"const_label_expr", "user_op_decl", "op_kind", "params", "returns_clause", 
			"op_body", "local_block", "var_decls", "var_id", "when_decl", "clock_expr", 
			"last_decl", "equation", "lhs", "lhs_id", "return_statement", "returns_var", 
			"state_machine", "state_decl", "state_body", "let_block", "transition", 
			"expr", "simple_expr", "tempo_expr", "bool_expr", "array_expr", "struct_expr", 
			"label_expr", "mixed_constructor", "label_or_index", "index", "switch_expr", 
			"case_expr", "pattern", "apply_expr", "prefix_operator", "prefix_unary_operator", 
			"prefix_binary_operator", "iterator", "list", "unary_arith_op", "bin_arith_op", 
			"bin_relation_op", "bin_bool_op", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'type'", "';'", "'='", "'enum'", "'{'", "','", "'}'", "'bool'", 
			"'char'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", 
			"'long'", "'ulong'", "'float'", "'real'", "'^'", "':'", "'const'", "'['", 
			"']'", "'imported'", "'function'", "'node'", "'('", "')'", "'when'", 
			"'not'", "'last'", "'''", "'.'", "'pre'", "'->'", "'fby'", "'merge'", 
			"'#'", "'..'", "'default'", "'with'", "'then'", "'else'", "'case'", "'of'", 
			"'|'", "'-'", "'true'", "'false'", "'_'", "'<<'", "'>>'", "'mapw'", "'mapwi'", 
			"'foldw'", "'foldwi'", "'make'", "'flatten'", "'+$'", "'-$'", "'not$'", 
			"'short$'", "'int$'", "'float$'", "'real$'", "'$+$'", "'$-$'", "'$*$'", 
			"'$/$'", "'$mod$'", "'$div$'", "'$=$'", "'$<>$'", "'$<$'", "'$>$'", "'$<=$'", 
			"'$>=$'", "'$and$'", "'$or$'", "'$xor$'", "'map'", "'fold'", "'mapi'", 
			"'foldi'", "'mapfold'", "'+'", "'*'", "'/'", "'mod'", "'div'", "'<>'", 
			"'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'xor'", "'if'", "'var'", 
			"'let'", "'tel'", "'state'", "'unless'", "'until'", "'resume'", "'restart'", 
			"'initial'", "'final'", "'automaton'", "'returns'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IF", "VAR", "LET", "TEL", "STATE", "UNLESS", 
			"UNTIL", "RESUME", "RESTART", "INITIAL", "FINAL", "AUTOMATON", "RETURNS", 
			"ID", "CHAR", "INTEGER", "UINT", "FLOAT", "REAL", "USHORT", "SHORT", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "Synlong.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SynlongParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SynlongParser.EOF, 0); }
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 205520898L) != 0)) {
				{
				{
				setState(116);
				decls();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
	 
		public DeclsContext() { }
		public void copyFrom(DeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UserOpDeclarationContext extends DeclsContext {
		public User_op_declContext user_op_decl() {
			return getRuleContext(User_op_declContext.class,0);
		}
		public UserOpDeclarationContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUserOpDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUserOpDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUserOpDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends DeclsContext {
		public Type_blockContext type_block() {
			return getRuleContext(Type_blockContext.class,0);
		}
		public TypeDeclarationContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends DeclsContext {
		public Const_blockContext const_block() {
			return getRuleContext(Const_blockContext.class,0);
		}
		public ConstDeclarationContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				type_block();
				}
				break;
			case T__21:
				_localctx = new ConstDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				const_block();
				}
				break;
			case T__25:
			case T__26:
				_localctx = new UserOpDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				user_op_decl();
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
	public static class Type_blockContext extends ParserRuleContext {
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public Type_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterType_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitType_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitType_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_blockContext type_block() throws RecognitionException {
		Type_blockContext _localctx = new Type_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__0);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				type_decl();
				setState(131);
				match(T__1);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(138);
				match(T__2);
				setState(139);
				type_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_defContext extends ParserRuleContext {
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
	 
		public Type_defContext() { }
		public void copyFrom(Type_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefContext extends Type_defContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public EnumDefContext(Type_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEnumDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEnumDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeExprDefContext extends Type_defContext {
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public TypeExprDefContext(Type_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypeExprDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypeExprDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypeExprDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_def);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case ID:
				_localctx = new TypeExprDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				type_expr(0);
				}
				break;
			case T__3:
				_localctx = new EnumDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__3);
				setState(144);
				match(T__4);
				setState(145);
				match(ID);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(146);
					match(T__5);
					setState(147);
					match(ID);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__6);
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
	public static class Type_exprContext extends ParserRuleContext {
		public Type_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expr; }
	 
		public Type_exprContext() { }
		public void copyFrom(Type_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTypeContext extends Type_exprContext {
		public BoolTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LongTypeContext extends Type_exprContext {
		public LongTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLongType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLongType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLongType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeContext extends Type_exprContext {
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public StructTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ULongTypeContext extends Type_exprContext {
		public ULongTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterULongType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitULongType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitULongType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortTypeContext extends Type_exprContext {
		public ShortTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterShortType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitShortType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitShortType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteTypeContext extends Type_exprContext {
		public ByteTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitByteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitByteType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealTypeContext extends Type_exprContext {
		public RealTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterRealType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitRealType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitRealType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarTypeContext extends Type_exprContext {
		public TypevarContext typevar() {
			return getRuleContext(TypevarContext.class,0);
		}
		public VarTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends Type_exprContext {
		public IntTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends Type_exprContext {
		public FloatTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends Type_exprContext {
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ArrayTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UShortTypeContext extends Type_exprContext {
		public UShortTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUShortType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUShortType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUShortType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UByteTypeContext extends Type_exprContext {
		public UByteTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUByteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUByteType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends Type_exprContext {
		public CharTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UIntTypeContext extends Type_exprContext {
		public UIntTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_exprContext type_expr() throws RecognitionException {
		return type_expr(0);
	}

	private Type_exprContext type_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_exprContext _localctx = new Type_exprContext(_ctx, _parentState);
		Type_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new ByteTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new UByteTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__10);
				}
				break;
			case T__11:
				{
				_localctx = new ShortTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__11);
				}
				break;
			case T__12:
				{
				_localctx = new UShortTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__12);
				}
				break;
			case T__13:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__13);
				}
				break;
			case T__14:
				{
				_localctx = new UIntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__14);
				}
				break;
			case T__15:
				{
				_localctx = new LongTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__15);
				}
				break;
			case T__16:
				{
				_localctx = new ULongTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(T__16);
				}
				break;
			case T__17:
				{
				_localctx = new FloatTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__17);
				}
				break;
			case T__18:
				{
				_localctx = new RealTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(T__18);
				}
				break;
			case ID:
				{
				_localctx = new VarTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				typevar();
				}
				break;
			case T__4:
				{
				_localctx = new StructTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__4);
				setState(171);
				field_decl();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(172);
					match(T__5);
					setState(173);
					field_decl();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new Type_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type_expr);
					setState(183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(184);
					match(T__19);
					setState(185);
					const_expr(0);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitField_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitField_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(192);
			match(T__20);
			setState(193);
			type_expr(0);
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
	public static class TypevarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TypevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypevar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypevarContext typevar() throws RecognitionException {
		TypevarContext _localctx = new TypevarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
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
	public static class Const_blockContext extends ParserRuleContext {
		public List<Const_declContext> const_decl() {
			return getRuleContexts(Const_declContext.class);
		}
		public Const_declContext const_decl(int i) {
			return getRuleContext(Const_declContext.class,i);
		}
		public Const_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_blockContext const_block() throws RecognitionException {
		Const_blockContext _localctx = new Const_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__21);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				const_decl();
				setState(199);
				match(T__1);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_const_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(T__20);
			setState(207);
			type_expr(0);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(208);
				match(T__2);
				setState(209);
				const_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_exprContext extends ParserRuleContext {
		public Const_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_expr; }
	 
		public Const_exprContext() { }
		public void copyFrom(Const_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstIdContext extends Const_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ConstIdContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstUnaryOpContext extends Const_exprContext {
		public Unary_arith_opContext unary_arith_op() {
			return getRuleContext(Unary_arith_opContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ConstUnaryOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBinArithOpContext extends Const_exprContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Bin_arith_opContext bin_arith_op() {
			return getRuleContext(Bin_arith_opContext.class,0);
		}
		public ConstBinArithOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstBinArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstBinArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstBinArithOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstStructContext extends Const_exprContext {
		public List<Const_label_exprContext> const_label_expr() {
			return getRuleContexts(Const_label_exprContext.class);
		}
		public Const_label_exprContext const_label_expr(int i) {
			return getRuleContext(Const_label_exprContext.class,i);
		}
		public ConstStructContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstArrayContext extends Const_exprContext {
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public ConstArrayContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstAtomContext extends Const_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstAtomContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBinRelOpContext extends Const_exprContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Bin_relation_opContext bin_relation_op() {
			return getRuleContext(Bin_relation_opContext.class,0);
		}
		public ConstBinRelOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstBinRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstBinRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstBinRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBinBoolOpContext extends Const_exprContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Bin_bool_opContext bin_bool_op() {
			return getRuleContext(Bin_bool_opContext.class,0);
		}
		public ConstBinBoolOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstBinBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstBinBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstBinBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_exprContext const_expr() throws RecognitionException {
		return const_expr(0);
	}

	private Const_exprContext const_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Const_exprContext _localctx = new Const_exprContext(_ctx, _parentState);
		Const_exprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_const_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ConstIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				match(ID);
				}
				break;
			case T__48:
			case T__49:
			case CHAR:
			case INTEGER:
			case UINT:
			case FLOAT:
			case REAL:
			case USHORT:
			case SHORT:
				{
				_localctx = new ConstAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				atom();
				}
				break;
			case T__30:
			case T__47:
			case T__86:
				{
				_localctx = new ConstUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				unary_arith_op();
				setState(216);
				const_expr(6);
				}
				break;
			case T__22:
				{
				_localctx = new ConstArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(T__22);
				setState(219);
				const_list();
				setState(220);
				match(T__23);
				}
				break;
			case T__4:
				{
				_localctx = new ConstStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(T__4);
				setState(223);
				const_label_expr();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(224);
					match(T__5);
					setState(225);
					const_label_expr();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ConstBinArithOpContext(new Const_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_const_expr);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						bin_arith_op();
						setState(237);
						const_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ConstBinBoolOpContext(new Const_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_const_expr);
						setState(239);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(240);
						bin_bool_op();
						setState(241);
						const_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ConstBinRelOpContext(new Const_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_const_expr);
						setState(243);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(244);
						bin_relation_op();
						setState(245);
						const_expr(4);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_listContext extends ParserRuleContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Const_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_listContext const_list() throws RecognitionException {
		Const_listContext _localctx = new Const_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970326992846880L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 17112760321L) != 0)) {
				{
				setState(252);
				const_expr(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(253);
					match(T__5);
					setState(254);
					const_expr(0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_label_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Const_label_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_label_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_label_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_label_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_label_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_label_exprContext const_label_expr() throws RecognitionException {
		Const_label_exprContext _localctx = new Const_label_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_const_label_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(263);
			match(T__20);
			setState(264);
			const_expr(0);
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
	public static class User_op_declContext extends ParserRuleContext {
		public User_op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_op_decl; }
	 
		public User_op_declContext() { }
		public void copyFrom(User_op_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UserOpDeclContext extends User_op_declContext {
		public Op_kindContext op_kind() {
			return getRuleContext(Op_kindContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Returns_clauseContext returns_clause() {
			return getRuleContext(Returns_clauseContext.class,0);
		}
		public Op_bodyContext op_body() {
			return getRuleContext(Op_bodyContext.class,0);
		}
		public UserOpDeclContext(User_op_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUserOpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUserOpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUserOpDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportedOpDeclContext extends User_op_declContext {
		public Op_kindContext op_kind() {
			return getRuleContext(Op_kindContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Returns_clauseContext returns_clause() {
			return getRuleContext(Returns_clauseContext.class,0);
		}
		public ImportedOpDeclContext(User_op_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterImportedOpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitImportedOpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitImportedOpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_op_declContext user_op_decl() throws RecognitionException {
		User_op_declContext _localctx = new User_op_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_user_op_decl);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new UserOpDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				op_kind();
				setState(267);
				match(ID);
				setState(268);
				params();
				setState(269);
				returns_clause();
				setState(270);
				op_body();
				}
				break;
			case 2:
				_localctx = new ImportedOpDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				op_kind();
				setState(273);
				match(T__24);
				setState(274);
				match(ID);
				setState(275);
				params();
				setState(276);
				returns_clause();
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
	public static class Op_kindContext extends ParserRuleContext {
		public Op_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_kind; }
	 
		public Op_kindContext() { }
		public void copyFrom(Op_kindContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeKindContext extends Op_kindContext {
		public NodeKindContext(Op_kindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNodeKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNodeKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNodeKind(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionKindContext extends Op_kindContext {
		public FunctionKindContext(Op_kindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFunctionKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFunctionKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFunctionKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_kindContext op_kind() throws RecognitionException {
		Op_kindContext _localctx = new Op_kindContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_kind);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				_localctx = new FunctionKindContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new NodeKindContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__26);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<Var_declsContext> var_decls() {
			return getRuleContexts(Var_declsContext.class);
		}
		public Var_declsContext var_decls(int i) {
			return getRuleContext(Var_declsContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__27);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(285);
				var_decls();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(286);
					match(T__1);
					setState(287);
					var_decls();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(295);
			match(T__28);
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
	public static class Returns_clauseContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Returns_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReturns_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReturns_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReturns_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_clauseContext returns_clause() throws RecognitionException {
		Returns_clauseContext _localctx = new Returns_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returns_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(RETURNS);
			setState(298);
			params();
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
	public static class Op_bodyContext extends ParserRuleContext {
		public Op_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_body; }
	 
		public Op_bodyContext() { }
		public void copyFrom(Op_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullOpBodyContext extends Op_bodyContext {
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public TerminalNode LET() { return getToken(SynlongParser.LET, 0); }
		public TerminalNode TEL() { return getToken(SynlongParser.TEL, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public FullOpBodyContext(Op_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFullOpBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFullOpBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFullOpBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyOpBodyContext extends Op_bodyContext {
		public EmptyOpBodyContext(Op_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEmptyOpBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEmptyOpBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEmptyOpBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bodyContext op_body() throws RecognitionException {
		Op_bodyContext _localctx = new Op_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_body);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new EmptyOpBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__1);
				}
				break;
			case EOF:
			case T__0:
			case T__21:
			case T__25:
			case T__26:
			case VAR:
			case LET:
				_localctx = new FullOpBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(301);
					local_block();
					}
				}

				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(304);
					match(LET);
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(305);
						equation();
						setState(306);
						match(T__1);
						}
						}
						setState(310); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__27 || _la==AUTOMATON || _la==ID );
					setState(312);
					match(TEL);
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(313);
						match(T__1);
						}
					}

					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Local_blockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SynlongParser.VAR, 0); }
		public List<Var_declsContext> var_decls() {
			return getRuleContexts(Var_declsContext.class);
		}
		public Var_declsContext var_decls(int i) {
			return getRuleContext(Var_declsContext.class,i);
		}
		public Local_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLocal_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLocal_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLocal_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_blockContext local_block() throws RecognitionException {
		Local_blockContext _localctx = new Local_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_local_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(VAR);
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(321);
				var_decls();
				setState(322);
				match(T__1);
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class Var_declsContext extends ParserRuleContext {
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public When_declContext when_decl() {
			return getRuleContext(When_declContext.class,0);
		}
		public Last_declContext last_decl() {
			return getRuleContext(Last_declContext.class,0);
		}
		public Var_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterVar_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitVar_decls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitVar_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declsContext var_decls() throws RecognitionException {
		Var_declsContext _localctx = new Var_declsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			var_id();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(329);
				match(T__5);
				setState(330);
				var_id();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(T__20);
			setState(337);
			type_expr(0);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(338);
				when_decl();
				}
			}

			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(341);
				last_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitVar_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ID);
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
	public static class When_declContext extends ParserRuleContext {
		public Clock_exprContext clock_expr() {
			return getRuleContext(Clock_exprContext.class,0);
		}
		public When_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterWhen_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitWhen_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitWhen_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_declContext when_decl() throws RecognitionException {
		When_declContext _localctx = new When_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_when_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__29);
			setState(347);
			clock_expr();
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
	public static class Clock_exprContext extends ParserRuleContext {
		public Clock_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clock_expr; }
	 
		public Clock_exprContext() { }
		public void copyFrom(Clock_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClockIdContext extends Clock_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ClockIdContext(Clock_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterClockId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitClockId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitClockId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotClockContext extends Clock_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public NotClockContext(Clock_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNotClock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNotClock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNotClock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clock_exprContext clock_expr() throws RecognitionException {
		Clock_exprContext _localctx = new Clock_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_clock_expr);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ClockIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(ID);
				}
				break;
			case T__30:
				_localctx = new NotClockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__30);
				setState(351);
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
	public static class Last_declContext extends ParserRuleContext {
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Last_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLast_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLast_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLast_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Last_declContext last_decl() throws RecognitionException {
		Last_declContext _localctx = new Last_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_last_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__31);
			setState(355);
			match(T__2);
			setState(356);
			const_expr(0);
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
	public static class EquationContext extends ParserRuleContext {
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	 
		public EquationContext() { }
		public void copyFrom(EquationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends EquationContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateMachineReturnContext extends EquationContext {
		public State_machineContext state_machine() {
			return getRuleContext(State_machineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StateMachineReturnContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateMachineReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateMachineReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateMachineReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equation);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				lhs();
				setState(359);
				match(T__2);
				setState(360);
				expr();
				}
				break;
			case AUTOMATON:
				_localctx = new StateMachineReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				state_machine();
				setState(363);
				return_statement();
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
	public static class LhsContext extends ParserRuleContext {
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
	 
		public LhsContext() { }
		public void copyFrom(LhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyLhsContext extends LhsContext {
		public EmptyLhsContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEmptyLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEmptyLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEmptyLhs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LhsListContext extends LhsContext {
		public List<Lhs_idContext> lhs_id() {
			return getRuleContexts(Lhs_idContext.class);
		}
		public Lhs_idContext lhs_id(int i) {
			return getRuleContext(Lhs_idContext.class,i);
		}
		public LhsListContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLhsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLhsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLhsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lhs);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new EmptyLhsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(T__27);
				setState(368);
				match(T__28);
				}
				break;
			case ID:
				_localctx = new LhsListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				lhs_id();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(370);
					match(T__5);
					setState(371);
					lhs_id();
					}
					}
					setState(376);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lhs_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Lhs_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLhs_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLhs_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLhs_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lhs_idContext lhs_id() throws RecognitionException {
		Lhs_idContext _localctx = new Lhs_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lhs_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ID);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public Returns_varContext returns_var() {
			return getRuleContext(Returns_varContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(RETURNS);
			setState(382);
			returns_var();
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
	public static class Returns_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public Returns_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReturns_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReturns_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReturns_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_varContext returns_var() throws RecognitionException {
		Returns_varContext _localctx = new Returns_varContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returns_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				match(ID);
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class State_machineContext extends ParserRuleContext {
		public TerminalNode AUTOMATON() { return getToken(SynlongParser.AUTOMATON, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public List<State_declContext> state_decl() {
			return getRuleContexts(State_declContext.class);
		}
		public State_declContext state_decl(int i) {
			return getRuleContext(State_declContext.class,i);
		}
		public State_machineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_machine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterState_machine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitState_machine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitState_machine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_machineContext state_machine() throws RecognitionException {
		State_machineContext _localctx = new State_machineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_state_machine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(AUTOMATON);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(390);
				match(ID);
				}
			}

			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				state_decl();
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 97L) != 0) );
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
	public static class State_declContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(SynlongParser.STATE, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public State_bodyContext state_body() {
			return getRuleContext(State_bodyContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(SynlongParser.INITIAL, 0); }
		public TerminalNode FINAL() { return getToken(SynlongParser.FINAL, 0); }
		public TerminalNode UNLESS() { return getToken(SynlongParser.UNLESS, 0); }
		public TerminalNode UNTIL() { return getToken(SynlongParser.UNTIL, 0); }
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public State_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterState_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitState_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitState_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_declContext state_decl() throws RecognitionException {
		State_declContext _localctx = new State_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_state_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(398);
				match(INITIAL);
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(401);
				match(FINAL);
				}
			}

			setState(404);
			match(STATE);
			setState(405);
			match(ID);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(406);
				match(UNLESS);
				setState(408); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(407);
						transition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(410); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			{
			setState(414);
			if (!(_input.LT(1).getType() == VAR)) throw new FailedPredicateException(this, "_input.LT(1).getType() == VAR");
			setState(415);
			state_body();
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(417);
				match(UNTIL);
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(418);
					transition();
					}
					}
					setState(421); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IF );
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

	@SuppressWarnings("CheckReturnValue")
	public static class State_bodyContext extends ParserRuleContext {
		public State_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_body; }
	 
		public State_bodyContext() { }
		public void copyFrom(State_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodySingleEqContext extends State_bodyContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public StateBodySingleEqContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodySingleEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodySingleEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodySingleEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodyLetOnlyContext extends State_bodyContext {
		public Let_blockContext let_block() {
			return getRuleContext(Let_blockContext.class,0);
		}
		public StateBodyLetOnlyContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodyLetOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodyLetOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodyLetOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodyWithLocalContext extends State_bodyContext {
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public Let_blockContext let_block() {
			return getRuleContext(Let_blockContext.class,0);
		}
		public StateBodyWithLocalContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodyWithLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodyWithLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodyWithLocal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodyLocalOnlyContext extends State_bodyContext {
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public StateBodyLocalOnlyContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodyLocalOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodyLocalOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodyLocalOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_bodyContext state_body() throws RecognitionException {
		State_bodyContext _localctx = new State_bodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_state_body);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new StateBodyWithLocalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				local_block();
				setState(426);
				let_block();
				}
				break;
			case 2:
				_localctx = new StateBodyLocalOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				local_block();
				}
				break;
			case 3:
				_localctx = new StateBodyLetOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				let_block();
				}
				break;
			case 4:
				_localctx = new StateBodySingleEqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				equation();
				setState(431);
				match(T__1);
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
	public static class Let_blockContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(SynlongParser.LET, 0); }
		public TerminalNode TEL() { return getToken(SynlongParser.TEL, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public Let_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_blockContext let_block() throws RecognitionException {
		Let_blockContext _localctx = new Let_blockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_let_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LET);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==AUTOMATON || _la==ID) {
				{
				{
				setState(436);
				equation();
				setState(437);
				match(T__1);
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(TEL);
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
	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode RESUME() { return getToken(SynlongParser.RESUME, 0); }
		public TerminalNode RESTART() { return getToken(SynlongParser.RESTART, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(IF);
			setState(447);
			expr();
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==RESUME || _la==RESTART) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(449);
			match(ID);
			setState(450);
			match(T__1);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ExprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SimpleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyExprContext extends ExprContext {
		public Apply_exprContext apply_expr() {
			return getRuleContext(Apply_exprContext.class,0);
		}
		public ApplyExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterApplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitApplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitApplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExprContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchExprContext extends ExprContext {
		public Switch_exprContext switch_expr() {
			return getRuleContext(Switch_exprContext.class,0);
		}
		public SwitchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSwitchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSwitchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSwitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExprContext {
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MixedConstructorContext extends ExprContext {
		public Mixed_constructorContext mixed_constructor() {
			return getRuleContext(Mixed_constructorContext.class,0);
		}
		public MixedConstructorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMixedConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMixedConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMixedConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public LastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TempoExprContext extends ExprContext {
		public Tempo_exprContext tempo_expr() {
			return getRuleContext(Tempo_exprContext.class,0);
		}
		public TempoExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTempoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTempoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTempoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructExprContext extends ExprContext {
		public Struct_exprContext struct_expr() {
			return getRuleContext(Struct_exprContext.class,0);
		}
		public StructExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStructExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStructExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStructExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new SimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				simple_expr(0);
				}
				break;
			case 2:
				_localctx = new LastExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(T__31);
				setState(454);
				match(T__32);
				setState(455);
				match(ID);
				}
				break;
			case 3:
				_localctx = new TempoExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				tempo_expr();
				}
				break;
			case 4:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				bool_expr();
				}
				break;
			case 5:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				array_expr();
				}
				break;
			case 6:
				_localctx = new StructExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				struct_expr();
				}
				break;
			case 7:
				_localctx = new MixedConstructorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				mixed_constructor();
				}
				break;
			case 8:
				_localctx = new SwitchExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(461);
				switch_expr();
				}
				break;
			case 9:
				_localctx = new ApplyExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(462);
				apply_expr();
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
	public static class Simple_exprContext extends ParserRuleContext {
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
	 
		public Simple_exprContext() { }
		public void copyFrom(Simple_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleIdContext extends Simple_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public SimpleIdContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructAccessContext extends Simple_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public StructAccessContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStructAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStructAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStructAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends Simple_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ArrayAccessContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOpContext extends Simple_exprContext {
		public Unary_arith_opContext unary_arith_op() {
			return getRuleContext(Unary_arith_opContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public UnaryOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAtomContext extends Simple_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SimpleAtomContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinRelOpContext extends Simple_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Bin_relation_opContext bin_relation_op() {
			return getRuleContext(Bin_relation_opContext.class,0);
		}
		public BinRelOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBinRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBinRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBinRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastContext extends Simple_exprContext {
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TypeCastContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinArithOpContext extends Simple_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Bin_arith_opContext bin_arith_op() {
			return getRuleContext(Bin_arith_opContext.class,0);
		}
		public BinArithOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBinArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBinArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBinArithOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinBoolOpContext extends Simple_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Bin_bool_opContext bin_bool_op() {
			return getRuleContext(Bin_bool_opContext.class,0);
		}
		public BinBoolOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBinBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBinBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBinBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		return simple_expr(0);
	}

	private Simple_exprContext simple_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, _parentState);
		Simple_exprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_simple_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new SimpleIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(466);
				match(ID);
				}
				break;
			case T__48:
			case T__49:
			case CHAR:
			case INTEGER:
			case UINT:
			case FLOAT:
			case REAL:
			case USHORT:
			case SHORT:
				{
				_localctx = new SimpleAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				atom();
				}
				break;
			case T__30:
			case T__47:
			case T__86:
				{
				_localctx = new UnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				unary_arith_op();
				setState(469);
				simple_expr(5);
				}
				break;
			case T__27:
				{
				_localctx = new TypeCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(471);
				match(T__27);
				setState(472);
				type_expr(0);
				setState(473);
				simple_expr(0);
				setState(474);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(498);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new BinArithOpContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(478);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(479);
						bin_arith_op();
						setState(480);
						simple_expr(5);
						}
						break;
					case 2:
						{
						_localctx = new BinBoolOpContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(482);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(483);
						bin_bool_op();
						setState(484);
						simple_expr(4);
						}
						break;
					case 3:
						{
						_localctx = new BinRelOpContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(486);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(487);
						bin_relation_op();
						setState(488);
						simple_expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ArrayAccessContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(490);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(491);
						match(T__22);
						setState(492);
						const_expr(0);
						setState(493);
						match(T__23);
						}
						break;
					case 5:
						{
						_localctx = new StructAccessContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(495);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(496);
						match(T__33);
						setState(497);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tempo_exprContext extends ParserRuleContext {
		public Tempo_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_expr; }
	 
		public Tempo_exprContext() { }
		public void copyFrom(Tempo_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FbySimpleExprContext extends Tempo_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public FbySimpleExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFbySimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFbySimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFbySimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreExprContext extends Tempo_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public PreExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPreExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPreExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPreExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhenExprContext extends Tempo_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Clock_exprContext clock_expr() {
			return getRuleContext(Clock_exprContext.class,0);
		}
		public WhenExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterWhenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitWhenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitWhenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowExprContext extends Tempo_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public ArrowExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FbyExprContext extends Tempo_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public FbyExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFbyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFbyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFbyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MergeExprContext extends Tempo_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public MergeExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMergeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMergeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMergeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tempo_exprContext tempo_expr() throws RecognitionException {
		Tempo_exprContext _localctx = new Tempo_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tempo_expr);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new PreExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(T__34);
				setState(504);
				simple_expr(0);
				}
				break;
			case 2:
				_localctx = new ArrowExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				simple_expr(0);
				setState(506);
				match(T__35);
				setState(507);
				simple_expr(0);
				}
				break;
			case 3:
				_localctx = new FbyExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(T__36);
				setState(510);
				match(T__27);
				setState(511);
				simple_expr(0);
				setState(512);
				match(T__1);
				setState(513);
				const_expr(0);
				setState(514);
				match(T__1);
				setState(515);
				simple_expr(0);
				setState(516);
				match(T__28);
				}
				break;
			case 4:
				_localctx = new FbySimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				simple_expr(0);
				setState(519);
				match(T__36);
				setState(520);
				simple_expr(0);
				}
				break;
			case 5:
				_localctx = new WhenExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
				simple_expr(0);
				setState(523);
				match(T__29);
				setState(524);
				clock_expr();
				}
				break;
			case 6:
				_localctx = new MergeExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(526);
				match(T__37);
				setState(527);
				match(ID);
				setState(528);
				match(T__27);
				setState(529);
				simple_expr(0);
				setState(530);
				match(T__5);
				setState(531);
				simple_expr(0);
				setState(532);
				match(T__28);
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
	public static class Bool_exprContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__38);
			setState(537);
			match(T__27);
			setState(538);
			list();
			setState(539);
			match(T__28);
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
	public static class Array_exprContext extends ParserRuleContext {
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
	 
		public Array_exprContext() { }
		public void copyFrom(Array_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayRepeatContext extends Array_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ArrayRepeatContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDefaultContext extends Array_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public ArrayDefaultContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraySliceContext extends Array_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(SynlongParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SynlongParser.INTEGER, i);
		}
		public ArraySliceContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArraySlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArraySlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArraySlice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayConstructorContext extends Array_exprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ArrayConstructorContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_array_expr);
		int _la;
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new ArraySliceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				simple_expr(0);
				setState(542);
				match(T__22);
				setState(543);
				match(INTEGER);
				setState(544);
				match(T__39);
				setState(545);
				match(INTEGER);
				setState(546);
				match(T__23);
				}
				break;
			case 2:
				_localctx = new ArrayDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(T__27);
				setState(549);
				simple_expr(0);
				setState(550);
				match(T__33);
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(551);
					index();
					}
					}
					setState(554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__22 );
				setState(556);
				match(T__40);
				setState(557);
				simple_expr(0);
				setState(558);
				match(T__28);
				}
				break;
			case 3:
				_localctx = new ArrayRepeatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				simple_expr(0);
				setState(561);
				match(T__19);
				setState(562);
				const_expr(0);
				}
				break;
			case 4:
				_localctx = new ArrayConstructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				match(T__22);
				setState(565);
				list();
				setState(566);
				match(T__23);
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
	public static class Struct_exprContext extends ParserRuleContext {
		public List<Label_exprContext> label_expr() {
			return getRuleContexts(Label_exprContext.class);
		}
		public Label_exprContext label_expr(int i) {
			return getRuleContext(Label_exprContext.class,i);
		}
		public Struct_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStruct_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStruct_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStruct_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_exprContext struct_expr() throws RecognitionException {
		Struct_exprContext _localctx = new Struct_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_struct_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__4);
			setState(571);
			label_expr();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(572);
				match(T__5);
				setState(573);
				label_expr();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(T__6);
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
	public static class Label_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Label_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLabel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLabel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLabel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_exprContext label_expr() throws RecognitionException {
		Label_exprContext _localctx = new Label_exprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_label_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(ID);
			setState(582);
			match(T__20);
			setState(583);
			simple_expr(0);
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
	public static class Mixed_constructorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<Label_or_indexContext> label_or_index() {
			return getRuleContexts(Label_or_indexContext.class);
		}
		public Label_or_indexContext label_or_index(int i) {
			return getRuleContext(Label_or_indexContext.class,i);
		}
		public Mixed_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixed_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMixed_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMixed_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMixed_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mixed_constructorContext mixed_constructor() throws RecognitionException {
		Mixed_constructorContext _localctx = new Mixed_constructorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mixed_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__27);
			setState(586);
			match(ID);
			setState(587);
			match(T__41);
			setState(589); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(588);
				label_or_index();
				}
				}
				setState(591); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==T__33 );
			setState(593);
			match(T__2);
			setState(594);
			simple_expr(0);
			setState(595);
			match(T__28);
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
	public static class Label_or_indexContext extends ParserRuleContext {
		public Label_or_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_or_index; }
	 
		public Label_or_indexContext() { }
		public void copyFrom(Label_or_indexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends Label_or_indexContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public LabelContext(Label_or_indexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexItemContext extends Label_or_indexContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexItemContext(Label_or_indexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIndexItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIndexItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIndexItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_or_indexContext label_or_index() throws RecognitionException {
		Label_or_indexContext _localctx = new Label_or_indexContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_label_or_index);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(T__33);
				setState(598);
				match(ID);
				}
				break;
			case T__22:
				_localctx = new IndexItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				index();
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
	public static class IndexContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__22);
			setState(603);
			simple_expr(0);
			setState(604);
			match(T__23);
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
	public static class Switch_exprContext extends ParserRuleContext {
		public Switch_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expr; }
	 
		public Switch_exprContext() { }
		public void copyFrom(Switch_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseOfContext extends Switch_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<Case_exprContext> case_expr() {
			return getRuleContexts(Case_exprContext.class);
		}
		public Case_exprContext case_expr(int i) {
			return getRuleContext(Case_exprContext.class,i);
		}
		public CaseOfContext(Switch_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterCaseOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitCaseOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitCaseOf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseContext extends Switch_exprContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public IfThenElseContext(Switch_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_exprContext switch_expr() throws RecognitionException {
		Switch_exprContext _localctx = new Switch_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switch_expr);
		int _la;
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(IF);
				setState(607);
				simple_expr(0);
				setState(608);
				match(T__42);
				setState(609);
				simple_expr(0);
				setState(610);
				match(T__43);
				setState(611);
				simple_expr(0);
				}
				break;
			case T__27:
				_localctx = new CaseOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(T__27);
				setState(614);
				match(T__44);
				setState(615);
				simple_expr(0);
				setState(616);
				match(T__45);
				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(617);
					case_expr();
					}
					}
					setState(620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__46 );
				setState(622);
				match(T__28);
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
	public static class Case_exprContext extends ParserRuleContext {
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
	 
		public Case_exprContext() { }
		public void copyFrom(Case_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseExprContext extends Case_exprContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public CaseExprContext(Case_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_case_expr);
		try {
			_localctx = new CaseExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__46);
			setState(627);
			pattern();
			setState(628);
			match(T__20);
			setState(629);
			simple_expr(0);
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
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternIntContext extends PatternContext {
		public TerminalNode INTEGER() { return getToken(SynlongParser.INTEGER, 0); }
		public PatternIntContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternCharContext extends PatternContext {
		public TerminalNode CHAR() { return getToken(SynlongParser.CHAR, 0); }
		public PatternCharContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternTrueContext extends PatternContext {
		public PatternTrueContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternWildcardContext extends PatternContext {
		public PatternWildcardContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternIdContext extends PatternContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public PatternIdContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternFalseContext extends PatternContext {
		public PatternFalseContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pattern);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PatternIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(ID);
				}
				break;
			case CHAR:
				_localctx = new PatternCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(CHAR);
				}
				break;
			case T__47:
			case INTEGER:
				_localctx = new PatternIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(633);
					match(T__47);
					}
				}

				setState(636);
				match(INTEGER);
				}
				break;
			case T__48:
				_localctx = new PatternTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new PatternFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new PatternWildcardContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				match(T__50);
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
	public static class Apply_exprContext extends ParserRuleContext {
		public Apply_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_expr; }
	 
		public Apply_exprContext() { }
		public void copyFrom(Apply_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldwApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FoldwApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFoldwApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFoldwApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFoldwApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SimpleApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapwiApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public MapwiApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapwiApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapwiApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapwiApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IteratorApplyContext extends Apply_exprContext {
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IteratorApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIteratorApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIteratorApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIteratorApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapwApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public MapwApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapwApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapwApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapwApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldwiApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FoldwiApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFoldwiApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFoldwiApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFoldwiApply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Apply_exprContext apply_expr() throws RecognitionException {
		Apply_exprContext _localctx = new Apply_exprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_apply_expr);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new SimpleApplyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				prefix_operator();
				setState(643);
				match(T__27);
				setState(644);
				list();
				setState(645);
				match(T__28);
				}
				break;
			case 2:
				_localctx = new IteratorApplyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(T__27);
				setState(648);
				iterator();
				setState(649);
				match(T__51);
				setState(650);
				prefix_operator();
				setState(651);
				match(T__1);
				setState(652);
				const_expr(0);
				setState(653);
				match(T__52);
				setState(654);
				match(T__28);
				setState(655);
				match(T__27);
				setState(656);
				list();
				setState(657);
				match(T__28);
				}
				break;
			case 3:
				_localctx = new MapwApplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(T__27);
				setState(660);
				match(T__53);
				setState(661);
				match(T__51);
				setState(662);
				prefix_operator();
				setState(663);
				match(T__1);
				setState(664);
				const_expr(0);
				setState(665);
				match(T__52);
				setState(666);
				match(IF);
				setState(667);
				simple_expr(0);
				setState(668);
				match(T__40);
				setState(669);
				match(T__27);
				setState(670);
				list();
				setState(671);
				match(T__28);
				setState(672);
				match(T__28);
				setState(673);
				match(T__27);
				setState(674);
				list();
				setState(675);
				match(T__28);
				}
				break;
			case 4:
				_localctx = new MapwiApplyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(677);
				match(T__27);
				setState(678);
				match(T__54);
				setState(679);
				match(T__51);
				setState(680);
				prefix_operator();
				setState(681);
				match(T__1);
				setState(682);
				const_expr(0);
				setState(683);
				match(T__52);
				setState(684);
				match(IF);
				setState(685);
				simple_expr(0);
				setState(686);
				match(T__40);
				setState(687);
				match(T__27);
				setState(688);
				list();
				setState(689);
				match(T__28);
				setState(690);
				match(T__28);
				setState(691);
				match(T__27);
				setState(692);
				list();
				setState(693);
				match(T__28);
				}
				break;
			case 5:
				_localctx = new FoldwApplyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(695);
				match(T__27);
				setState(696);
				match(T__55);
				setState(697);
				match(T__51);
				setState(698);
				prefix_operator();
				setState(699);
				match(T__1);
				setState(700);
				const_expr(0);
				setState(701);
				match(T__52);
				setState(702);
				match(IF);
				setState(703);
				simple_expr(0);
				setState(704);
				match(T__28);
				setState(705);
				match(T__27);
				setState(706);
				list();
				setState(707);
				match(T__28);
				}
				break;
			case 6:
				_localctx = new FoldwiApplyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(709);
				match(T__27);
				setState(710);
				match(T__56);
				setState(711);
				match(T__51);
				setState(712);
				prefix_operator();
				setState(713);
				match(T__1);
				setState(714);
				const_expr(0);
				setState(715);
				match(T__52);
				setState(716);
				match(IF);
				setState(717);
				simple_expr(0);
				setState(718);
				match(T__28);
				setState(719);
				match(T__27);
				setState(720);
				list();
				setState(721);
				match(T__28);
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
	public static class Prefix_operatorContext extends ParserRuleContext {
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
	 
		public Prefix_operatorContext() { }
		public void copyFrom(Prefix_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixIdContext extends Prefix_operatorContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public PrefixIdContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPrefixId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPrefixId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPrefixId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MakeOpContext extends Prefix_operatorContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public MakeOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMakeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMakeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMakeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnaryOpContext extends Prefix_operatorContext {
		public Prefix_unary_operatorContext prefix_unary_operator() {
			return getRuleContext(Prefix_unary_operatorContext.class,0);
		}
		public PrefixUnaryOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPrefixUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPrefixUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPrefixUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlattenOpContext extends Prefix_operatorContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public FlattenOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFlattenOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFlattenOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFlattenOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixBinaryOpContext extends Prefix_operatorContext {
		public Prefix_binary_operatorContext prefix_binary_operator() {
			return getRuleContext(Prefix_binary_operatorContext.class,0);
		}
		public PrefixBinaryOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPrefixBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPrefixBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPrefixBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_prefix_operator);
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new PrefixIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(ID);
				}
				break;
			case 2:
				_localctx = new PrefixUnaryOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				prefix_unary_operator();
				}
				break;
			case 3:
				_localctx = new PrefixBinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				prefix_binary_operator();
				}
				break;
			case 4:
				_localctx = new MakeOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				match(T__27);
				setState(729);
				match(T__57);
				setState(730);
				match(ID);
				setState(731);
				match(T__28);
				}
				break;
			case 5:
				_localctx = new FlattenOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(732);
				match(T__27);
				setState(733);
				match(T__58);
				setState(734);
				match(ID);
				setState(735);
				match(T__28);
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
	public static class Prefix_unary_operatorContext extends ParserRuleContext {
		public Prefix_unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_unary_operator; }
	 
		public Prefix_unary_operatorContext() { }
		public void copyFrom(Prefix_unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortDollarContext extends Prefix_unary_operatorContext {
		public ShortDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterShortDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitShortDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitShortDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusDollarContext extends Prefix_unary_operatorContext {
		public MinusDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMinusDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMinusDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMinusDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusDollarContext extends Prefix_unary_operatorContext {
		public PlusDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPlusDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPlusDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPlusDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatDollarContext extends Prefix_unary_operatorContext {
		public FloatDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFloatDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFloatDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFloatDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotDollarContext extends Prefix_unary_operatorContext {
		public NotDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNotDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNotDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNotDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntDollarContext extends Prefix_unary_operatorContext {
		public IntDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIntDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIntDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIntDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealDollarContext extends Prefix_unary_operatorContext {
		public RealDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterRealDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitRealDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitRealDollar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_unary_operatorContext prefix_unary_operator() throws RecognitionException {
		Prefix_unary_operatorContext _localctx = new Prefix_unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_prefix_unary_operator);
		try {
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
				_localctx = new PlusDollarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(T__59);
				}
				break;
			case T__60:
				_localctx = new MinusDollarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(T__60);
				}
				break;
			case T__61:
				_localctx = new NotDollarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new ShortDollarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				match(T__62);
				}
				break;
			case T__63:
				_localctx = new IntDollarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(742);
				match(T__63);
				}
				break;
			case T__64:
				_localctx = new FloatDollarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(743);
				match(T__64);
				}
				break;
			case T__65:
				_localctx = new RealDollarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(744);
				match(T__65);
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
	public static class Prefix_binary_operatorContext extends ParserRuleContext {
		public Prefix_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_binary_operator; }
	 
		public Prefix_binary_operatorContext() { }
		public void copyFrom(Prefix_binary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusOpContext extends Prefix_binary_operatorContext {
		public MinusOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMinusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMinusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOpContext extends Prefix_binary_operatorContext {
		public OrOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitOrOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqOpContext extends Prefix_binary_operatorContext {
		public EqOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEqOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtOpContext extends Prefix_binary_operatorContext {
		public GtOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGtOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivIntOpContext extends Prefix_binary_operatorContext {
		public DivIntOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDivIntOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDivIntOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDivIntOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtOpContext extends Prefix_binary_operatorContext {
		public LtOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLtOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorOpContext extends Prefix_binary_operatorContext {
		public XorOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterXorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitXorOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitXorOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModOpContext extends Prefix_binary_operatorContext {
		public ModOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends Prefix_binary_operatorContext {
		public MulOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusOpContext extends Prefix_binary_operatorContext {
		public PlusOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPlusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPlusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeOpContext extends Prefix_binary_operatorContext {
		public NeOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivOpContext extends Prefix_binary_operatorContext {
		public DivOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeOpContext extends Prefix_binary_operatorContext {
		public LeOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeOpContext extends Prefix_binary_operatorContext {
		public GeOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOpContext extends Prefix_binary_operatorContext {
		public AndOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAndOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAndOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_binary_operatorContext prefix_binary_operator() throws RecognitionException {
		Prefix_binary_operatorContext _localctx = new Prefix_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_prefix_binary_operator);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__66:
				_localctx = new PlusOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(T__66);
				}
				break;
			case T__67:
				_localctx = new MinusOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(T__67);
				}
				break;
			case T__68:
				_localctx = new MulOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(T__68);
				}
				break;
			case T__69:
				_localctx = new DivOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				match(T__69);
				}
				break;
			case T__70:
				_localctx = new ModOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(751);
				match(T__70);
				}
				break;
			case T__71:
				_localctx = new DivIntOpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(752);
				match(T__71);
				}
				break;
			case T__72:
				_localctx = new EqOpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(753);
				match(T__72);
				}
				break;
			case T__73:
				_localctx = new NeOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(754);
				match(T__73);
				}
				break;
			case T__74:
				_localctx = new LtOpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(755);
				match(T__74);
				}
				break;
			case T__75:
				_localctx = new GtOpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(756);
				match(T__75);
				}
				break;
			case T__76:
				_localctx = new LeOpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(757);
				match(T__76);
				}
				break;
			case T__77:
				_localctx = new GeOpContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(758);
				match(T__77);
				}
				break;
			case T__78:
				_localctx = new AndOpContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(759);
				match(T__78);
				}
				break;
			case T__79:
				_localctx = new OrOpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(760);
				match(T__79);
				}
				break;
			case T__80:
				_localctx = new XorOpContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(761);
				match(T__80);
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
	public static class IteratorContext extends ParserRuleContext {
		public IteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator; }
	 
		public IteratorContext() { }
		public void copyFrom(IteratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldContext extends IteratorContext {
		public FoldContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFold(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldiContext extends IteratorContext {
		public FoldiContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFoldi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFoldi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFoldi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapiContext extends IteratorContext {
		public MapiContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends IteratorContext {
		public MapContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapfoldContext extends IteratorContext {
		public MapfoldContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapfold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapfold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapfold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_iterator);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__81:
				_localctx = new MapContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(T__81);
				}
				break;
			case T__82:
				_localctx = new FoldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(T__82);
				}
				break;
			case T__83:
				_localctx = new MapiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(T__83);
				}
				break;
			case T__84:
				_localctx = new FoldiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				match(T__84);
				}
				break;
			case T__85:
				_localctx = new MapfoldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				match(T__85);
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
	public static class ListContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970327252893696L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 17112760321L) != 0)) {
				{
				setState(771);
				simple_expr(0);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(772);
					match(T__5);
					setState(773);
					simple_expr(0);
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_arith_opContext extends ParserRuleContext {
		public Unary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_arith_op; }
	 
		public Unary_arith_opContext() { }
		public void copyFrom(Unary_arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends Unary_arith_opContext {
		public NotContext(Unary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends Unary_arith_opContext {
		public PlusContext(Unary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends Unary_arith_opContext {
		public MinusContext(Unary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_arith_opContext unary_arith_op() throws RecognitionException {
		Unary_arith_opContext _localctx = new Unary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unary_arith_op);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(T__47);
				}
				break;
			case T__86:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(T__86);
				}
				break;
			case T__30:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(T__30);
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
	public static class Bin_arith_opContext extends ParserRuleContext {
		public Bin_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_arith_op; }
	 
		public Bin_arith_opContext() { }
		public void copyFrom(Bin_arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Bin_arith_opContext {
		public AddContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Bin_arith_opContext {
		public DivContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Bin_arith_opContext {
		public SubContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends Bin_arith_opContext {
		public ModContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends Bin_arith_opContext {
		public MulContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivIntContext extends Bin_arith_opContext {
		public DivIntContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDivInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDivInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDivInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_arith_opContext bin_arith_op() throws RecognitionException {
		Bin_arith_opContext _localctx = new Bin_arith_opContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bin_arith_op);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(T__86);
				}
				break;
			case T__47:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(T__47);
				}
				break;
			case T__87:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				match(T__87);
				}
				break;
			case T__88:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				match(T__88);
				}
				break;
			case T__89:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(790);
				match(T__89);
				}
				break;
			case T__90:
				_localctx = new DivIntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
				match(T__90);
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
	public static class Bin_relation_opContext extends ParserRuleContext {
		public Bin_relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_relation_op; }
	 
		public Bin_relation_opContext() { }
		public void copyFrom(Bin_relation_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeContext extends Bin_relation_opContext {
		public NeContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends Bin_relation_opContext {
		public LtContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeContext extends Bin_relation_opContext {
		public LeContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends Bin_relation_opContext {
		public EqContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends Bin_relation_opContext {
		public GtContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeContext extends Bin_relation_opContext {
		public GeContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_relation_opContext bin_relation_op() throws RecognitionException {
		Bin_relation_opContext _localctx = new Bin_relation_opContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bin_relation_op);
		try {
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new EqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(T__2);
				}
				break;
			case T__91:
				_localctx = new NeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(T__91);
				}
				break;
			case T__92:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				match(T__92);
				}
				break;
			case T__93:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(T__93);
				}
				break;
			case T__94:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(T__94);
				}
				break;
			case T__95:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(799);
				match(T__95);
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
	public static class Bin_bool_opContext extends ParserRuleContext {
		public Bin_bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_bool_op; }
	 
		public Bin_bool_opContext() { }
		public void copyFrom(Bin_bool_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Bin_bool_opContext {
		public OrContext(Bin_bool_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Bin_bool_opContext {
		public AndContext(Bin_bool_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends Bin_bool_opContext {
		public XorContext(Bin_bool_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_bool_opContext bin_bool_op() throws RecognitionException {
		Bin_bool_opContext _localctx = new Bin_bool_opContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_bin_bool_op);
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__96:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(T__96);
				}
				break;
			case T__97:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(T__97);
				}
				break;
			case T__98:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				match(T__98);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends AtomContext {
		public TerminalNode INTEGER() { return getToken(SynlongParser.INTEGER, 0); }
		public IntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(SynlongParser.FLOAT, 0); }
		public FloatContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends AtomContext {
		public TerminalNode CHAR() { return getToken(SynlongParser.CHAR, 0); }
		public CharContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UIntegerContext extends AtomContext {
		public TerminalNode UINT() { return getToken(SynlongParser.UINT, 0); }
		public UIntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends AtomContext {
		public TerminalNode REAL() { return getToken(SynlongParser.REAL, 0); }
		public RealContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends AtomContext {
		public TrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UShortContext extends AtomContext {
		public TerminalNode USHORT() { return getToken(SynlongParser.USHORT, 0); }
		public UShortContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUShort(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends AtomContext {
		public FalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortContext extends AtomContext {
		public TerminalNode SHORT() { return getToken(SynlongParser.SHORT, 0); }
		public ShortContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_atom);
		try {
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(T__49);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				match(CHAR);
				}
				break;
			case INTEGER:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				match(INTEGER);
				}
				break;
			case UINT:
				_localctx = new UIntegerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				match(UINT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				match(FLOAT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
				match(REAL);
				}
				break;
			case USHORT:
				_localctx = new UShortContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(814);
				match(USHORT);
				}
				break;
			case SHORT:
				_localctx = new ShortContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(815);
				match(SHORT);
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
		case 5:
			return type_expr_sempred((Type_exprContext)_localctx, predIndex);
		case 10:
			return const_expr_sempred((Const_exprContext)_localctx, predIndex);
		case 30:
			return state_decl_sempred((State_declContext)_localctx, predIndex);
		case 35:
			return simple_expr_sempred((Simple_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_expr_sempred(Type_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean const_expr_sempred(Const_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean state_decl_sempred(State_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _input.LT(1).getType() == VAR;
		}
		return true;
	}
	private boolean simple_expr_sempred(Simple_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001z\u0333\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0005\u0000v\b\u0000"+
		"\n\u0000\f\u0000y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0080\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u0086\b\u0002\u000b\u0002\f\u0002\u0087\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008d\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0095"+
		"\b\u0004\n\u0004\f\u0004\u0098\t\u0004\u0001\u0004\u0003\u0004\u009b\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00af\b\u0005\n\u0005\f\u0005\u00b2\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00b6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00bb\b\u0005\n\u0005\f\u0005\u00be\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u00ca\b\b\u000b\b\f\b\u00cb\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00d3\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00e3\b\n\n\n\f\n\u00e6\t\n\u0001\n\u0001\n\u0003\n\u00ea\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f8\b\n\n\n\f\n\u00fb\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0100\b\u000b\n\u000b\f\u000b\u0103"+
		"\t\u000b\u0003\u000b\u0105\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0117\b\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u011b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0121\b\u000f\n\u000f\f\u000f\u0124\t\u000f\u0003\u000f\u0126\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u012f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u0135\b\u0011\u000b\u0011\f\u0011\u0136\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u013b\b\u0011\u0003\u0011\u013d\b\u0011"+
		"\u0003\u0011\u013f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u0145\b\u0012\u000b\u0012\f\u0012\u0146\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u014c\b\u0013\n\u0013\f\u0013\u014f\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0154\b\u0013\u0001\u0013"+
		"\u0003\u0013\u0157\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0161\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u016e\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0175\b\u0019\n\u0019\f\u0019\u0178\t\u0019\u0003\u0019\u017a"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0004\u001c\u0182\b\u001c\u000b\u001c\f\u001c\u0183\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0188\b\u001d\u0001\u001d\u0004\u001d\u018b\b"+
		"\u001d\u000b\u001d\f\u001d\u018c\u0001\u001e\u0003\u001e\u0190\b\u001e"+
		"\u0001\u001e\u0003\u001e\u0193\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0004\u001e\u0199\b\u001e\u000b\u001e\f\u001e\u019a\u0003"+
		"\u001e\u019d\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0004\u001e\u01a4\b\u001e\u000b\u001e\f\u001e\u01a5\u0003\u001e"+
		"\u01a8\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01b2\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0005 \u01b8\b \n \f \u01bb\t \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d0\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01dd\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u01f3\b#\n#\f#\u01f6\t#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0217\b$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0004&\u0229\b&\u000b&\f&\u022a\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u0239\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u023f"+
		"\b\'\n\'\f\'\u0242\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0004)\u024e\b)\u000b)\f)\u024f\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0003*\u0259\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0004,\u026b\b,\u000b,\f,\u026c\u0001,\u0001,\u0003,\u0271"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u027b"+
		"\b.\u0001.\u0001.\u0001.\u0001.\u0003.\u0281\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02d4\b/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u02e1\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u02ea\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02fb\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u0302\b3\u00014\u00014\u00014\u00054\u0307"+
		"\b4\n4\f4\u030a\t4\u00034\u030c\b4\u00015\u00015\u00015\u00035\u0311\b"+
		"5\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0319\b6\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u0321\b7\u00018\u00018\u00018\u0003"+
		"8\u0326\b8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u0331\b9\u00019\u0000\u0003\n\u0014F:\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0001\u0001\u0000kl\u0395\u0000"+
		"w\u0001\u0000\u0000\u0000\u0002\u007f\u0001\u0000\u0000\u0000\u0004\u0081"+
		"\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000\u0000\u0000\b\u009a\u0001"+
		"\u0000\u0000\u0000\n\u00b5\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000"+
		"\u0000\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00c5\u0001\u0000"+
		"\u0000\u0000\u0012\u00cd\u0001\u0000\u0000\u0000\u0014\u00e9\u0001\u0000"+
		"\u0000\u0000\u0016\u0104\u0001\u0000\u0000\u0000\u0018\u0106\u0001\u0000"+
		"\u0000\u0000\u001a\u0116\u0001\u0000\u0000\u0000\u001c\u011a\u0001\u0000"+
		"\u0000\u0000\u001e\u011c\u0001\u0000\u0000\u0000 \u0129\u0001\u0000\u0000"+
		"\u0000\"\u013e\u0001\u0000\u0000\u0000$\u0140\u0001\u0000\u0000\u0000"+
		"&\u0148\u0001\u0000\u0000\u0000(\u0158\u0001\u0000\u0000\u0000*\u015a"+
		"\u0001\u0000\u0000\u0000,\u0160\u0001\u0000\u0000\u0000.\u0162\u0001\u0000"+
		"\u0000\u00000\u016d\u0001\u0000\u0000\u00002\u0179\u0001\u0000\u0000\u0000"+
		"4\u017b\u0001\u0000\u0000\u00006\u017d\u0001\u0000\u0000\u00008\u0181"+
		"\u0001\u0000\u0000\u0000:\u0185\u0001\u0000\u0000\u0000<\u018f\u0001\u0000"+
		"\u0000\u0000>\u01b1\u0001\u0000\u0000\u0000@\u01b3\u0001\u0000\u0000\u0000"+
		"B\u01be\u0001\u0000\u0000\u0000D\u01cf\u0001\u0000\u0000\u0000F\u01dc"+
		"\u0001\u0000\u0000\u0000H\u0216\u0001\u0000\u0000\u0000J\u0218\u0001\u0000"+
		"\u0000\u0000L\u0238\u0001\u0000\u0000\u0000N\u023a\u0001\u0000\u0000\u0000"+
		"P\u0245\u0001\u0000\u0000\u0000R\u0249\u0001\u0000\u0000\u0000T\u0258"+
		"\u0001\u0000\u0000\u0000V\u025a\u0001\u0000\u0000\u0000X\u0270\u0001\u0000"+
		"\u0000\u0000Z\u0272\u0001\u0000\u0000\u0000\\\u0280\u0001\u0000\u0000"+
		"\u0000^\u02d3\u0001\u0000\u0000\u0000`\u02e0\u0001\u0000\u0000\u0000b"+
		"\u02e9\u0001\u0000\u0000\u0000d\u02fa\u0001\u0000\u0000\u0000f\u0301\u0001"+
		"\u0000\u0000\u0000h\u030b\u0001\u0000\u0000\u0000j\u0310\u0001\u0000\u0000"+
		"\u0000l\u0318\u0001\u0000\u0000\u0000n\u0320\u0001\u0000\u0000\u0000p"+
		"\u0325\u0001\u0000\u0000\u0000r\u0330\u0001\u0000\u0000\u0000tv\u0003"+
		"\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0000\u0000\u0001{\u0001\u0001"+
		"\u0000\u0000\u0000|\u0080\u0003\u0004\u0002\u0000}\u0080\u0003\u0010\b"+
		"\u0000~\u0080\u0003\u001a\r\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0003\u0001"+
		"\u0000\u0000\u0000\u0081\u0085\u0005\u0001\u0000\u0000\u0082\u0083\u0003"+
		"\u0006\u0003\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0005\u0001\u0000\u0000\u0000\u0089\u008c\u0005"+
		"q\u0000\u0000\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u008d\u0003\b"+
		"\u0004\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0007\u0001\u0000\u0000\u0000\u008e\u009b\u0003\n\u0005"+
		"\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0091\u0005\u0005\u0000"+
		"\u0000\u0091\u0096\u0005q\u0000\u0000\u0092\u0093\u0005\u0006\u0000\u0000"+
		"\u0093\u0095\u0005q\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u0007\u0000\u0000\u009a"+
		"\u008e\u0001\u0000\u0000\u0000\u009a\u008f\u0001\u0000\u0000\u0000\u009b"+
		"\t\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0005\uffff\uffff\u0000\u009d"+
		"\u00b6\u0005\b\u0000\u0000\u009e\u00b6\u0005\t\u0000\u0000\u009f\u00b6"+
		"\u0005\n\u0000\u0000\u00a0\u00b6\u0005\u000b\u0000\u0000\u00a1\u00b6\u0005"+
		"\f\u0000\u0000\u00a2\u00b6\u0005\r\u0000\u0000\u00a3\u00b6\u0005\u000e"+
		"\u0000\u0000\u00a4\u00b6\u0005\u000f\u0000\u0000\u00a5\u00b6\u0005\u0010"+
		"\u0000\u0000\u00a6\u00b6\u0005\u0011\u0000\u0000\u00a7\u00b6\u0005\u0012"+
		"\u0000\u0000\u00a8\u00b6\u0005\u0013\u0000\u0000\u00a9\u00b6\u0003\u000e"+
		"\u0007\u0000\u00aa\u00ab\u0005\u0005\u0000\u0000\u00ab\u00b0\u0003\f\u0006"+
		"\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000\u00ad\u00af\u0003\f\u0006\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0007\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u009c\u0001\u0000\u0000\u0000\u00b5\u009e\u0001\u0000\u0000\u0000"+
		"\u00b5\u009f\u0001\u0000\u0000\u0000\u00b5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a1\u0001\u0000\u0000\u0000\u00b5\u00a2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a3\u0001\u0000\u0000\u0000\u00b5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a5\u0001\u0000\u0000\u0000\u00b5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b6\u00bc\u0001\u0000\u0000\u0000\u00b7\u00b8\n\u0001\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0014\u0000\u0000\u00b9\u00bb\u0003\u0014\n\u0000\u00ba\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u000b"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005q\u0000\u0000\u00c0\u00c1\u0005\u0015\u0000\u0000\u00c1\u00c2\u0003"+
		"\n\u0005\u0000\u00c2\r\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005q\u0000"+
		"\u0000\u00c4\u000f\u0001\u0000\u0000\u0000\u00c5\u00c9\u0005\u0016\u0000"+
		"\u0000\u00c6\u00c7\u0003\u0012\t\u0000\u00c7\u00c8\u0005\u0002\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0011\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005q\u0000\u0000\u00ce\u00cf\u0005\u0015\u0000\u0000\u00cf"+
		"\u00d2\u0003\n\u0005\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d3"+
		"\u0003\u0014\n\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00d5\u0006"+
		"\n\uffff\uffff\u0000\u00d5\u00ea\u0005q\u0000\u0000\u00d6\u00ea\u0003"+
		"r9\u0000\u00d7\u00d8\u0003j5\u0000\u00d8\u00d9\u0003\u0014\n\u0006\u00d9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0017\u0000\u0000\u00db"+
		"\u00dc\u0003\u0016\u000b\u0000\u00dc\u00dd\u0005\u0018\u0000\u0000\u00dd"+
		"\u00ea\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0005\u0000\u0000\u00df"+
		"\u00e4\u0003\u0018\f\u0000\u00e0\u00e1\u0005\u0006\u0000\u0000\u00e1\u00e3"+
		"\u0003\u0018\f\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\u0007\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00d4\u0001\u0000\u0000\u0000\u00e9\u00d6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00d7\u0001\u0000\u0000\u0000\u00e9\u00da\u0001"+
		"\u0000\u0000\u0000\u00e9\u00de\u0001\u0000\u0000\u0000\u00ea\u00f9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\n\u0005\u0000\u0000\u00ec\u00ed\u0003l"+
		"6\u0000\u00ed\u00ee\u0003\u0014\n\u0006\u00ee\u00f8\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\n\u0004\u0000\u0000\u00f0\u00f1\u0003p8\u0000\u00f1"+
		"\u00f2\u0003\u0014\n\u0005\u00f2\u00f8\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\n\u0003\u0000\u0000\u00f4\u00f5\u0003n7\u0000\u00f5\u00f6\u0003\u0014"+
		"\n\u0004\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u0015\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0101\u0003\u0014\n\u0000"+
		"\u00fd\u00fe\u0005\u0006\u0000\u0000\u00fe\u0100\u0003\u0014\n\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u00fc\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0017\u0001\u0000\u0000\u0000\u0106\u0107\u0005q\u0000\u0000\u0107\u0108"+
		"\u0005\u0015\u0000\u0000\u0108\u0109\u0003\u0014\n\u0000\u0109\u0019\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0003\u001c\u000e\u0000\u010b\u010c\u0005"+
		"q\u0000\u0000\u010c\u010d\u0003\u001e\u000f\u0000\u010d\u010e\u0003 \u0010"+
		"\u0000\u010e\u010f\u0003\"\u0011\u0000\u010f\u0117\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0003\u001c\u000e\u0000\u0111\u0112\u0005\u0019\u0000\u0000"+
		"\u0112\u0113\u0005q\u0000\u0000\u0113\u0114\u0003\u001e\u000f\u0000\u0114"+
		"\u0115\u0003 \u0010\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u010a"+
		"\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0117\u001b"+
		"\u0001\u0000\u0000\u0000\u0118\u011b\u0005\u001a\u0000\u0000\u0119\u011b"+
		"\u0005\u001b\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u001d\u0001\u0000\u0000\u0000\u011c\u0125"+
		"\u0005\u001c\u0000\u0000\u011d\u0122\u0003&\u0013\u0000\u011e\u011f\u0005"+
		"\u0002\u0000\u0000\u011f\u0121\u0003&\u0013\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u011d\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\u001d\u0000\u0000\u0128\u001f\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0005p\u0000\u0000\u012a\u012b\u0003\u001e\u000f"+
		"\u0000\u012b!\u0001\u0000\u0000\u0000\u012c\u013f\u0005\u0002\u0000\u0000"+
		"\u012d\u012f\u0003$\u0012\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u013c\u0001\u0000\u0000\u0000\u0130"+
		"\u0134\u0005f\u0000\u0000\u0131\u0132\u00030\u0018\u0000\u0132\u0133\u0005"+
		"\u0002\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0131\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013a\u0005g\u0000\u0000\u0139\u013b\u0005\u0002"+
		"\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0130\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000"+
		"\u0000\u0000\u013e\u012c\u0001\u0000\u0000\u0000\u013e\u012e\u0001\u0000"+
		"\u0000\u0000\u013f#\u0001\u0000\u0000\u0000\u0140\u0144\u0005e\u0000\u0000"+
		"\u0141\u0142\u0003&\u0013\u0000\u0142\u0143\u0005\u0002\u0000\u0000\u0143"+
		"\u0145\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0001\u0000\u0000\u0000\u0147%\u0001\u0000\u0000\u0000\u0148\u014d"+
		"\u0003(\u0014\u0000\u0149\u014a\u0005\u0006\u0000\u0000\u014a\u014c\u0003"+
		"(\u0014\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005\u0015\u0000\u0000\u0151\u0153\u0003\n\u0005"+
		"\u0000\u0152\u0154\u0003*\u0015\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u0003.\u0017\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\'\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005q\u0000\u0000\u0159)\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u001e"+
		"\u0000\u0000\u015b\u015c\u0003,\u0016\u0000\u015c+\u0001\u0000\u0000\u0000"+
		"\u015d\u0161\u0005q\u0000\u0000\u015e\u015f\u0005\u001f\u0000\u0000\u015f"+
		"\u0161\u0005q\u0000\u0000\u0160\u015d\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0161-\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		" \u0000\u0000\u0163\u0164\u0005\u0003\u0000\u0000\u0164\u0165\u0003\u0014"+
		"\n\u0000\u0165/\u0001\u0000\u0000\u0000\u0166\u0167\u00032\u0019\u0000"+
		"\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u0169\u0003D\"\u0000\u0169"+
		"\u016e\u0001\u0000\u0000\u0000\u016a\u016b\u0003:\u001d\u0000\u016b\u016c"+
		"\u00036\u001b\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u0166\u0001"+
		"\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e1\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005\u001c\u0000\u0000\u0170\u017a\u0005\u001d"+
		"\u0000\u0000\u0171\u0176\u00034\u001a\u0000\u0172\u0173\u0005\u0006\u0000"+
		"\u0000\u0173\u0175\u00034\u001a\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u016f\u0001\u0000\u0000\u0000"+
		"\u0179\u0171\u0001\u0000\u0000\u0000\u017a3\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005q\u0000\u0000\u017c5\u0001\u0000\u0000\u0000\u017d\u017e\u0005"+
		"p\u0000\u0000\u017e\u017f\u00038\u001c\u0000\u017f7\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0005q\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u01849\u0001\u0000\u0000\u0000\u0185"+
		"\u0187\u0005o\u0000\u0000\u0186\u0188\u0005q\u0000\u0000\u0187\u0186\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001"+
		"\u0000\u0000\u0000\u0189\u018b\u0003<\u001e\u0000\u018a\u0189\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d;\u0001\u0000\u0000"+
		"\u0000\u018e\u0190\u0005m\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u0193\u0005n\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0005h\u0000\u0000\u0195\u019c\u0005q\u0000\u0000\u0196\u0198\u0005"+
		"i\u0000\u0000\u0197\u0199\u0003B!\u0000\u0198\u0197\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000"+
		"\u0000\u019c\u0196\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0004\u001e\u0004"+
		"\u0000\u019f\u01a0\u0003>\u001f\u0000\u01a0\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a3\u0005j\u0000\u0000\u01a2\u01a4\u0003B!\u0000\u01a3\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a1\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8=\u0001\u0000\u0000\u0000\u01a9\u01aa\u0003"+
		"$\u0012\u0000\u01aa\u01ab\u0003@ \u0000\u01ab\u01b2\u0001\u0000\u0000"+
		"\u0000\u01ac\u01b2\u0003$\u0012\u0000\u01ad\u01b2\u0003@ \u0000\u01ae"+
		"\u01af\u00030\u0018\u0000\u01af\u01b0\u0005\u0002\u0000\u0000\u01b0\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000\u01b1\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000\u01b1\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b2?\u0001\u0000\u0000\u0000\u01b3\u01b9\u0005"+
		"f\u0000\u0000\u01b4\u01b5\u00030\u0018\u0000\u01b5\u01b6\u0005\u0002\u0000"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005g\u0000\u0000"+
		"\u01bdA\u0001\u0000\u0000\u0000\u01be\u01bf\u0005d\u0000\u0000\u01bf\u01c0"+
		"\u0003D\"\u0000\u01c0\u01c1\u0007\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"q\u0000\u0000\u01c2\u01c3\u0005\u0002\u0000\u0000\u01c3C\u0001\u0000\u0000"+
		"\u0000\u01c4\u01d0\u0003F#\u0000\u01c5\u01c6\u0005 \u0000\u0000\u01c6"+
		"\u01c7\u0005!\u0000\u0000\u01c7\u01d0\u0005q\u0000\u0000\u01c8\u01d0\u0003"+
		"H$\u0000\u01c9\u01d0\u0003J%\u0000\u01ca\u01d0\u0003L&\u0000\u01cb\u01d0"+
		"\u0003N\'\u0000\u01cc\u01d0\u0003R)\u0000\u01cd\u01d0\u0003X,\u0000\u01ce"+
		"\u01d0\u0003^/\u0000\u01cf\u01c4\u0001\u0000\u0000\u0000\u01cf\u01c5\u0001"+
		"\u0000\u0000\u0000\u01cf\u01c8\u0001\u0000\u0000\u0000\u01cf\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01cf\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0E\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0006#\uffff\uffff\u0000\u01d2\u01dd\u0005q\u0000"+
		"\u0000\u01d3\u01dd\u0003r9\u0000\u01d4\u01d5\u0003j5\u0000\u01d5\u01d6"+
		"\u0003F#\u0005\u01d6\u01dd\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u001c"+
		"\u0000\u0000\u01d8\u01d9\u0003\n\u0005\u0000\u01d9\u01da\u0003F#\u0000"+
		"\u01da\u01db\u0005\u001d\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dc\u01d1\u0001\u0000\u0000\u0000\u01dc\u01d3\u0001\u0000\u0000\u0000"+
		"\u01dc\u01d4\u0001\u0000\u0000\u0000\u01dc\u01d7\u0001\u0000\u0000\u0000"+
		"\u01dd\u01f4\u0001\u0000\u0000\u0000\u01de\u01df\n\u0004\u0000\u0000\u01df"+
		"\u01e0\u0003l6\u0000\u01e0\u01e1\u0003F#\u0005\u01e1\u01f3\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\n\u0003\u0000\u0000\u01e3\u01e4\u0003p8\u0000"+
		"\u01e4\u01e5\u0003F#\u0004\u01e5\u01f3\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\n\u0002\u0000\u0000\u01e7\u01e8\u0003n7\u0000\u01e8\u01e9\u0003F#\u0003"+
		"\u01e9\u01f3\u0001\u0000\u0000\u0000\u01ea\u01eb\n\u0007\u0000\u0000\u01eb"+
		"\u01ec\u0005\u0017\u0000\u0000\u01ec\u01ed\u0003\u0014\n\u0000\u01ed\u01ee"+
		"\u0005\u0018\u0000\u0000\u01ee\u01f3\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\n\u0006\u0000\u0000\u01f0\u01f1\u0005\"\u0000\u0000\u01f1\u01f3\u0005"+
		"q\u0000\u0000\u01f2\u01de\u0001\u0000\u0000\u0000\u01f2\u01e2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01e6\u0001\u0000\u0000\u0000\u01f2\u01ea\u0001\u0000"+
		"\u0000\u0000\u01f2\u01ef\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f5G\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005#\u0000\u0000\u01f8\u0217\u0003F#\u0000\u01f9"+
		"\u01fa\u0003F#\u0000\u01fa\u01fb\u0005$\u0000\u0000\u01fb\u01fc\u0003"+
		"F#\u0000\u01fc\u0217\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005%\u0000"+
		"\u0000\u01fe\u01ff\u0005\u001c\u0000\u0000\u01ff\u0200\u0003F#\u0000\u0200"+
		"\u0201\u0005\u0002\u0000\u0000\u0201\u0202\u0003\u0014\n\u0000\u0202\u0203"+
		"\u0005\u0002\u0000\u0000\u0203\u0204\u0003F#\u0000\u0204\u0205\u0005\u001d"+
		"\u0000\u0000\u0205\u0217\u0001\u0000\u0000\u0000\u0206\u0207\u0003F#\u0000"+
		"\u0207\u0208\u0005%\u0000\u0000\u0208\u0209\u0003F#\u0000\u0209\u0217"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0003F#\u0000\u020b\u020c\u0005\u001e"+
		"\u0000\u0000\u020c\u020d\u0003,\u0016\u0000\u020d\u0217\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0005&\u0000\u0000\u020f\u0210\u0005q\u0000\u0000\u0210"+
		"\u0211\u0005\u001c\u0000\u0000\u0211\u0212\u0003F#\u0000\u0212\u0213\u0005"+
		"\u0006\u0000\u0000\u0213\u0214\u0003F#\u0000\u0214\u0215\u0005\u001d\u0000"+
		"\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u01f7\u0001\u0000\u0000"+
		"\u0000\u0216\u01f9\u0001\u0000\u0000\u0000\u0216\u01fd\u0001\u0000\u0000"+
		"\u0000\u0216\u0206\u0001\u0000\u0000\u0000\u0216\u020a\u0001\u0000\u0000"+
		"\u0000\u0216\u020e\u0001\u0000\u0000\u0000\u0217I\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0005\'\u0000\u0000\u0219\u021a\u0005\u001c\u0000\u0000\u021a"+
		"\u021b\u0003h4\u0000\u021b\u021c\u0005\u001d\u0000\u0000\u021cK\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0003F#\u0000\u021e\u021f\u0005\u0017\u0000"+
		"\u0000\u021f\u0220\u0005s\u0000\u0000\u0220\u0221\u0005(\u0000\u0000\u0221"+
		"\u0222\u0005s\u0000\u0000\u0222\u0223\u0005\u0018\u0000\u0000\u0223\u0239"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u001c\u0000\u0000\u0225\u0226"+
		"\u0003F#\u0000\u0226\u0228\u0005\"\u0000\u0000\u0227\u0229\u0003V+\u0000"+
		"\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000"+
		"\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005)\u0000\u0000\u022d"+
		"\u022e\u0003F#\u0000\u022e\u022f\u0005\u001d\u0000\u0000\u022f\u0239\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0003F#\u0000\u0231\u0232\u0005\u0014\u0000"+
		"\u0000\u0232\u0233\u0003\u0014\n\u0000\u0233\u0239\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0005\u0017\u0000\u0000\u0235\u0236\u0003h4\u0000\u0236\u0237"+
		"\u0005\u0018\u0000\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u021d"+
		"\u0001\u0000\u0000\u0000\u0238\u0224\u0001\u0000\u0000\u0000\u0238\u0230"+
		"\u0001\u0000\u0000\u0000\u0238\u0234\u0001\u0000\u0000\u0000\u0239M\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0005\u0005\u0000\u0000\u023b\u0240\u0003"+
		"P(\u0000\u023c\u023d\u0005\u0006\u0000\u0000\u023d\u023f\u0003P(\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0005\u0007\u0000\u0000\u0244O\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0005q\u0000\u0000\u0246\u0247\u0005\u0015\u0000\u0000\u0247\u0248"+
		"\u0003F#\u0000\u0248Q\u0001\u0000\u0000\u0000\u0249\u024a\u0005\u001c"+
		"\u0000\u0000\u024a\u024b\u0005q\u0000\u0000\u024b\u024d\u0005*\u0000\u0000"+
		"\u024c\u024e\u0003T*\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0005\u0003\u0000\u0000\u0252\u0253\u0003F#\u0000\u0253\u0254\u0005\u001d"+
		"\u0000\u0000\u0254S\u0001\u0000\u0000\u0000\u0255\u0256\u0005\"\u0000"+
		"\u0000\u0256\u0259\u0005q\u0000\u0000\u0257\u0259\u0003V+\u0000\u0258"+
		"\u0255\u0001\u0000\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259"+
		"U\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u0017\u0000\u0000\u025b\u025c"+
		"\u0003F#\u0000\u025c\u025d\u0005\u0018\u0000\u0000\u025dW\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0005d\u0000\u0000\u025f\u0260\u0003F#\u0000"+
		"\u0260\u0261\u0005+\u0000\u0000\u0261\u0262\u0003F#\u0000\u0262\u0263"+
		"\u0005,\u0000\u0000\u0263\u0264\u0003F#\u0000\u0264\u0271\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0005\u001c\u0000\u0000\u0266\u0267\u0005-\u0000"+
		"\u0000\u0267\u0268\u0003F#\u0000\u0268\u026a\u0005.\u0000\u0000\u0269"+
		"\u026b\u0003Z-\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001"+
		"\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0005"+
		"\u001d\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u025e\u0001"+
		"\u0000\u0000\u0000\u0270\u0265\u0001\u0000\u0000\u0000\u0271Y\u0001\u0000"+
		"\u0000\u0000\u0272\u0273\u0005/\u0000\u0000\u0273\u0274\u0003\\.\u0000"+
		"\u0274\u0275\u0005\u0015\u0000\u0000\u0275\u0276\u0003F#\u0000\u0276["+
		"\u0001\u0000\u0000\u0000\u0277\u0281\u0005q\u0000\u0000\u0278\u0281\u0005"+
		"r\u0000\u0000\u0279\u027b\u00050\u0000\u0000\u027a\u0279\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000"+
		"\u0000\u027c\u0281\u0005s\u0000\u0000\u027d\u0281\u00051\u0000\u0000\u027e"+
		"\u0281\u00052\u0000\u0000\u027f\u0281\u00053\u0000\u0000\u0280\u0277\u0001"+
		"\u0000\u0000\u0000\u0280\u0278\u0001\u0000\u0000\u0000\u0280\u027a\u0001"+
		"\u0000\u0000\u0000\u0280\u027d\u0001\u0000\u0000\u0000\u0280\u027e\u0001"+
		"\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281]\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\u0003`0\u0000\u0283\u0284\u0005\u001c\u0000\u0000"+
		"\u0284\u0285\u0003h4\u0000\u0285\u0286\u0005\u001d\u0000\u0000\u0286\u02d4"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u001c\u0000\u0000\u0288\u0289"+
		"\u0003f3\u0000\u0289\u028a\u00054\u0000\u0000\u028a\u028b\u0003`0\u0000"+
		"\u028b\u028c\u0005\u0002\u0000\u0000\u028c\u028d\u0003\u0014\n\u0000\u028d"+
		"\u028e\u00055\u0000\u0000\u028e\u028f\u0005\u001d\u0000\u0000\u028f\u0290"+
		"\u0005\u001c\u0000\u0000\u0290\u0291\u0003h4\u0000\u0291\u0292\u0005\u001d"+
		"\u0000\u0000\u0292\u02d4\u0001\u0000\u0000\u0000\u0293\u0294\u0005\u001c"+
		"\u0000\u0000\u0294\u0295\u00056\u0000\u0000\u0295\u0296\u00054\u0000\u0000"+
		"\u0296\u0297\u0003`0\u0000\u0297\u0298\u0005\u0002\u0000\u0000\u0298\u0299"+
		"\u0003\u0014\n\u0000\u0299\u029a\u00055\u0000\u0000\u029a\u029b\u0005"+
		"d\u0000\u0000\u029b\u029c\u0003F#\u0000\u029c\u029d\u0005)\u0000\u0000"+
		"\u029d\u029e\u0005\u001c\u0000\u0000\u029e\u029f\u0003h4\u0000\u029f\u02a0"+
		"\u0005\u001d\u0000\u0000\u02a0\u02a1\u0005\u001d\u0000\u0000\u02a1\u02a2"+
		"\u0005\u001c\u0000\u0000\u02a2\u02a3\u0003h4\u0000\u02a3\u02a4\u0005\u001d"+
		"\u0000\u0000\u02a4\u02d4\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005\u001c"+
		"\u0000\u0000\u02a6\u02a7\u00057\u0000\u0000\u02a7\u02a8\u00054\u0000\u0000"+
		"\u02a8\u02a9\u0003`0\u0000\u02a9\u02aa\u0005\u0002\u0000\u0000\u02aa\u02ab"+
		"\u0003\u0014\n\u0000\u02ab\u02ac\u00055\u0000\u0000\u02ac\u02ad\u0005"+
		"d\u0000\u0000\u02ad\u02ae\u0003F#\u0000\u02ae\u02af\u0005)\u0000\u0000"+
		"\u02af\u02b0\u0005\u001c\u0000\u0000\u02b0\u02b1\u0003h4\u0000\u02b1\u02b2"+
		"\u0005\u001d\u0000\u0000\u02b2\u02b3\u0005\u001d\u0000\u0000\u02b3\u02b4"+
		"\u0005\u001c\u0000\u0000\u02b4\u02b5\u0003h4\u0000\u02b5\u02b6\u0005\u001d"+
		"\u0000\u0000\u02b6\u02d4\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u001c"+
		"\u0000\u0000\u02b8\u02b9\u00058\u0000\u0000\u02b9\u02ba\u00054\u0000\u0000"+
		"\u02ba\u02bb\u0003`0\u0000\u02bb\u02bc\u0005\u0002\u0000\u0000\u02bc\u02bd"+
		"\u0003\u0014\n\u0000\u02bd\u02be\u00055\u0000\u0000\u02be\u02bf\u0005"+
		"d\u0000\u0000\u02bf\u02c0\u0003F#\u0000\u02c0\u02c1\u0005\u001d\u0000"+
		"\u0000\u02c1\u02c2\u0005\u001c\u0000\u0000\u02c2\u02c3\u0003h4\u0000\u02c3"+
		"\u02c4\u0005\u001d\u0000\u0000\u02c4\u02d4\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0005\u001c\u0000\u0000\u02c6\u02c7\u00059\u0000\u0000\u02c7\u02c8"+
		"\u00054\u0000\u0000\u02c8\u02c9\u0003`0\u0000\u02c9\u02ca\u0005\u0002"+
		"\u0000\u0000\u02ca\u02cb\u0003\u0014\n\u0000\u02cb\u02cc\u00055\u0000"+
		"\u0000\u02cc\u02cd\u0005d\u0000\u0000\u02cd\u02ce\u0003F#\u0000\u02ce"+
		"\u02cf\u0005\u001d\u0000\u0000\u02cf\u02d0\u0005\u001c\u0000\u0000\u02d0"+
		"\u02d1\u0003h4\u0000\u02d1\u02d2\u0005\u001d\u0000\u0000\u02d2\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d3\u0282\u0001\u0000\u0000\u0000\u02d3\u0287\u0001"+
		"\u0000\u0000\u0000\u02d3\u0293\u0001\u0000\u0000\u0000\u02d3\u02a5\u0001"+
		"\u0000\u0000\u0000\u02d3\u02b7\u0001\u0000\u0000\u0000\u02d3\u02c5\u0001"+
		"\u0000\u0000\u0000\u02d4_\u0001\u0000\u0000\u0000\u02d5\u02e1\u0005q\u0000"+
		"\u0000\u02d6\u02e1\u0003b1\u0000\u02d7\u02e1\u0003d2\u0000\u02d8\u02d9"+
		"\u0005\u001c\u0000\u0000\u02d9\u02da\u0005:\u0000\u0000\u02da\u02db\u0005"+
		"q\u0000\u0000\u02db\u02e1\u0005\u001d\u0000\u0000\u02dc\u02dd\u0005\u001c"+
		"\u0000\u0000\u02dd\u02de\u0005;\u0000\u0000\u02de\u02df\u0005q\u0000\u0000"+
		"\u02df\u02e1\u0005\u001d\u0000\u0000\u02e0\u02d5\u0001\u0000\u0000\u0000"+
		"\u02e0\u02d6\u0001\u0000\u0000\u0000\u02e0\u02d7\u0001\u0000\u0000\u0000"+
		"\u02e0\u02d8\u0001\u0000\u0000\u0000\u02e0\u02dc\u0001\u0000\u0000\u0000"+
		"\u02e1a\u0001\u0000\u0000\u0000\u02e2\u02ea\u0005<\u0000\u0000\u02e3\u02ea"+
		"\u0005=\u0000\u0000\u02e4\u02ea\u0005>\u0000\u0000\u02e5\u02ea\u0005?"+
		"\u0000\u0000\u02e6\u02ea\u0005@\u0000\u0000\u02e7\u02ea\u0005A\u0000\u0000"+
		"\u02e8\u02ea\u0005B\u0000\u0000\u02e9\u02e2\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e9\u02e4\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea"+
		"c\u0001\u0000\u0000\u0000\u02eb\u02fb\u0005C\u0000\u0000\u02ec\u02fb\u0005"+
		"D\u0000\u0000\u02ed\u02fb\u0005E\u0000\u0000\u02ee\u02fb\u0005F\u0000"+
		"\u0000\u02ef\u02fb\u0005G\u0000\u0000\u02f0\u02fb\u0005H\u0000\u0000\u02f1"+
		"\u02fb\u0005I\u0000\u0000\u02f2\u02fb\u0005J\u0000\u0000\u02f3\u02fb\u0005"+
		"K\u0000\u0000\u02f4\u02fb\u0005L\u0000\u0000\u02f5\u02fb\u0005M\u0000"+
		"\u0000\u02f6\u02fb\u0005N\u0000\u0000\u02f7\u02fb\u0005O\u0000\u0000\u02f8"+
		"\u02fb\u0005P\u0000\u0000\u02f9\u02fb\u0005Q\u0000\u0000\u02fa\u02eb\u0001"+
		"\u0000\u0000\u0000\u02fa\u02ec\u0001\u0000\u0000\u0000\u02fa\u02ed\u0001"+
		"\u0000\u0000\u0000\u02fa\u02ee\u0001\u0000\u0000\u0000\u02fa\u02ef\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f0\u0001\u0000\u0000\u0000\u02fa\u02f1\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f2\u0001\u0000\u0000\u0000\u02fa\u02f3\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f4\u0001\u0000\u0000\u0000\u02fa\u02f5\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f6\u0001\u0000\u0000\u0000\u02fa\u02f7\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fbe\u0001\u0000\u0000\u0000\u02fc\u0302\u0005R\u0000"+
		"\u0000\u02fd\u0302\u0005S\u0000\u0000\u02fe\u0302\u0005T\u0000\u0000\u02ff"+
		"\u0302\u0005U\u0000\u0000\u0300\u0302\u0005V\u0000\u0000\u0301\u02fc\u0001"+
		"\u0000\u0000\u0000\u0301\u02fd\u0001\u0000\u0000\u0000\u0301\u02fe\u0001"+
		"\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0300\u0001"+
		"\u0000\u0000\u0000\u0302g\u0001\u0000\u0000\u0000\u0303\u0308\u0003F#"+
		"\u0000\u0304\u0305\u0005\u0006\u0000\u0000\u0305\u0307\u0003F#\u0000\u0306"+
		"\u0304\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308"+
		"\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309"+
		"\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b"+
		"\u0303\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c"+
		"i\u0001\u0000\u0000\u0000\u030d\u0311\u00050\u0000\u0000\u030e\u0311\u0005"+
		"W\u0000\u0000\u030f\u0311\u0005\u001f\u0000\u0000\u0310\u030d\u0001\u0000"+
		"\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u030f\u0001\u0000"+
		"\u0000\u0000\u0311k\u0001\u0000\u0000\u0000\u0312\u0319\u0005W\u0000\u0000"+
		"\u0313\u0319\u00050\u0000\u0000\u0314\u0319\u0005X\u0000\u0000\u0315\u0319"+
		"\u0005Y\u0000\u0000\u0316\u0319\u0005Z\u0000\u0000\u0317\u0319\u0005["+
		"\u0000\u0000\u0318\u0312\u0001\u0000\u0000\u0000\u0318\u0313\u0001\u0000"+
		"\u0000\u0000\u0318\u0314\u0001\u0000\u0000\u0000\u0318\u0315\u0001\u0000"+
		"\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0317\u0001\u0000"+
		"\u0000\u0000\u0319m\u0001\u0000\u0000\u0000\u031a\u0321\u0005\u0003\u0000"+
		"\u0000\u031b\u0321\u0005\\\u0000\u0000\u031c\u0321\u0005]\u0000\u0000"+
		"\u031d\u0321\u0005^\u0000\u0000\u031e\u0321\u0005_\u0000\u0000\u031f\u0321"+
		"\u0005`\u0000\u0000\u0320\u031a\u0001\u0000\u0000\u0000\u0320\u031b\u0001"+
		"\u0000\u0000\u0000\u0320\u031c\u0001\u0000\u0000\u0000\u0320\u031d\u0001"+
		"\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u031f\u0001"+
		"\u0000\u0000\u0000\u0321o\u0001\u0000\u0000\u0000\u0322\u0326\u0005a\u0000"+
		"\u0000\u0323\u0326\u0005b\u0000\u0000\u0324\u0326\u0005c\u0000\u0000\u0325"+
		"\u0322\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325"+
		"\u0324\u0001\u0000\u0000\u0000\u0326q\u0001\u0000\u0000\u0000\u0327\u0331"+
		"\u00051\u0000\u0000\u0328\u0331\u00052\u0000\u0000\u0329\u0331\u0005r"+
		"\u0000\u0000\u032a\u0331\u0005s\u0000\u0000\u032b\u0331\u0005t\u0000\u0000"+
		"\u032c\u0331\u0005u\u0000\u0000\u032d\u0331\u0005v\u0000\u0000\u032e\u0331"+
		"\u0005w\u0000\u0000\u032f\u0331\u0005x\u0000\u0000\u0330\u0327\u0001\u0000"+
		"\u0000\u0000\u0330\u0328\u0001\u0000\u0000\u0000\u0330\u0329\u0001\u0000"+
		"\u0000\u0000\u0330\u032a\u0001\u0000\u0000\u0000\u0330\u032b\u0001\u0000"+
		"\u0000\u0000\u0330\u032c\u0001\u0000\u0000\u0000\u0330\u032d\u0001\u0000"+
		"\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u032f\u0001\u0000"+
		"\u0000\u0000\u0331s\u0001\u0000\u0000\u0000Gw\u007f\u0087\u008c\u0096"+
		"\u009a\u00b0\u00b5\u00bc\u00cb\u00d2\u00e4\u00e9\u00f7\u00f9\u0101\u0104"+
		"\u0116\u011a\u0122\u0125\u012e\u0136\u013a\u013c\u013e\u0146\u014d\u0153"+
		"\u0156\u0160\u016d\u0176\u0179\u0183\u0187\u018c\u018f\u0192\u019a\u019c"+
		"\u01a5\u01a7\u01b1\u01b9\u01cf\u01dc\u01f2\u01f4\u0216\u022a\u0238\u0240"+
		"\u024f\u0258\u026c\u0270\u027a\u0280\u02d3\u02e0\u02e9\u02fa\u0301\u0308"+
		"\u030b\u0310\u0318\u0320\u0325\u0330";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}