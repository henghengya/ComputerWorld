package exmaple2;

import java.util.*;

abstract class Term
{
	Primary primary;

	abstract void printParseTree(String indent);
	abstract Val Eval(HashMap<String, Val> state);
	abstract void emitInstructions();
}