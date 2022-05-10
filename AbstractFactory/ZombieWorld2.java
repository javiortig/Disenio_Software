package AbstractFactory;

public class ZombieWorld2 extends Zombie {
	
	ZombieWorld2(){
		super(0,0,0);
	}

	public void heavyBite() {
		
	}

	public void specialAttack() {
		heavyBite();
	}
}