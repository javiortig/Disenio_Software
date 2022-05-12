package AbstractFactory;

import State.StateType;

public class SlimeWorld1 extends Slime {
	
	SlimeWorld1(){
		super(0,0,0);
	}

	public StateType jumpAttack() {
		return StateType.CONFUSED;
	}

	public StateType specialAttack() {
		return jumpAttack();
	}
}
