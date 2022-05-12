package AbstractFactory;

import State.StateType;

public class SlimeWorld2 extends Slime {
	
	SlimeWorld2(){
		super(0,0,0);
	}

	public StateType jumpAttack() {
		return StateType.CONFUSED;
	}

	public StateType specialAttack() {
		return jumpAttack();
	}
}
