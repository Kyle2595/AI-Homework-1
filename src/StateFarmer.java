import java.util.Arrays;
import java.util.List;

public class StateFarmer implements State {

	public static String[] _bank1 = new String[3];
	public static String[] _bank2 = new String[3];

	public StateFarmer(String[] a, String[] b)
	{
		setBank1(a);
		setBank2(b);
	}

	public static String[] getBank1() 
	{
		return _bank1;
	}

	public void setBank1(String _bank1[]) 
	{
		this._bank1 = _bank1;
	}

	public static String[] getBank2() 
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
		System.out.println("Bank 1 = " + Arrays.toString(StateFarmer.getBank1()));
		System.out.println("Bank 2 = " + Arrays.toString(StateFarmer.getBank2()));
		
		if(this == s)
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
		List<String> actionList = Arrays.asList("Move ALONE",
				"Move CAT",
				"Move DUCK",
				"Move GRAIN");
		return actionList;
	}

	@Override
	public State successor(String action) 
	{
		String[] B1 = getBank1();
		String[] B2 = getBank2();
		StateFarmer nextState = new StateFarmer(B1, B2);
		
		if(action == "Move ALONE")
		{
			if(nextState._bank1[0] == "FARMER")
			{
				nextState._bank1[0] = null;
				nextState._bank2[0] = "FARMER";
			}
			
			if(nextState._bank2[0] == "FARMER")
			{
				nextState._bank2[0] = null;
				nextState._bank1[0] = "FARMER";
			}
		}

		if(action == "Move CAT")
		{
			if(nextState._bank1[1] == "CAT")
			{
				nextState._bank1[1] = null;
				nextState._bank2[1] = "CAT";
				
				nextState._bank1[0] = null;
				nextState._bank2[0] = "FARMER";
			}
			
			if(nextState._bank2[1] == "CAT")
			{
				nextState._bank2[1] = null;
				nextState._bank1[1] = "CAT";
				
				nextState._bank2[0] = null;
				nextState._bank1[0] = "FARMER";
			}
		}

		if(action == "Move DUCK")
		{
			if(nextState._bank1[2] == "DUCK")
			{
				nextState._bank1[2] = null;
				nextState._bank2[2] = "DUCK";
				
				nextState._bank1[0] = null;
				nextState._bank2[0] = "FARMER";
			}
			
			if(nextState._bank2[2] == "DUCK")
			{
				nextState._bank2[2] = null;
				nextState._bank1[2] = "DUCK";
				
				nextState._bank2[0] = null;
				nextState._bank1[0] = "FARMER";
			}
		}

		if(action == "Move GRAIN")
		{
			if(nextState._bank1[3] == "GRAIN")
			{
				nextState._bank1[3] = null;
				nextState._bank2[3] = "GRAIN";
				
				nextState._bank1[0] = null;
				nextState._bank2[0] = "FARMER";
			}
			
			if(nextState._bank2[3] == "GRAIN")
			{
				nextState._bank2[3] = null;
				nextState._bank1[3] = "GRAIN";
				
				nextState._bank2[0] = null;
				nextState._bank1[0] = "FARMER";
			}
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
