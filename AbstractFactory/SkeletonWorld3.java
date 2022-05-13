package AbstractFactory;

import State.StateType;

public class SkeletonWorld3 extends Skeleton{
	
	SkeletonWorld3(){
		super(20,4,0.6f);
	}
	
	public StateType elementArrow() {
		return StateType.FROZEN;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Flecha Helada");
		return elementArrow();
	}
}