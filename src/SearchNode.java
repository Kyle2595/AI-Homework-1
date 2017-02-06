
/* A fairly minimal container for Search information
 * 
 */
public class SearchNode{
	private static State _state;
	private SearchNode _parent;
	private String _action; 
	private Double _pathCost;
	
	public SearchNode(State state, SearchNode parent, String action, Double pathCost) 
	{
		_state = state;
		_parent = parent;
		_action = action;
		_pathCost = pathCost;
	}
	
	public static State getState() 
	{
		return _state;
	}
	
	public SearchNode getParent() 
	{
		return _parent;
	}
	
	public String getAction() 
	{
		return _action;
	}
	
	public Double getPathCost()
	{
		return _pathCost;
	}
		
	public String toString()
	{
		return "<"+_state+", "+ _pathCost+">";
	}
}
