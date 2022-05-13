package AbstractFactory;

import State.StateType;

public class ZombieWorld1 extends Zombie {
	
	ZombieWorld1(){
		super(0,0,0);
	}

	public StateType heavyBite() {
		return StateType.BURNED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Zarpazo Ardiente");
		return heavyBite();
	}
}
