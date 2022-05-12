package AbstractFactory;

import State.StateType;

public class SkeletonWorld3 extends Skeleton{
	
	SkeletonWorld3(){
		super(0,0,0);
	}
	
	public StateType elementArrow() {
		return StateType.FROZEN;
	}

	public StateType specialAttack() {
		return elementArrow();
	}
}