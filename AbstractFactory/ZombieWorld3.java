package AbstractFactory;

import State.StateType;

public class ZombieWorld3 extends Zombie {
	
	ZombieWorld3(){
		super(0,0,0);
	}

	public StateType heavyBite() {
		return StateType.POISONED;
	}

	public StateType specialAttack() {
		return heavyBite();
	}
}