package AbstractFactory;

import State.StateType;

public class ZombieWorld3 extends Zombie {
	
	ZombieWorld3(){
		super(45,4,0.7f);
	}

	public StateType heavyBite() {
		return StateType.FROZEN;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Mordisco Helado");
		return heavyBite();
	}
}