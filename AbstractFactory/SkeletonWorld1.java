package AbstractFactory;

public class SkeletonWorld1 extends Skeleton{
	
	SkeletonWorld1(){
		super(0,0,0);
	}
	
	public void flameArrow() {

	}

	public void specialAttack() {
		flameArrow();
	}
}
