package AbstractFactory;

import EntityStrategies.BalancedStrategy;
import State.*;

public abstract class Skeleton extends Enemy {
	public Skeleton(int health, int attack, int defense) {
		super(health, attack, defense);
		this.strategy = new BalancedStrategy();
	}
	
	public abstract StateType elementArrow();
}
