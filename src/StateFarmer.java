import java.util.List;

public class StateFarmer implements State {
	
	private String[] _bank1 = new String[3];
	private String[] _bank2 = new String[3];
	
	public StateFarmer(String[] a, String[] b)
	{
		setBank1(a);
		setBank2(b);
	}
	
	public String[] getBank1() 
	{
		return _bank1;
	}

	public void setBank1(String _bank1[]) 
	{
		this._bank1 = _bank1;
	}

	public String[] getBank2() 
	{
		return _bank2;
	}

	public void setBank2(String _bank2[]) 
	{
		this._bank2 = _bank2;
	}

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
