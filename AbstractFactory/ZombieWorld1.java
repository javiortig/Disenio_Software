package AbstractFactory;

public class ZombieWorld1 implements Zombie {
	int health = 0;
	int attack = 0;
	
	public boolean isAlive() {
		if(health > 0) return true;
		else return false;
	}
}
