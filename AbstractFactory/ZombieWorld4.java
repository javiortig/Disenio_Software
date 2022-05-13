package AbstractFactory;

import State.StateType;

public class ZombieWorld4 extends Zombie {
	
	ZombieWorld4(){
		super(65,4,0.8f);
	}

	public StateType heavyBite() {
		return StateType.PARALYZED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Mordisco Paralizante");
		return heavyBite();
	}
}
