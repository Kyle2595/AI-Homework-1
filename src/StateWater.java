import java.util.Arrays;
import java.util.List;

public class StateWater implements State {

	// If boolean == true, then jug is full
	public static boolean _jug1;
	public static boolean _jug2;
	public static boolean _tub;

	public static boolean getJug1() 
	{
		return _jug1;
	}

	public static boolean getJug2() 
	{
		return _jug2;
	}

	public static boolean getTub() 
	{
		return _tub;
	}

	public StateWater(boolean j1, boolean j2, boolean t1)
	{
		_jug1 = j1;
		_jug2 = j2;
		_tub = t1;
	}

	public StateWater(boolean t1)
	{
		_tub = t1;
	}

	@Override
	public List<String> actions() {
		List<String> actionList = Arrays.asList(
				"Empty JUG1",
				"Empty JUG2",
				"Fill JUG1",
				"Fill JUG2",
				"JUG1 to JUG2",
				"JUG2 to JUG1");
		return actionList;
	}

	@Override
	public boolean equals(Object s)
	{		
		// For debugging
//		System.out.println("Jug 1 = " + _jug1);
//		System.out.println("Jug 2 = " + _jug2);
//		System.out.println("Tub = " + _tub);
//		System.out.println();

		// Checks to see if the goalState (in this case s) is equal to the currentState
		if(s instanceof StateWater)
		{
			return getTub();
		}
		else
		{
			return false;
		}
	}

	@Override
	public State successor(String action) 
	{
		boolean J1 = _jug1;
		boolean J2 = _jug2;
		boolean T1 = _tub;
		StateWater nextState = new StateWater(J1, J2, T1);

		if(action == "Empty JUG1")
		{
			_jug1 = false;
		}

		if(action == "Empty JUG2")
		{
			_jug2 = false;
		}

		if(action == "Fill JUG1")
		{
			_jug1 = true;
		}

		if(action == "Empty JUG2")
		{
			_jug2 = true;
		}

		if(action == "JUG1 to JUG2")
		{
			_jug1 = false;
			_jug2 = true;
		}

		if(action == "JUG2 to JUG1")
		{
			_jug2 = false;
			_jug1 = true;
		}
		return nextState;
	}

	@Override
	public Double stepCost(String action) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double estimatedDistance(State s) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
