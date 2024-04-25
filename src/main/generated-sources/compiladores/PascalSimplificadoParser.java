// Generated from compiladores/PascalSimplificado.g4 by ANTLR 4.13.1
package compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PascalSimplificadoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, CASE=4, CONST=5, DIV=6, DO=7, DOWNTO=8, ELSE=9, 
		END=10, FALSE=11, FILE=12, FOR=13, FUNCTION=14, GOTO=15, IF=16, IN=17, 
		LABEL=18, MOD=19, NIL=20, NOT=21, OF=22, OR=23, PACKED=24, PROCEDURE=25, 
		PROGRAM=26, RECORD=27, REPEAT=28, SET=29, THEN=30, TO=31, TYPE=32, UNTIL=33, 
		VAR=34, WHILE=35, WITH=36, INTEGER=37, REAL=38, BOOLEAN=39, CHAR=40, STRING=41, 
		WRITE=42, WRITELN=43, READ=44, TRUE=45, SOMA=46, SUBTRACAO=47, MULTIPLICACAO=48, 
		DIVISAO=49, MAIOR=50, MENOR=51, MAIORIGUAL=52, MENORIGUAL=53, DIFERENTE=54, 
		IGUAL=55, ATRIBUICAO=56, PONTOEVIRGULA=57, VIRGULA=58, PONTO=59, DOISPONTOS=60, 
		PARENTESESESQ=61, PARENTESESDIR=62, IDENTIFICADOR=63, STRING_LITERAL=64, 
		INTEIRO=65, WS=66, COMENTARIO=67;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declara = 2, RULE_mais_dc = 3, 
		RULE_cont_dc = 4, RULE_dvar = 5, RULE_tipo_var = 6, RULE_variaveis = 7, 
		RULE_mais_var = 8, RULE_sentencas = 9, RULE_mais_sentencas = 10, RULE_cont_sentencas = 11, 
		RULE_var_read = 12, RULE_mais_var_read = 13, RULE_exp_write = 14, RULE_mais_exp_write = 15, 
		RULE_comando = 16, RULE_pfalsa = 17, RULE_expressao_logica = 18, RULE_mais_expr_logica = 19, 
		RULE_termo_logico = 20, RULE_mais_termo_logico = 21, RULE_fator_logico = 22, 
		RULE_relacional = 23, RULE_expressao = 24, RULE_mais_expressao = 25, RULE_termo = 26, 
		RULE_mais_termo = 27, RULE_fator = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declara", "mais_dc", "cont_dc", "dvar", "tipo_var", 
			"variaveis", "mais_var", "sentencas", "mais_sentencas", "cont_sentencas", 
			"var_read", "mais_var_read", "exp_write", "mais_exp_write", "comando", 
			"pfalsa", "expressao_logica", "mais_expr_logica", "termo_logico", "mais_termo_logico", 
			"fator_logico", "relacional", "expressao", "mais_expressao", "termo", 
			"mais_termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'ARRAY'", "'BEGIN'", "'CASE'", "'CONST'", "'DIV'", "'DO'", 
			"'DOWNTO'", "'ELSE'", "'END'", "'FALSE'", "'FILE'", "'FOR'", "'FUNCTION'", 
			"'GOTO'", "'IF'", "'IN'", "'LABEL'", "'MOD'", "'NIL'", "'NOT'", "'OF'", 
			"'OR'", "'PACKED'", "'PROCEDURE'", "'PROGRAM'", "'RECORD'", "'REPEAT'", 
			"'SET'", "'THEN'", "'TO'", "'TYPE'", "'UNTIL'", "'VAR'", "'WHILE'", "'WITH'", 
			"'INTEGER'", "'REAL'", "'BOOLEAN'", "'CHAR'", "'STRING'", "'WRITE'", 
			"'WRITELN'", "'READ'", "'TRUE'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'>='", "'<='", "'<>'", "'='", "':='", "';'", "','", "'.'", "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "BEGIN", "CASE", "CONST", "DIV", "DO", "DOWNTO", 
			"ELSE", "END", "FALSE", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", 
			"LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", 
			"RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", 
			"WITH", "INTEGER", "REAL", "BOOLEAN", "CHAR", "STRING", "WRITE", "WRITELN", 
			"READ", "TRUE", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "MAIOR", 
			"MENOR", "MAIORIGUAL", "MENORIGUAL", "DIFERENTE", "IGUAL", "ATRIBUICAO", 
			"PONTOEVIRGULA", "VIRGULA", "PONTO", "DOISPONTOS", "PARENTESESESQ", "PARENTESESDIR", 
			"IDENTIFICADOR", "STRING_LITERAL", "INTEIRO", "WS", "COMENTARIO"
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
	public String getGrammarFileName() { return "PascalSimplificado.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalSimplificadoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalSimplificadoParser.PROGRAM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(PascalSimplificadoParser.IDENTIFICADOR, 0); }
		public TerminalNode PONTOEVIRGULA() { return getToken(PascalSimplificadoParser.PONTOEVIRGULA, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(PascalSimplificadoParser.PONTO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PROGRAM);
			setState(59);
			match(IDENTIFICADOR);
			setState(60);
			match(PONTOEVIRGULA);
			setState(61);
			corpo();
			setState(62);
			match(PONTO);
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
	public static class CorpoContext extends ParserRuleContext {
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PascalSimplificadoParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalSimplificadoParser.END, 0); }
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			declara();
			setState(65);
			match(BEGIN);
			setState(66);
			sentencas();
			setState(67);
			match(END);
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
	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalSimplificadoParser.VAR, 0); }
		public DvarContext dvar() {
			return getRuleContext(DvarContext.class,0);
		}
		public Mais_dcContext mais_dc() {
			return getRuleContext(Mais_dcContext.class,0);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(69);
				match(VAR);
				setState(70);
				dvar();
				setState(71);
				mais_dc();
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
	public static class Mais_dcContext extends ParserRuleContext {
		public TerminalNode PONTOEVIRGULA() { return getToken(PascalSimplificadoParser.PONTOEVIRGULA, 0); }
		public Cont_dcContext cont_dc() {
			return getRuleContext(Cont_dcContext.class,0);
		}
		public Mais_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_dc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_dc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_dc(this);
		}
	}

	public final Mais_dcContext mais_dc() throws RecognitionException {
		Mais_dcContext _localctx = new Mais_dcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mais_dc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PONTOEVIRGULA);
			setState(76);
			cont_dc();
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
	public static class Cont_dcContext extends ParserRuleContext {
		public DvarContext dvar() {
			return getRuleContext(DvarContext.class,0);
		}
		public Mais_dcContext mais_dc() {
			return getRuleContext(Mais_dcContext.class,0);
		}
		public Cont_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_dc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterCont_dc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitCont_dc(this);
		}
	}

	public final Cont_dcContext cont_dc() throws RecognitionException {
		Cont_dcContext _localctx = new Cont_dcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cont_dc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(78);
				dvar();
				setState(79);
				mais_dc();
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
	public static class DvarContext extends ParserRuleContext {
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(PascalSimplificadoParser.DOISPONTOS, 0); }
		public Tipo_varContext tipo_var() {
			return getRuleContext(Tipo_varContext.class,0);
		}
		public DvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterDvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitDvar(this);
		}
	}

	public final DvarContext dvar() throws RecognitionException {
		DvarContext _localctx = new DvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			variaveis();
			setState(84);
			match(DOISPONTOS);
			setState(85);
			tipo_var();
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
	public static class Tipo_varContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PascalSimplificadoParser.INTEGER, 0); }
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterTipo_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitTipo_var(this);
		}
	}

	public final Tipo_varContext tipo_var() throws RecognitionException {
		Tipo_varContext _localctx = new Tipo_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(INTEGER);
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
	public static class VariaveisContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(PascalSimplificadoParser.IDENTIFICADOR, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitVariaveis(this);
		}
	}

	public final VariaveisContext variaveis() throws RecognitionException {
		VariaveisContext _localctx = new VariaveisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENTIFICADOR);
			setState(90);
			mais_var();
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
	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(PascalSimplificadoParser.VIRGULA, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(92);
				match(VIRGULA);
				setState(93);
				variaveis();
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
	public static class SentencasContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Mais_sentencasContext mais_sentencas() {
			return getRuleContext(Mais_sentencasContext.class,0);
		}
		public SentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterSentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitSentencas(this);
		}
	}

	public final SentencasContext sentencas() throws RecognitionException {
		SentencasContext _localctx = new SentencasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			comando();
			setState(97);
			mais_sentencas();
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
	public static class Mais_sentencasContext extends ParserRuleContext {
		public TerminalNode PONTOEVIRGULA() { return getToken(PascalSimplificadoParser.PONTOEVIRGULA, 0); }
		public Cont_sentencasContext cont_sentencas() {
			return getRuleContext(Cont_sentencasContext.class,0);
		}
		public Mais_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_sentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_sentencas(this);
		}
	}

	public final Mais_sentencasContext mais_sentencas() throws RecognitionException {
		Mais_sentencasContext _localctx = new Mais_sentencasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mais_sentencas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PONTOEVIRGULA);
			setState(100);
			cont_sentencas();
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
	public static class Cont_sentencasContext extends ParserRuleContext {
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public Cont_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterCont_sentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitCont_sentencas(this);
		}
	}

	public final Cont_sentencasContext cont_sentencas() throws RecognitionException {
		Cont_sentencasContext _localctx = new Cont_sentencasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont_sentencas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223341215900950528L) != 0)) {
				{
				setState(102);
				sentencas();
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
	public static class Var_readContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(PascalSimplificadoParser.IDENTIFICADOR, 0); }
		public Mais_var_readContext mais_var_read() {
			return getRuleContext(Mais_var_readContext.class,0);
		}
		public Var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterVar_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitVar_read(this);
		}
	}

	public final Var_readContext var_read() throws RecognitionException {
		Var_readContext _localctx = new Var_readContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IDENTIFICADOR);
			setState(106);
			mais_var_read();
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
	public static class Mais_var_readContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(PascalSimplificadoParser.VIRGULA, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public Mais_var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_var_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_var_read(this);
		}
	}

	public final Mais_var_readContext mais_var_read() throws RecognitionException {
		Mais_var_readContext _localctx = new Mais_var_readContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mais_var_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(108);
				match(VIRGULA);
				setState(109);
				var_read();
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
	public static class Exp_writeContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(PascalSimplificadoParser.IDENTIFICADOR, 0); }
		public Mais_exp_writeContext mais_exp_write() {
			return getRuleContext(Mais_exp_writeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PascalSimplificadoParser.STRING_LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(PascalSimplificadoParser.INTEIRO, 0); }
		public Exp_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterExp_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitExp_write(this);
		}
	}

	public final Exp_writeContext exp_write() throws RecognitionException {
		Exp_writeContext _localctx = new Exp_writeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_write);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(IDENTIFICADOR);
				setState(113);
				mais_exp_write();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(STRING_LITERAL);
				setState(115);
				mais_exp_write();
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(INTEIRO);
				setState(117);
				mais_exp_write();
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
	public static class Mais_exp_writeContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(PascalSimplificadoParser.VIRGULA, 0); }
		public Exp_writeContext exp_write() {
			return getRuleContext(Exp_writeContext.class,0);
		}
		public Mais_exp_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_exp_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_exp_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_exp_write(this);
		}
	}

	public final Mais_exp_writeContext mais_exp_write() throws RecognitionException {
		Mais_exp_writeContext _localctx = new Mais_exp_writeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mais_exp_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(120);
				match(VIRGULA);
				setState(121);
				exp_write();
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
	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(PascalSimplificadoParser.READ, 0); }
		public TerminalNode PARENTESESESQ() { return getToken(PascalSimplificadoParser.PARENTESESESQ, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public TerminalNode PARENTESESDIR() { return getToken(PascalSimplificadoParser.PARENTESESDIR, 0); }
		public TerminalNode WRITE() { return getToken(PascalSimplificadoParser.WRITE, 0); }
		public Exp_writeContext exp_write() {
			return getRuleContext(Exp_writeContext.class,0);
		}
		public TerminalNode WRITELN() { return getToken(PascalSimplificadoParser.WRITELN, 0); }
		public TerminalNode FOR() { return getToken(PascalSimplificadoParser.FOR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(PascalSimplificadoParser.IDENTIFICADOR, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(PascalSimplificadoParser.ATRIBUICAO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode TO() { return getToken(PascalSimplificadoParser.TO, 0); }
		public TerminalNode DO() { return getToken(PascalSimplificadoParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(PascalSimplificadoParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalSimplificadoParser.END, 0); }
		public TerminalNode REPEAT() { return getToken(PascalSimplificadoParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(PascalSimplificadoParser.UNTIL, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PascalSimplificadoParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(PascalSimplificadoParser.IF, 0); }
		public TerminalNode THEN() { return getToken(PascalSimplificadoParser.THEN, 0); }
		public PfalsaContext pfalsa() {
			return getRuleContext(PfalsaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(READ);
				setState(125);
				match(PARENTESESESQ);
				setState(126);
				var_read();
				setState(127);
				match(PARENTESESDIR);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(WRITE);
				setState(130);
				match(PARENTESESESQ);
				setState(131);
				exp_write();
				setState(132);
				match(PARENTESESDIR);
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(WRITELN);
				setState(135);
				match(PARENTESESESQ);
				setState(136);
				exp_write();
				setState(137);
				match(PARENTESESDIR);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(FOR);
				setState(140);
				match(IDENTIFICADOR);
				setState(141);
				match(ATRIBUICAO);
				setState(142);
				expressao();
				setState(143);
				match(TO);
				setState(144);
				expressao();
				setState(145);
				match(DO);
				setState(146);
				match(BEGIN);
				setState(147);
				sentencas();
				setState(148);
				match(END);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(REPEAT);
				setState(151);
				sentencas();
				setState(152);
				match(UNTIL);
				setState(153);
				match(PARENTESESESQ);
				setState(154);
				expressao_logica();
				setState(155);
				match(PARENTESESDIR);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(WHILE);
				setState(158);
				match(PARENTESESESQ);
				setState(159);
				expressao_logica();
				setState(160);
				match(PARENTESESDIR);
				setState(161);
				match(DO);
				setState(162);
				match(BEGIN);
				setState(163);
				sentencas();
				setState(164);
				match(END);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				match(IF);
				setState(167);
				match(PARENTESESESQ);
				setState(168);
				expressao_logica();
				setState(169);
				match(PARENTESESDIR);
				setState(170);
				match(THEN);
				setState(171);
				match(BEGIN);
				setState(172);
				sentencas();
				setState(173);
				match(END);
				setState(174);
				pfalsa();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(IDENTIFICADOR);
				setState(177);
				match(ATRIBUICAO);
				setState(178);
				expressao();
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
	public static class PfalsaContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PascalSimplificadoParser.ELSE, 0); }
		public TerminalNode BEGIN() { return getToken(PascalSimplificadoParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalSimplificadoParser.END, 0); }
		public PfalsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pfalsa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterPfalsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitPfalsa(this);
		}
	}

	public final PfalsaContext pfalsa() throws RecognitionException {
		PfalsaContext _localctx = new PfalsaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pfalsa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(181);
				match(ELSE);
				setState(182);
				match(BEGIN);
				setState(183);
				sentencas();
				setState(184);
				match(END);
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
	public static class Expressao_logicaContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Mais_expr_logicaContext mais_expr_logica() {
			return getRuleContext(Mais_expr_logicaContext.class,0);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			termo_logico();
			setState(189);
			mais_expr_logica();
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
	public static class Mais_expr_logicaContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PascalSimplificadoParser.OR, 0); }
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Mais_expr_logicaContext mais_expr_logica() {
			return getRuleContext(Mais_expr_logicaContext.class,0);
		}
		public Mais_expr_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expr_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_expr_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_expr_logica(this);
		}
	}

	public final Mais_expr_logicaContext mais_expr_logica() throws RecognitionException {
		Mais_expr_logicaContext _localctx = new Mais_expr_logicaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mais_expr_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(191);
				match(OR);
				setState(192);
				termo_logico();
				setState(193);
				mais_expr_logica();
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
	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Mais_termo_logicoContext mais_termo_logico() {
			return getRuleContext(Mais_termo_logicoContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			fator_logico();
			setState(198);
			mais_termo_logico();
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
	public static class Mais_termo_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PascalSimplificadoParser.AND, 0); }
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Mais_termo_logicoContext mais_termo_logico() {
			return getRuleContext(Mais_termo_logicoContext.class,0);
		}
		public Mais_termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_termo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_termo_logico(this);
		}
	}

	public final Mais_termo_logicoContext mais_termo_logico() throws RecognitionException {
		Mais_termo_logicoContext _localctx = new Mais_termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mais_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(200);
				match(AND);
				setState(201);
				fator_logico();
				setState(202);
				mais_termo_logico();
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
	public static class Fator_logicoContext extends ParserRuleContext {
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public TerminalNode PARENTESESESQ() { return getToken(PascalSimplificadoParser.PARENTESESESQ, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode PARENTESESDIR() { return getToken(PascalSimplificadoParser.PARENTESESDIR, 0); }
		public TerminalNode NOT() { return getToken(PascalSimplificadoParser.NOT, 0); }
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(PascalSimplificadoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascalSimplificadoParser.FALSE, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fator_logico);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				relacional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(PARENTESESESQ);
				setState(208);
				expressao_logica();
				setState(209);
				match(PARENTESESDIR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(NOT);
				setState(212);
				fator_logico();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(FALSE);
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
	public static class RelacionalContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(PascalSimplificadoParser.IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(PascalSimplificadoParser.MAIOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(PascalSimplificadoParser.MAIORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(PascalSimplificadoParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(PascalSimplificadoParser.MENORIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(PascalSimplificadoParser.DIFERENTE, 0); }
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitRelacional(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relacional);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				expressao();
				setState(218);
				match(IGUAL);
				setState(219);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				expressao();
				setState(222);
				match(MAIOR);
				setState(223);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				expressao();
				setState(226);
				match(MAIORIGUAL);
				setState(227);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				expressao();
				setState(230);
				match(MENOR);
				setState(231);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				expressao();
				setState(234);
				match(MENORIGUAL);
				setState(235);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				expressao();
				setState(238);
				match(DIFERENTE);
				setState(239);
				expressao();
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
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			termo();
			setState(244);
			mais_expressao();
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
	public static class Mais_expressaoContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(PascalSimplificadoParser.SOMA, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode SUBTRACAO() { return getToken(PascalSimplificadoParser.SUBTRACAO, 0); }
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mais_expressao);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SOMA) {
					{
					setState(246);
					match(SOMA);
					setState(247);
					termo();
					setState(248);
					mais_expressao();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(252);
					match(SUBTRACAO);
					setState(253);
					termo();
					setState(254);
					mais_expressao();
					}
				}

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
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Mais_termoContext mais_termo() {
			return getRuleContext(Mais_termoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			fator();
			setState(261);
			mais_termo();
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
	public static class Mais_termoContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(PascalSimplificadoParser.MULTIPLICACAO, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Mais_termoContext mais_termo() {
			return getRuleContext(Mais_termoContext.class,0);
		}
		public TerminalNode DIVISAO() { return getToken(PascalSimplificadoParser.DIVISAO, 0); }
		public Mais_termoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterMais_termo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitMais_termo(this);
		}
	}

	public final Mais_termoContext mais_termo() throws RecognitionException {
		Mais_termoContext _localctx = new Mais_termoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_termo);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULTIPLICACAO) {
					{
					setState(263);
					match(MULTIPLICACAO);
					setState(264);
					fator();
					setState(265);
					mais_termo();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIVISAO) {
					{
					setState(269);
					match(DIVISAO);
					setState(270);
					fator();
					setState(271);
					mais_termo();
					}
				}

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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(PascalSimplificadoParser.IDENTIFICADOR, 0); }
		public TerminalNode INTEIRO() { return getToken(PascalSimplificadoParser.INTEIRO, 0); }
		public TerminalNode PARENTESESESQ() { return getToken(PascalSimplificadoParser.PARENTESESESQ, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESESDIR() { return getToken(PascalSimplificadoParser.PARENTESESDIR, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalSimplificadoListener ) ((PascalSimplificadoListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fator);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(IDENTIFICADOR);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(INTEIRO);
				}
				break;
			case PARENTESESESQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(PARENTESESESQ);
				setState(280);
				expressao();
				setState(281);
				match(PARENTESESDIR);
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

	public static final String _serializedATN =
		"\u0004\u0001C\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"J\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b_\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0003\u000bh\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0003\ro\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000ew\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f{\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b4\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bb\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00c4\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00cd\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d8\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00f2\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00fb\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0101\b\u0019\u0003\u0019\u0103\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u010c\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0112\b\u001b\u0003\u001b\u0114\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u011c\b\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468\u0000\u0000\u0123\u0000:\u0001\u0000\u0000\u0000\u0002@\u0001"+
		"\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000"+
		"\u0000\bQ\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\fW\u0001"+
		"\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000"+
		"\u0000\u0012`\u0001\u0000\u0000\u0000\u0014c\u0001\u0000\u0000\u0000\u0016"+
		"g\u0001\u0000\u0000\u0000\u0018i\u0001\u0000\u0000\u0000\u001an\u0001"+
		"\u0000\u0000\u0000\u001cv\u0001\u0000\u0000\u0000\u001ez\u0001\u0000\u0000"+
		"\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00ba\u0001\u0000\u0000\u0000"+
		"$\u00bc\u0001\u0000\u0000\u0000&\u00c3\u0001\u0000\u0000\u0000(\u00c5"+
		"\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000"+
		"\u0000\u0000.\u00f1\u0001\u0000\u0000\u00000\u00f3\u0001\u0000\u0000\u0000"+
		"2\u0102\u0001\u0000\u0000\u00004\u0104\u0001\u0000\u0000\u00006\u0113"+
		"\u0001\u0000\u0000\u00008\u011b\u0001\u0000\u0000\u0000:;\u0005\u001a"+
		"\u0000\u0000;<\u0005?\u0000\u0000<=\u00059\u0000\u0000=>\u0003\u0002\u0001"+
		"\u0000>?\u0005;\u0000\u0000?\u0001\u0001\u0000\u0000\u0000@A\u0003\u0004"+
		"\u0002\u0000AB\u0005\u0003\u0000\u0000BC\u0003\u0012\t\u0000CD\u0005\n"+
		"\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EF\u0005\"\u0000\u0000FG\u0003"+
		"\n\u0005\u0000GH\u0003\u0006\u0003\u0000HJ\u0001\u0000\u0000\u0000IE\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000"+
		"\u0000KL\u00059\u0000\u0000LM\u0003\b\u0004\u0000M\u0007\u0001\u0000\u0000"+
		"\u0000NO\u0003\n\u0005\u0000OP\u0003\u0006\u0003\u0000PR\u0001\u0000\u0000"+
		"\u0000QN\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\t\u0001\u0000"+
		"\u0000\u0000ST\u0003\u000e\u0007\u0000TU\u0005<\u0000\u0000UV\u0003\f"+
		"\u0006\u0000V\u000b\u0001\u0000\u0000\u0000WX\u0005%\u0000\u0000X\r\u0001"+
		"\u0000\u0000\u0000YZ\u0005?\u0000\u0000Z[\u0003\u0010\b\u0000[\u000f\u0001"+
		"\u0000\u0000\u0000\\]\u0005:\u0000\u0000]_\u0003\u000e\u0007\u0000^\\"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0011\u0001\u0000"+
		"\u0000\u0000`a\u0003 \u0010\u0000ab\u0003\u0014\n\u0000b\u0013\u0001\u0000"+
		"\u0000\u0000cd\u00059\u0000\u0000de\u0003\u0016\u000b\u0000e\u0015\u0001"+
		"\u0000\u0000\u0000fh\u0003\u0012\t\u0000gf\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u0017\u0001\u0000\u0000\u0000ij\u0005?\u0000\u0000"+
		"jk\u0003\u001a\r\u0000k\u0019\u0001\u0000\u0000\u0000lm\u0005:\u0000\u0000"+
		"mo\u0003\u0018\f\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o\u001b\u0001\u0000\u0000\u0000pq\u0005?\u0000\u0000qw\u0003\u001e\u000f"+
		"\u0000rs\u0005@\u0000\u0000sw\u0003\u001e\u000f\u0000tu\u0005A\u0000\u0000"+
		"uw\u0003\u001e\u000f\u0000vp\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000w\u001d\u0001\u0000\u0000\u0000xy\u0005"+
		":\u0000\u0000y{\u0003\u001c\u000e\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u001f\u0001\u0000\u0000\u0000|}\u0005,\u0000\u0000"+
		"}~\u0005=\u0000\u0000~\u007f\u0003\u0018\f\u0000\u007f\u0080\u0005>\u0000"+
		"\u0000\u0080\u00b4\u0001\u0000\u0000\u0000\u0081\u0082\u0005*\u0000\u0000"+
		"\u0082\u0083\u0005=\u0000\u0000\u0083\u0084\u0003\u001c\u000e\u0000\u0084"+
		"\u0085\u0005>\u0000\u0000\u0085\u00b4\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005+\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088\u0089\u0003\u001c"+
		"\u000e\u0000\u0089\u008a\u0005>\u0000\u0000\u008a\u00b4\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\r\u0000\u0000\u008c\u008d\u0005?\u0000\u0000"+
		"\u008d\u008e\u00058\u0000\u0000\u008e\u008f\u00030\u0018\u0000\u008f\u0090"+
		"\u0005\u001f\u0000\u0000\u0090\u0091\u00030\u0018\u0000\u0091\u0092\u0005"+
		"\u0007\u0000\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0003"+
		"\u0012\t\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u00b4\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0098\u0003\u0012"+
		"\t\u0000\u0098\u0099\u0005!\u0000\u0000\u0099\u009a\u0005=\u0000\u0000"+
		"\u009a\u009b\u0003$\u0012\u0000\u009b\u009c\u0005>\u0000\u0000\u009c\u00b4"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005#\u0000\u0000\u009e\u009f\u0005"+
		"=\u0000\u0000\u009f\u00a0\u0003$\u0012\u0000\u00a0\u00a1\u0005>\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0007\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000"+
		"\u0000\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00a5\u0005\n\u0000\u0000"+
		"\u00a5\u00b4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000"+
		"\u00a7\u00a8\u0005=\u0000\u0000\u00a8\u00a9\u0003$\u0012\u0000\u00a9\u00aa"+
		"\u0005>\u0000\u0000\u00aa\u00ab\u0005\u001e\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0003\u0000\u0000\u00ac\u00ad\u0003\u0012\t\u0000\u00ad\u00ae\u0005\n"+
		"\u0000\u0000\u00ae\u00af\u0003\"\u0011\u0000\u00af\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005?\u0000\u0000\u00b1\u00b2\u00058\u0000\u0000\u00b2"+
		"\u00b4\u00030\u0018\u0000\u00b3|\u0001\u0000\u0000\u0000\u00b3\u0081\u0001"+
		"\u0000\u0000\u0000\u00b3\u0086\u0001\u0000\u0000\u0000\u00b3\u008b\u0001"+
		"\u0000\u0000\u0000\u00b3\u0096\u0001\u0000\u0000\u0000\u00b3\u009d\u0001"+
		"\u0000\u0000\u0000\u00b3\u00a6\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\t"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u00b8\u0003\u0012"+
		"\t\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb#\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd"+
		"\u00be\u0003&\u0013\u0000\u00be%\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0017\u0000\u0000\u00c0\u00c1\u0003(\u0014\u0000\u00c1\u00c2\u0003&\u0013"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\'\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0003,\u0016\u0000\u00c6\u00c7\u0003*\u0015\u0000\u00c7)"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0001\u0000\u0000\u00c9\u00ca"+
		"\u0003,\u0016\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd+\u0001\u0000\u0000\u0000\u00ce\u00d8\u0003.\u0017\u0000"+
		"\u00cf\u00d0\u0005=\u0000\u0000\u00d0\u00d1\u0003$\u0012\u0000\u00d1\u00d2"+
		"\u0005>\u0000\u0000\u00d2\u00d8\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0015\u0000\u0000\u00d4\u00d8\u0003,\u0016\u0000\u00d5\u00d8\u0005-\u0000"+
		"\u0000\u00d6\u00d8\u0005\u000b\u0000\u0000\u00d7\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8-\u0001\u0000\u0000\u0000\u00d9\u00da\u00030\u0018\u0000\u00da"+
		"\u00db\u00057\u0000\u0000\u00db\u00dc\u00030\u0018\u0000\u00dc\u00f2\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u00030\u0018\u0000\u00de\u00df\u00052\u0000"+
		"\u0000\u00df\u00e0\u00030\u0018\u0000\u00e0\u00f2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u00030\u0018\u0000\u00e2\u00e3\u00054\u0000\u0000\u00e3\u00e4"+
		"\u00030\u0018\u0000\u00e4\u00f2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003"+
		"0\u0018\u0000\u00e6\u00e7\u00053\u0000\u0000\u00e7\u00e8\u00030\u0018"+
		"\u0000\u00e8\u00f2\u0001\u0000\u0000\u0000\u00e9\u00ea\u00030\u0018\u0000"+
		"\u00ea\u00eb\u00055\u0000\u0000\u00eb\u00ec\u00030\u0018\u0000\u00ec\u00f2"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u00030\u0018\u0000\u00ee\u00ef\u0005"+
		"6\u0000\u0000\u00ef\u00f0\u00030\u0018\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00d9\u0001\u0000\u0000\u0000\u00f1\u00dd\u0001\u0000\u0000"+
		"\u0000\u00f1\u00e1\u0001\u0000\u0000\u0000\u00f1\u00e5\u0001\u0000\u0000"+
		"\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f2/\u0001\u0000\u0000\u0000\u00f3\u00f4\u00034\u001a\u0000\u00f4"+
		"\u00f5\u00032\u0019\u0000\u00f51\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		".\u0000\u0000\u00f7\u00f8\u00034\u001a\u0000\u00f8\u00f9\u00032\u0019"+
		"\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0103\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005/\u0000\u0000\u00fd\u00fe\u00034\u001a\u0000\u00fe"+
		"\u00ff\u00032\u0019\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fc"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u01033\u0001\u0000\u0000\u0000\u0104\u0105\u0003"+
		"8\u001c\u0000\u0105\u0106\u00036\u001b\u0000\u01065\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u00050\u0000\u0000\u0108\u0109\u00038\u001c\u0000\u0109"+
		"\u010a\u00036\u001b\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0107"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0114"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u00051\u0000\u0000\u010e\u010f\u0003"+
		"8\u001c\u0000\u010f\u0110\u00036\u001b\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010b\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u01147\u0001\u0000\u0000\u0000"+
		"\u0115\u011c\u0005?\u0000\u0000\u0116\u011c\u0005A\u0000\u0000\u0117\u0118"+
		"\u0005=\u0000\u0000\u0118\u0119\u00030\u0018\u0000\u0119\u011a\u0005>"+
		"\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0115\u0001\u0000"+
		"\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000"+
		"\u0000\u0000\u011c9\u0001\u0000\u0000\u0000\u0014IQ^gnvz\u00b3\u00ba\u00c3"+
		"\u00cc\u00d7\u00f1\u00fa\u0100\u0102\u010b\u0111\u0113\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}