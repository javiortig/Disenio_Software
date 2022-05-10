package AbstractFactory;

public class SkeletonWorld4 extends Skeleton{
	
	SkeletonWorld4(){
		super(0,0,0);
	}
	
	public void flameArrow() {

	}

	public void specialAttack() {
		flameArrow();
	}
}