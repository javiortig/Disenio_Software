package AbstractFactory;

import EntityStrategies.AggressiveStrategy;
import State.*;

public abstract class Slime extends Enemy {
	public Slime(int health, int attack, float defense) {
		super(health, attack, defense);
		this.strategy = new AggressiveStrategy();
	}
	public abstract StateType jumpAttack();
}
