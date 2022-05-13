package AbstractFactory;

import State.StateType;

public class SkeletonWorld1 extends Skeleton{
	
	SkeletonWorld1(){
		super(0,0,0);
	}
	
	public StateType elementArrow() {
		return StateType.BURNED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Flecha Llameante");
		return elementArrow();
	}
}
