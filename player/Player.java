package player;
import State.*;

public class Player
{
	private int attack;
	private int health;
	private int vida_total;
	private float defensa;
	private State state;
	private StateType stateType;
	private int cooldown;
	private boolean esquivar;
	private boolean defensa_bool;
	
	public Player(int vida,int ataque,float defensa)
	{
		health=vida;
		vida_total=vida;
		attack=ataque;
		cooldown=0;
		esquivar=false;
		while(defensa>=1) {
			defensa=defensa/10;
		}
		this.defensa=defensa;
		setState(new HealthyState(this));
	}
	
	private void setState(State state)
	{
		this.state = state;
	}
	
	public void setState(StateType state)
	{
		stateType=state;
		switch(state)
		{
		case HEALTHY:
			setState(new HealthyState(this));
			break;
		case BURNED:
			setState(new BurnedState(this));
			break;
		case POISONED:
			setState(new PoisonedState(this));
			break;
		case PARALYZED:
			setState(new ParalyzedState(this));
			break;
		case FROZEN:
			setState(new FrozenState(this));
			break;
		case ASLEEP:
			setState(new AsleepState(this));
			break;
		case CONFUSED:
			setState(new ConfusedState(this));
			break;
		}
	}
	
	public void setNextState()
	{
		stateType=StateType.HEALTHY;
		this.state = state.nextState();
	}
	
	public int attack()
	{
		defensa_bool=false;
		esquivar=false;
		restar_cooldown();
		if(state.attack()==StateResult.NORMAL) {
			return attack;
		}else if(state.attack()==StateResult.SELF) {
			takeDamage(attack/2);
		}else {
			System.out.println("No has podido realizar el movimiento");
		}
		return 0;
	}
	public void defender()
	{
		defensa_bool=false;
		if(state.attack()==StateResult.NORMAL) {
			defensa_bool=true;
		}else if(state.attack()==StateResult.SELF) {
			takeDamage(attack/2);
		}else {
			System.out.println("No has podido realizar el movimiento");
		}
		esquivar=false;
		restar_cooldown();
	}
	public void curar()
	{
		if(state.attack()==StateResult.NORMAL) {
			if(cooldown<=0) {
				if(health>vida_total/2) {
					health=vida_total;
				}else {
					health+=vida_total/2;
				}
				cooldown=3;
			}else {
				System.out.println("El player no ha podido curarse porque esta recuperandose de usar la habilidad");
			}
		}else if(state.attack()==StateResult.SELF) {
			takeDamage(attack/2);
		}else {
			System.out.println("No has podido realizar el movimiento");
		}
		defensa_bool=false;
		esquivar=false;
	}
	public void esquivar()
	{
		esquivar=false;
		if(state.attack()==StateResult.NORMAL) {
			int rand=(int)Math.random()*100;
			if(rand<15) {
				esquivar=true;
			}
		}else if(state.attack()==StateResult.SELF) {
			takeDamage(attack/2);
		}else {
			System.out.println("No has podido realizar el movimiento");
		}
		defensa_bool=false;
		restar_cooldown();
	}
	
	public void takeDamage(int dano)
	{
		health-=dano;
	}
	
	public boolean isAlive()
	{
		if(health>0) {
			return true;
		}return false;
	}
	private void restar_cooldown() {
		if(cooldown>0) {
			cooldown--;
		}
	}
	public int getAtaque()
	{
		return attack;
	}
	public float getDefensa()
	{
		return defensa;
	}
	public boolean getDefensaBool()
	{
		return defensa_bool;
	}
	public int getHealth()
	{
		return health;
	}
	public int getVidaTotal()
	{
		return vida_total;
	}
	public boolean getEsquivar()
	{
		return esquivar;
	}

	public void imprimir()
	{
		System.out.println("Jugador:\tVida: "+health+"\tCooldown habilidad: "+cooldown+"\tEstado: "+stateType);
	}
	
	public void finalTurno()
	{
		state.endTurn();
	}
}
