import java.util.LinkedList;

/* this should work as is as long as you define the appropriate class that 
 * implements State, and write something like SearchProgramExample to drive it.
 * it is important that your class that implements State include an equals(Object) method 
 * that will work for that class, as that will be the test used in StateSearcher to 
 * avoid repeated states.
 * 
 * note that findOneSolution returns a SearchNode, the one with the goal state,
 * so you should add some code to your SearchProgram to display the solution
 */
public class StateSearcher {
	private State _goalState;
	private LinkedList<SearchNode> _fringe;

	public StateSearcher(State initial, State goal){
		_fringe = new LinkedList<SearchNode>();
		_fringe.add(new SearchNode(initial,null,"start",0.0));
		_goalState = goal;
	}

	public SearchNode findOneSolution() {
		SearchNode toExpand;
		State currentState;
		State tempState;
		// loop until find goal or run out of nodes to search from
		while (true) { 
			if (_fringe.isEmpty())
				return null;
			else {
				toExpand = _fringe.remove(); 
				currentState = toExpand.getState();
				if (isGoal(toExpand))
					return toExpand;
				else {
					for (String s: toExpand.getState().actions()) {
						tempState = currentState.successor(s);
						if (! inPath(tempState,toExpand))
							_fringe.addFirst(new SearchNode(tempState,
									toExpand,
									s,
									currentState.stepCost(s)+toExpand.getPathCost())); 
					}
				}
			}
		}
	}

	private boolean isGoal(SearchNode node) {
		return node.getState().equals(_goalState);
	}

	private boolean inPath(State s, SearchNode node) {
		boolean retVal = s.equals(node.getState());
		if (retVal || node.getParent()==null)
			return retVal;
		else 
			return inPath(s, node.getParent());
	}

}

