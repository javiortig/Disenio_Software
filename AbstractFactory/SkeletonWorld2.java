package AbstractFactory;

public class SkeletonWorld2 extends Skeleton{
	
	SkeletonWorld2(){
		super(0,0,0);
	}
	
	public void flameArrow() {

	}

	public void specialAttack() {
		flameArrow();
	}
}