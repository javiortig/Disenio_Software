package AbstractFactory;

public class ZombieWorld1 extends Zombie {
	
	ZombieWorld1(){
		super(0,0,0);
	}

	public void heavyBite() {
		
	}

	public void specialAttack() {
		heavyBite();
	}
}
