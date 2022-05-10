package AbstractFactory;

public class SlimeWorld2 extends Slime {
	
	SlimeWorld2(){
		super(0,0,0);
	}

	public void jumpAttack() {
		
	}

	public void specialAttack() {
		jumpAttack();
	}
}
