package AbstractFactory;

import State.StateType;

public class SkeletonWorld4 extends Skeleton{
	
	SkeletonWorld4(){
		super(0,0,0);
	}
	
	public StateType elementArrow() {
		return StateType.CONFUSED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Flecha Confusa");
		return elementArrow();
	}
}