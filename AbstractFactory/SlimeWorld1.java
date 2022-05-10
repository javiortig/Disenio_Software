package AbstractFactory;

public class SlimeWorld1 extends Slime {
	
	SlimeWorld1(){
		super(0,0,0);
	}

	public void jumpAttack() {
		
	}

	public void specialAttack() {
		jumpAttack();
	}
}
