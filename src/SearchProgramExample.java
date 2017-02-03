
public class SearchProgramExample {

	/**
	 * Your search program can look like this
	 * rather than having initialState and goalState, you will have instances of 
	 * the actual type of State you are using
	 * also the thing you print is a SearchNode, which may not tell you much.
	 */
	public static void main(String[] args) {
		
		String[] B1 = {"CAT", "DUCK", "GRAIN"};
		String[] B2 = {null, null, null};
		State initialState = new StateFarmer(B1, B2);
		State goalState =  new StateFarmer(B2, B1);
		StateSearcher toSearch = new StateSearcher(initialState, goalState);
		SearchNode answer = toSearch.findOneSolution();
		System.out.println(answer);
	}
}