package AbstractFactory;

public class ZombieWorld3 extends Zombie {
	
	ZombieWorld3(){
		super(0,0,0);
	}

	public void heavyBite() {
		
	}

	public void specialAttack() {
		heavyBite();
	}
}