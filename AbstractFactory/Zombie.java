package AbstractFactory;

public abstract class Zombie extends Enemy {
	public Zombie(int health, int attack, int defense) {
		super(health, attack, defense);
	}
	public abstract void heavyBite();
}
