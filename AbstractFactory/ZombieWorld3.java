package AbstractFactory;

import State.StateType;

public class ZombieWorld3 extends Zombie {
	
	ZombieWorld3(){
		super(0,0,0);
	}

	public StateType heavyBite() {
		return StateType.FROZEN;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Mordisco Helado");
		return heavyBite();
	}
}