
public class SearchProgramExample {

	/**
	 * Your search program can look like this
	 * rather than having initialState and goalState, you will have instances of 
	 * the actual type of State you are using
	 * also the thing you print is a SearchNode, which may not tell you much.
	 */
	public static void main(String[] args) {
		State initialState = null;
		State goalState = null;
		StateSearcher toSearch = new StateSearcher(initialState, goalState);
		SearchNode answer = toSearch.findOneSolution();
		System.out.println(answer);
	}
}

