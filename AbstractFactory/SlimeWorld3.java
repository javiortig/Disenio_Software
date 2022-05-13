package AbstractFactory;

import State.StateType;

public class SlimeWorld3 extends Slime {
	
	SlimeWorld3(){
		super(22,7,0.5f);
	}

	public StateType jumpAttack() {
		return StateType.ASLEEP;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Salto Celestial");
		return jumpAttack();
	}
}

