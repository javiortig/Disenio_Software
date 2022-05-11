package State;
import Game.Player;
public class AsleepState extends State
{
	public final static StateType state = StateType.ASLEEP;
	
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
	public StateResult attack()
	{
		System.out.println("Player está dormido. Zzz...");
		return StateResult.NOTHING;
	}
	
	@Override
	public void endTurn()
	{
		
		if (--remainingTurns <= 0)
		{
			player.setNextState();
		}
	}
}
