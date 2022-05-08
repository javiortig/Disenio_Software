package AbstractFactory;

public class SlimeWorld4 implements Slime {
	int health = 0;
	int attack = 0;
	
	public boolean isAlive() {
		if(health > 0) return true;
		else return false;
	}
}
