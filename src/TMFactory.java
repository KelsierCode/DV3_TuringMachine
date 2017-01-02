import java.io.InputStream;
import java.io.IOException;
import org.antlr.v4.runtime.*;


/**
 * Author: Erik Strinnholm
 * The class initiates the TuringMachine-class with the info given from the
 * antlr-generated lexer and parsers.
 */
public class TMFactory {

    public TuringMachine createMachine(InputStream in) throws IOException {
        TuringMachineLexer l = new TuringMachineLexer(new ANTLRInputStream(in));
        TuringMachineParser p = new TuringMachineParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });


        TuringMachine tm = new TuringMachine();
        TuringMachineBaseListener listener = new TuringMachineBaseListener(){

            @Override
            public void exitMachine(TuringMachineParser.MachineContext context) {
                String state;
                String characterString;


                /* States */
                for(TuringMachineParser.StateContext current : context.state()){
                    state = "Q"; //Adding the Q-character manually!
                    state += Integer.parseInt(current.DIGIT().getSymbol().getText());
                    tm.states.add(state);
                }

                /* InputAlphabet */
                for(TuringMachineParser.InputAlphabetContext current : context.inputAlphabet()){
                    if (current.SYMBOL() != null) {
                        characterString = current.SYMBOL().getSymbol().getText();
                        tm.inputAlphabet.add(characterString);

                    }else if(current.DIGIT() != null){
                        characterString = current.DIGIT().getSymbol().getText();
                        tm.inputAlphabet.add(characterString);
                    }
                }

                /* TapeAlphabet */
                for(TuringMachineParser.TapeAlphabetContext current : context.tapeAlphabet()) {
                    if (current.SYMBOL() != null) {
                        characterString = current.SYMBOL().getSymbol().getText();
                        tm.tapeAlphabet.add(characterString);

                    }else if(current.DIGIT() != null){
                        characterString = current.DIGIT().getSymbol().getText();
                        tm.tapeAlphabet.add(characterString);

                    }else if(current.BLANK() != null){
                        characterString = current.BLANK().getSymbol().getText();
                        tm.tapeAlphabet.add(characterString);
                        tm.blank = characterString.toCharArray()[0];

                    }else if(current.STARTINGSYMBOL() != null){
                        characterString = current.STARTINGSYMBOL().getSymbol().getText();
                        tm.tapeAlphabet.add(characterString);
                        tm.leftmostSymbol = characterString.toCharArray()[0];

                    }else if(current.MARKINGSYMBOL() != null){
                        characterString = current.MARKINGSYMBOL().getSymbol().getText();
                        tm.tapeAlphabet.add(characterString);
                    }

                }

                /* initialState */
                state = "Q";
                state += Integer.parseInt(context.initial().state().DIGIT().getSymbol().getText());
                tm.initialState = state;

                /* accept states */
                for(TuringMachineParser.AcceptContext current : context.accept()){
                    state = "Q";
                    state += Integer.parseInt(current.state().DIGIT().getSymbol().getText());
                    tm.acceptStates.add(state);
                }


                /* transitions */
                for(TuringMachineParser.TransitionContext current : context.transition()){
                    String readState = "Q";
                    char readSymbol = '?';
                    String transitionState = "Q";
                    char writeSymbol = '?';
                    char direction = '?';

                    //readState
                    readState += Integer.parseInt(current.state().get(0).DIGIT().getSymbol().getText());

                    //readSymbol
                    characterString = current.tapeAlphabet().get(0).getText();
                    if(characterString.length() == 1){
                        readSymbol = characterString.toCharArray()[0];
                    }else{
                        System.err.println("The format of the given transition-readSymbol is not correct!");
                    }

                    //transitionState
                    transitionState += Integer.parseInt(current.state().get(1).DIGIT().getSymbol().getText());

                    //writeSymbol
                    characterString = current.tapeAlphabet().get(1).getText();
                    if(characterString.length() == 1){
                        writeSymbol = characterString.toCharArray()[0];
                    }else{
                        System.err.println("The format of the given transition-writeSymbol is not correct!");
                    }

                    //direction
                    characterString = current.DIRECTION().getText();
                    if(characterString.length() == 1){
                        direction = characterString.toCharArray()[0];
                    }else{
                        System.err.println("The format of the given transition-direction is not correct!");
                    }

                    //Adding this info to a new transition.
                    TuringMachine.transition newTransition = new TuringMachine().new
                            transition(readState,readSymbol,transitionState,writeSymbol,direction);

                    //Adding the newly created transition to the turing machine.
                    tm.transitions.add(newTransition);
                }
            }

        };

        p.addParseListener(listener);
        p.machine();

        return tm;
    }
}