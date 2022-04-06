package State;
public class FrozenState extends State
{
	private double failureProbability = 0.75;
	public final static States state = States.FROZEN;
	
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
	public void attack(Enemy enemy)
	{
		double random = Math.random();
		if(random > failureProbability)
		{
			enemy.takeDamage(player.getAttack());
		}
		else
		{
			System.out.println("¡Player no puede moverse!");
		}
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
