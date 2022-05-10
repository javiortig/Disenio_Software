package AbstractFactory;

public class ZombieWorld4 extends Zombie {
	
	ZombieWorld4(){
		super(0,0,0);
	}

	public void heavyBite() {
		
	}

	public void specialAttack() {
		heavyBite();
	}
}
