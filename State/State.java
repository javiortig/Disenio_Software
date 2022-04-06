package State;

public abstract class State
{
	protected Player player;
	protected int remainingTurns;
	
	public State(Player player, int turns)
	{
		this.player = player;
		this.remainingTurns = turns;
	}
	
	public abstract State nextState();
	public abstract void attack(Enemy enemy);
	
	protected void print(States state)
	{
		System.out.println("Player estará " + stateEnumToString(state) + " por " + remainingTurns + " turnos.");
	}
	
	private String stateEnumToString(States state)
	{
		switch(state)
		{
		case HEALTHY:
			return "sano";
		case BURNED:
			return "quemado";
		case POISONED:
			return "envenenado";
		case PARALYZED:
			return "paralizado";
		case FROZEN:
			return "congelado";
		case ASLEEP:
			return "dormido";
		case CONFUSED:
			return "confuso";
		default:
			return "ERROR";
		}
	}
}
