package AbstractFactory;

import State.StateType;

public class SlimeWorld1 extends Slime {
	
	SlimeWorld1(){
		super(12,7,0.3f);
	}

	public StateType jumpAttack() {
		return StateType.BURNED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Salto Llameante");
		return jumpAttack();
	}
}
