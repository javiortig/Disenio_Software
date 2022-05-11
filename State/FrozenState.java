package State;

import Game.Enemy;
import Game.Player;

public class FrozenState extends State
{
	private double failureProbability = 0.75;
	public final static StateType state = StateType.FROZEN;
	
	public FrozenState(Player player)
	{
		super(player, 2);
		
		print(FrozenState.state);
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
