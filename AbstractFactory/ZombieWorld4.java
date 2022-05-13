package AbstractFactory;

import State.StateType;

public class ZombieWorld4 extends Zombie {
	
	ZombieWorld4(){
		super(0,0,0);
	}

	public StateType heavyBite() {
		return StateType.PARALYZED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Mordisco Paralizante");
		return heavyBite();
	}
}
