package AbstractFactory;

import State.StateType;

public class SlimeWorld2 extends Slime {
	
	SlimeWorld2(){
		super(0,0,0);
	}

	public StateType jumpAttack() {
		return StateType.POISONED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Salto Pantanoso");
		return jumpAttack();
	}
}
