import java.util.Arrays;

public class SearchProgram {

	/**
	 * Your search program can look like this
	 * rather than having initialState and goalState, you will have instances of 
	 * the actual type of State you are using
	 * also the thing you print is a SearchNode, which may not tell you much.
	 */

	public static String _method;
	public static void main(String[] args) 
	{
		// How would you like to solve the problem (DFS or BFS)?
		_method = "DFS";

		// Which problem do you want to solve?

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
		State initialState = new StateWater(false, false, false);
		State goalState = new StateWater(true);
		StateSearcher toSearch = new StateSearcher(initialState, goalState);
		SearchNode answer = toSearch.findOneSolution();
		System.out.println(answer);
		System.out.println("Jug 1 = " + StateWater.getJug1());
		System.out.println("Jug 2 = " + StateWater.getJug2());
		System.out.println("Tub = " + StateWater.getTub());
	}

}