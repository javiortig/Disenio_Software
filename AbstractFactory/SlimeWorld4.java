package AbstractFactory;

public class SlimeWorld4 extends Slime {
	
	SlimeWorld4(){
		super(0,0,0);
	}

	public void jumpAttack() {
		
	}

	public void specialAttack() {
		jumpAttack();
	}
}
