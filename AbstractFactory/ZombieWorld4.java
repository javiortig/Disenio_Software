package AbstractFactory;

import State.StateType;

public class ZombieWorld4 extends Zombie {
	
	ZombieWorld4(){
		super(0,0,0);
	}

	public StateType heavyBite() {
		return StateType.POISONED;
	}

	public StateType specialAttack() {
		return heavyBite();
	}
}
