package AbstractFactory;

public class SkeletonWorld3 extends Skeleton{
	
	SkeletonWorld3(){
		super(0,0,0);
	}
	
	public void flameArrow() {

	}

	public void specialAttack() {
		flameArrow();
	}
}