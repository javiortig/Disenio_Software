package AbstractFactory;

import State.StateType;

public class SkeletonWorld1 extends Skeleton{
	
	SkeletonWorld1(){
		super(20,4,0.4f);
	}
	
	public StateType elementArrow() {
		return StateType.BURNED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Flecha Llameante");
		return elementArrow();
	}
}
