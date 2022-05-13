package State;

import player.*;

public class HealthyState extends State
{
	public final static StateType state = StateType.HEALTHY;
	
	public HealthyState(Player player)
	{
		super(player, -1);
	}
	
	@Override
	public State nextState()
	{
		return this;
	}
	
	@Override
	public StateResult attack()
	{
		return StateResult.NORMAL;
	}
	
	@Override
	public void endTurn()
	{
		
	}
}
