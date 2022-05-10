package AbstractFactory;

public abstract class Slime extends Enemy {
	public Slime(int health, int attack, int defense) {
		super(health, attack, defense);
	}
	public abstract void jumpAttack();
}
