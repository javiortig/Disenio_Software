package AbstractFactory;

import State.StateType;

public class ZombieWorld2 extends Zombie {
	
	ZombieWorld2(){
		super(30,5,0.6f);
	}

	public StateType heavyBite() {
		return StateType.POISONED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Mordisco Envenenado");
		return heavyBite();
	}
}