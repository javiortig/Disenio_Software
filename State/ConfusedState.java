package State;

import Game.Enemy;
import Game.Player;

public class ConfusedState extends State
{
	private double selfAttackProbability = 0.5;
	public final static StateType state = StateType.CONFUSED;
	
	public ConfusedState(Player player)
	{
		super(player, 3);
		
		print(ConfusedState.state);
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
		if(random < selfAttackProbability)
		{
			System.out.println("¡Player está tan confuso que se hirió a sí mismo!");
			return StateResult.SELF;
		}
		else
		{
			return StateResult.NORMAL;
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
