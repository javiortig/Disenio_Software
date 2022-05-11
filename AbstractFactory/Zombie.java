package AbstractFactory;

import EntityStrategies.DefensiveStrategy;

public abstract class Zombie extends Enemy {
	public Zombie(int health, int attack, int defense) {
		super(health, attack, defense);
		this.strategy = new DefensiveStrategy();
	}
	public abstract void heavyBite();
}
