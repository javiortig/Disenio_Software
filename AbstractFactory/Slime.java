package AbstractFactory;

import EntityStrategies.AggressiveStrategy;

public abstract class Slime extends Enemy {
	public Slime(int health, int attack, int defense) {
		super(health, attack, defense);
		this.strategy = new AggressiveStrategy();
	}
	public abstract void jumpAttack();
}
