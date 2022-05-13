package AbstractFactory;

import EntityStrategies.DefensiveStrategy;
import State.*;

public abstract class Zombie extends Enemy {
	public Zombie(int health, int attack, float defense) {
		super(health, attack, defense);
		this.strategy = new DefensiveStrategy();
	}
	public abstract StateType heavyBite();
}
