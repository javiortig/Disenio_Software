package State;
public class HealthyState extends State
{
	public final static States state = States.HEALTHY;
	
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
	public void attack(Enemy enemy)
	{
		enemy.takeDamage(player.getAttack());
	}
}
