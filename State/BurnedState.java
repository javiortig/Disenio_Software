package State;

import Game.Player;

public class BurnedState extends State
{
	private double multiplier = 0.1;
	public final static StateType state = StateType.BURNED;
	
	public BurnedState(Player player)
	{
		super(player, 3);
		
		print(BurnedState.state);
	}
	
	@Override
	public State nextState()
	{
		return new HealthyState(player);
	}
	
	@Override
	public StateResult attack()
	{
		return StateResult.NORMAL;
	}
	
	@Override
	public void endTurn()
	{
		System.out.println("¡Player se está quemando!");
		player.takeDamage((int)Math.round(player.getHealth() * multiplier));
		
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
