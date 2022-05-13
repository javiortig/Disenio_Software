package State;

import player.*;

public class PoisonedState extends State
{
	private double multiplier = 0.05;
	public final static StateType state = StateType.POISONED;
	
	public PoisonedState(Player player)
	{
		super(player, 5);
		
		print(PoisonedState.state);
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
		System.out.println("El veneno debilita el cuerpo de Player.");
		player.takeDamage((int)Math.round(player.getHealth() * multiplier));
		
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
