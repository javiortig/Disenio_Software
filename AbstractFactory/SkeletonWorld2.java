package AbstractFactory;

import State.StateType;

public class SkeletonWorld2 extends Skeleton{
	
	SkeletonWorld2(){
		super(0,0,0);
	}
	
	public StateType elementArrow() {
		return StateType.PARALYZED;
	}

	public StateType specialAttack() {
		System.out.println("El enemigo ha usado el ataque: Flecha Paralizante");
		return elementArrow();
	}
}