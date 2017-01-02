import java.util.ArrayList;
import java.util.List;

/**
 * Author: Erik Strinnholm
 * The class has the task to keep track how the TuringMachine is defined and
 * what its current configuration is.
 */
public class TuringMachine {
    public List<String> states;
    public List<transition> transitions;
    public List<String> inputAlphabet;
    public List<String> tapeAlphabet;
    public List<String> acceptStates;
    public String initialState;
    public String currentState;
    public int currentPosition;
    public char currentSymbol;
    public char blank;
    public char leftmostSymbol;
    public String tape;


    /**
     * Nested Transition-Class
     * Keeps track of the info how a transition should be made.
     */
    public class transition{
        private String readState;
        private char readSymbol;
        private String transitionState;
        private char writeSymbol;
        private char direction;

        /**
         * Constructor
         * @param a,b,c,d,e Strings and chars
         */
        public transition(String a, char b, String c, char d, char e){
            readState = a;
            readSymbol = b;
            transitionState = c;
            writeSymbol = d;
            direction = e;
        }

        /**
         * Checks if the transition is valid.
         * @return boolean
         */
        public boolean isTransitionOkay(){
            if(readState.equals(transitionState)
                    && (readSymbol == writeSymbol)
                    && (direction!='L' && direction!='R')){
                return false;
            }else{
                return true;
            }
        }
    }


    /**
     * Default Constructor
     */
    public TuringMachine(){
        states = new ArrayList<>();
        transitions = new ArrayList<>();
        inputAlphabet = new ArrayList<>();
        tapeAlphabet = new ArrayList<>();
        acceptStates = new ArrayList<>();
    }


    /**
     * Updates the tape-string with the given input-string.
     * @param input
     */
    public void setInput( String input){
        tape = "" + leftmostSymbol;
        for(char inputChar : input.toCharArray()){
            tape += inputChar;
        }
        currentPosition = 1;
        currentSymbol = tape.charAt(1);
        currentState = initialState;
    }


    /**
     * When called:
     * Sees if any transition matches the currentState and currentSymbol.
     * If the transition is okay, the method will update the current information
     * and move the reader-head according to the information given from the
     * transition.
     * @return true/false - if the transition could be made.
     */
    //Reads the current-symbol from the current-state and sees if an update is required.
    public boolean step(){
        boolean madeTransition = false;

        //Going through each of the saved transitions.
        for(transition i : transitions){
            if(currentState.equals(i.readState) && currentSymbol==i.readSymbol){

                if(i.isTransitionOkay()){
                    currentState = i.transitionState;
                    StringBuilder mutableTape = new StringBuilder(tape);
                    mutableTape.setCharAt(currentPosition, i.writeSymbol);
                    tape = mutableTape.toString();

                    //If the read-head is given the info to move to the right.
                    if(i.direction == 'R'){
                        if(currentPosition == tape.toCharArray().length-1){
                            tape += blank;
                        }
                        currentPosition++;
                        currentSymbol = tape.toCharArray()[currentPosition];
                    }
                    //If the read-head is given the info to move to the left.
                    else if(i.direction == 'L'){
                        if(currentPosition == tape.toCharArray()[0]){
                            System.err.println("Out of bounds, cannot move reader to the left from firstSign");
                            break;
                        }else{
                            currentPosition--;
                            currentSymbol = tape.toCharArray()[currentPosition];
                        }
                    }
                    madeTransition = true;
                }
                break;
            }
        }
        return madeTransition;
    }


    /**
     * Checks if the current configuration is correct.
     * @return boolean
     */
    public boolean isAcceptingConfiguration(){
        for(String acceptState : acceptStates){
            if(currentState.equals(acceptState)){
                return true;
            }
        }
        return false;
    }


    /**
     * Prints the current configuration.
     */
    public void printConfiguration(){
        System.out.println("State: " + currentState);
        for(char tapeChar : tape.toCharArray()){
            System.out.print(tapeChar);
        }
        System.out.println("");
        for(int i=0; i<currentPosition; i++){
            System.out.print(" ");
        }
        System.out.println('^');
    }
}