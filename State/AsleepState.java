package State;
public class AsleepState extends State
{
	public final static States state = States.ASLEEP;
	
	public AsleepState(Player player)
	{
		super(player, 2);
		
		print(AsleepState.state);
	}
	
	@Override
	public State nextState()
	{
		return new HealthyState(player);
	}
	
	@Override
	public void attack(Enemy enemy)
	{
		System.out.println("Player está dormido.");
		if(--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
