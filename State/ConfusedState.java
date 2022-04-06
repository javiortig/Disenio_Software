package State;
public class ConfusedState extends State
{
	private double selfAttackProbability = 0.5;
	public final static States state = States.CONFUSED;
	
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
	public void attack(Enemy enemy)
	{
		double random = Math.random();
		if(random < selfAttackProbability)
		{
			System.out.println("¡Player está tan confuso que se hirió a sí mismo!");
			player.takeDamage(player.getAttack());
		}
		else
		{
			enemy.takeDamage(player.getAttack());
		}
		
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
