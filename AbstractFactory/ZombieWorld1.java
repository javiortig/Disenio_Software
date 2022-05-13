package AbstractFactory;

import State.StateType;

public class ZombieWorld1 extends Zombie {
	
	ZombieWorld1(){
		super(20,4,0.6f);
	}

	public StateType heavyBite() {
		return StateType.BURNED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Zarpazo Ardiente");
		return heavyBite();
	}
}
