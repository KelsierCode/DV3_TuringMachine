// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringMachineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DIRECTION=12, DIGIT=13, SYMBOL=14, BLANK=15, STARTINGSYMBOL=16, 
		MARKINGSYMBOL=17, WS=18;
	public static final int
		RULE_machine = 0, RULE_state = 1, RULE_inputAlphabet = 2, RULE_tapeAlphabet = 3, 
		RULE_transition = 4, RULE_initial = 5, RULE_accept = 6;
	public static final String[] ruleNames = {
		"machine", "state", "inputAlphabet", "tapeAlphabet", "transition", "initial", 
		"accept"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'States:'", "'InputAlphabet:'", "'TapeAlphabet:'", "'InitialState:'", 
		"'AcceptStates:'", "'Transitions:'", "'Q'", "'('", "', '", "'-> '", "')'", 
		null, null, null, "'_'", "'$'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"DIRECTION", "DIGIT", "SYMBOL", "BLANK", "STARTINGSYMBOL", "MARKINGSYMBOL", 
		"WS"
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
	public String getGrammarFileName() { return "TuringMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TuringMachineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MachineContext extends ParserRuleContext {
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<InputAlphabetContext> inputAlphabet() {
			return getRuleContexts(InputAlphabetContext.class);
		}
		public InputAlphabetContext inputAlphabet(int i) {
			return getRuleContext(InputAlphabetContext.class,i);
		}
		public List<TapeAlphabetContext> tapeAlphabet() {
			return getRuleContexts(TapeAlphabetContext.class);
		}
		public TapeAlphabetContext tapeAlphabet(int i) {
			return getRuleContext(TapeAlphabetContext.class,i);
		}
		public List<AcceptContext> accept() {
			return getRuleContexts(AcceptContext.class);
		}
		public AcceptContext accept(int i) {
			return getRuleContext(AcceptContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public MachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterMachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitMachine(this);
		}
	}

	public final MachineContext machine() throws RecognitionException {
		MachineContext _localctx = new MachineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_machine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				state();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(20);
			match(T__1);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				inputAlphabet();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT || _la==SYMBOL );
			setState(26);
			match(T__2);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				tapeAlphabet();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SYMBOL) | (1L << BLANK) | (1L << STARTINGSYMBOL) | (1L << MARKINGSYMBOL))) != 0) );
			setState(32);
			match(T__3);
			setState(33);
			initial();
			setState(34);
			match(T__4);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				accept();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(40);
			match(T__5);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				transition();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(TuringMachineParser.DIGIT, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__6);
			setState(47);
			match(DIGIT);
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

	public static class InputAlphabetContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(TuringMachineParser.SYMBOL, 0); }
		public TerminalNode DIGIT() { return getToken(TuringMachineParser.DIGIT, 0); }
		public InputAlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputAlphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterInputAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitInputAlphabet(this);
		}
	}

	public final InputAlphabetContext inputAlphabet() throws RecognitionException {
		InputAlphabetContext _localctx = new InputAlphabetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputAlphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==SYMBOL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TapeAlphabetContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(TuringMachineParser.SYMBOL, 0); }
		public TerminalNode DIGIT() { return getToken(TuringMachineParser.DIGIT, 0); }
		public TerminalNode BLANK() { return getToken(TuringMachineParser.BLANK, 0); }
		public TerminalNode STARTINGSYMBOL() { return getToken(TuringMachineParser.STARTINGSYMBOL, 0); }
		public TerminalNode MARKINGSYMBOL() { return getToken(TuringMachineParser.MARKINGSYMBOL, 0); }
		public TapeAlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tapeAlphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTapeAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTapeAlphabet(this);
		}
	}

	public final TapeAlphabetContext tapeAlphabet() throws RecognitionException {
		TapeAlphabetContext _localctx = new TapeAlphabetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tapeAlphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SYMBOL) | (1L << BLANK) | (1L << STARTINGSYMBOL) | (1L << MARKINGSYMBOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TransitionContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<TapeAlphabetContext> tapeAlphabet() {
			return getRuleContexts(TapeAlphabetContext.class);
		}
		public TapeAlphabetContext tapeAlphabet(int i) {
			return getRuleContext(TapeAlphabetContext.class,i);
		}
		public TerminalNode DIRECTION() { return getToken(TuringMachineParser.DIRECTION, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__7);
			setState(54);
			state();
			setState(55);
			match(T__8);
			setState(56);
			tapeAlphabet();
			setState(57);
			match(T__9);
			setState(58);
			state();
			setState(59);
			match(T__8);
			setState(60);
			tapeAlphabet();
			setState(61);
			match(T__8);
			setState(62);
			match(DIRECTION);
			setState(63);
			match(T__10);
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

	public static class InitialContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitInitial(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			state();
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

	public static class AcceptContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public AcceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterAccept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitAccept(this);
		}
	}

	public final AcceptContext accept() throws RecognitionException {
		AcceptContext _localctx = new AcceptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accept);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			state();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3"+
		"\2\3\2\3\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\6\2-\n\2\r\2\16\2.\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\17\20\3\2\17\23E\2\20\3\2"+
		"\2\2\4\60\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\fC\3\2\2\2\16"+
		"E\3\2\2\2\20\22\7\3\2\2\21\23\5\4\3\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\30\7\4\2\2\27\31\5\6\4\2\30\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36"+
		"\7\5\2\2\35\37\5\b\5\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!\"\3\2\2\2\"#\7\6\2\2#$\5\f\7\2$&\7\7\2\2%\'\5\16\b\2&%\3\2\2\2\'(\3"+
		"\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\7\b\2\2+-\5\n\6\2,+\3\2\2\2-.\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60\61\7\t\2\2\61\62\7\17\2\2\62"+
		"\5\3\2\2\2\63\64\t\2\2\2\64\7\3\2\2\2\65\66\t\3\2\2\66\t\3\2\2\2\678\7"+
		"\n\2\289\5\4\3\29:\7\13\2\2:;\5\b\5\2;<\7\f\2\2<=\5\4\3\2=>\7\13\2\2>"+
		"?\5\b\5\2?@\7\13\2\2@A\7\16\2\2AB\7\r\2\2B\13\3\2\2\2CD\5\4\3\2D\r\3\2"+
		"\2\2EF\5\4\3\2F\17\3\2\2\2\7\24\32 (.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}