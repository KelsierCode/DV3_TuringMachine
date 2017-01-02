// Defining a grammar called TuringMachine
// Author Erik Strinnholm
grammar TuringMachine;
machine :
'States:'state+
'InputAlphabet:'inputAlphabet+
'TapeAlphabet:'tapeAlphabet+
'InitialState:'initial
'AcceptStates:'accept+
'Transitions:'transition+;


state           :'Q'DIGIT ;
inputAlphabet   :(SYMBOL|DIGIT) ;
tapeAlphabet    :(SYMBOL|DIGIT|BLANK|STARTINGSYMBOL|MARKINGSYMBOL) ;
transition      :'('state', 'tapeAlphabet'-> 'state', 'tapeAlphabet', 'DIRECTION')';
initial         :state;
accept          :state;
DIRECTION       :[L|R];
DIGIT           :[0-9]+;
SYMBOL          :[a-zA-Z];
BLANK           :'_';
STARTINGSYMBOL  :'$';
MARKINGSYMBOL   :'#';
WS              :[ \t\r\n] -> skip;