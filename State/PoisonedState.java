package State;
public class PoisonedState extends State
{
	private double multiplier = 0.05;
	public final static States state = States.POISONED;
	
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
	public void attack(Enemy enemy)
	{
		enemy.takeDamage(player.getAttack());
		player.takeDamage((int)Math.round(player.getHealth() * multiplier));
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
