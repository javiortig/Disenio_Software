package Decorator;

public class PoisonedAttack extends AttackDecorator {
	
	public PoisonedAttack(Attack attack) {
		super(attack);
	}

	public String getAttackType() {
		return getAttack().getAttackType() + " con veneno";
	}

}
