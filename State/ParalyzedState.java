package State;

import player.*;

public class ParalyzedState extends State
{
	private double failureProbability = 0.5;
	public final static StateType state = StateType.PARALYZED;
	
	public ParalyzedState(Player player)
	{
		super(player, 3);
		
		print(ParalyzedState.state);
	}
	
	@Override
	public State nextState()
	{
		return new HealthyState(player);
	}
	
	@Override
	public StateResult attack()
	{
		double random = Math.random();
		if(random > failureProbability)
		{
			return StateResult.NORMAL;
		}
		else
		{
			System.out.println("¡Player no puede moverse!");
			return StateResult.NOTHING;
		}
	}
	
	@Override
	public void endTurn()
	{
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
