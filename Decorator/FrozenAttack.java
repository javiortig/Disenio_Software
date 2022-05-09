package Decorator;

public class FrozenAttack extends AttackDecorator {
	
	public FrozenAttack(Attack attack) {
		super(attack);
	}

	public String getAttackType() {
		return getAttack().getAttackType() + " congelada";
	}

}
