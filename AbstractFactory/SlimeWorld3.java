package AbstractFactory;

public class SlimeWorld3 extends Slime {
	
	SlimeWorld3(){
		super(0,0,0);
	}

	public void jumpAttack() {
		
	}

	public void specialAttack() {
		jumpAttack();
	}
}

