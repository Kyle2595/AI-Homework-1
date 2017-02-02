import java.util.List;

public class StateClass implements State {
	
	@Override
	public boolean equals(Object s)
	{
		if(s == StateSearcher.getGoalState())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public List<String> actions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State successor(String action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double stepCost(String action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double estimatedDistance(State s) {
		// TODO Auto-generated method stub
		return null;
	}

}
