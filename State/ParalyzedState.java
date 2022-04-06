package State;
public class ParalyzedState extends State
{
	private double failureProbability = 0.5;
	public final static States state = States.PARALYZED;
	
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
