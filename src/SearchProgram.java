import java.util.Arrays;

public class SearchProgram {

	/**
	 * Your search program can look like this
	 * rather than having initialState and goalState, you will have instances of 
	 * the actual type of State you are using
	 * also the thing you print is a SearchNode, which may not tell you much.
	 */
	public static void main(String[] args) 
	{
		farmerProblem();
		//waterProblem();
	}

	private static void farmerProblem() 
	{
		String[] B1 = {"FARMER", "CAT", "DUCK", "GRAIN"};
		String[] B2 = {null, null, null, null};
		State initialState = new StateFarmer(B1, B2);
		State goalState =  new StateFarmer(B2, B1);
		StateSearcher toSearch = new StateSearcher(initialState, goalState);
		SearchNode answer = toSearch.findOneSolution();
		System.out.println(answer);
		System.out.println("Bank 1 = " + Arrays.toString(StateFarmer.getBank1()));
		System.out.println("Bank 2 = " + Arrays.toString(StateFarmer.getBank2()));
	}
	
	private static void waterProblem() 
	{
		
	}

}