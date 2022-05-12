package AbstractFactory;

import State.StateType;

public class ZombieWorld1 extends Zombie {
	
	ZombieWorld1(){
		super(0,0,0);
	}

	public StateType heavyBite() {
		return StateType.POISONED;
	}

	public StateType specialAttack() {
		return heavyBite();
	}
}
