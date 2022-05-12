package AbstractFactory;

import State.StateType;

public class SlimeWorld4 extends Slime {
	
	SlimeWorld4(){
		super(0,0,0);
	}

	public StateType jumpAttack() {
		return StateType.CONFUSED;
	}

	public StateType specialAttack() {
		return jumpAttack();
	}
}
