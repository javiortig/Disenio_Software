package AbstractFactory;

import State.StateType;

public class SlimeWorld2 extends Slime {
	
	SlimeWorld2(){
		super(17,8,0.4f);
	}

	public StateType jumpAttack() {
		return StateType.POISONED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Salto Pantanoso");
		return jumpAttack();
	}
}
