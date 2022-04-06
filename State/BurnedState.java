package State;
public class BurnedState extends State
{
	private double multiplier = 0.1;
	public final static States state = States.BURNED;
	
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
