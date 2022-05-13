package AbstractFactory;

import State.StateType;

public class SlimeWorld1 extends Slime {
	
	SlimeWorld1(){
		super(0,0,0);
	}

	public StateType jumpAttack() {
		return StateType.BURNED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Salto Llameante");
		return jumpAttack();
	}
}
