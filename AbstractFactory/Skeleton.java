package AbstractFactory;

public abstract class Skeleton extends Enemy {
	public Skeleton(int health, int attack, int defense) {
		super(health, attack, defense);
	}
	
	public abstract void flameArrow();
}
