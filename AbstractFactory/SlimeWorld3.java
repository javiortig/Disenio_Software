package AbstractFactory;

import State.StateType;

public class SlimeWorld3 extends Slime {
	
	SlimeWorld3(){
		super(0,0,0);
	}

	public StateType jumpAttack() {
		return StateType.CONFUSED;
	}

	public StateType specialAttack() {
		return jumpAttack();
	}
}

