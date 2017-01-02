// Generated from TuringMachine.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TuringMachineParser}.
 */
public interface TuringMachineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 */
	void enterMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 */
	void exitMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TuringMachineParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TuringMachineParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#inputAlphabet}.
	 * @param ctx the parse tree
	 */
	void enterInputAlphabet(TuringMachineParser.InputAlphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#inputAlphabet}.
	 * @param ctx the parse tree
	 */
	void exitInputAlphabet(TuringMachineParser.InputAlphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#tapeAlphabet}.
	 * @param ctx the parse tree
	 */
	void enterTapeAlphabet(TuringMachineParser.TapeAlphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#tapeAlphabet}.
	 * @param ctx the parse tree
	 */
	void exitTapeAlphabet(TuringMachineParser.TapeAlphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TuringMachineParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TuringMachineParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(TuringMachineParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(TuringMachineParser.InitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#accept}.
	 * @param ctx the parse tree
	 */
	void enterAccept(TuringMachineParser.AcceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#accept}.
	 * @param ctx the parse tree
	 */
	void exitAccept(TuringMachineParser.AcceptContext ctx);
}