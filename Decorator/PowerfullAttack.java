package Decorator;

public class PowerfullAttack extends AttackDecorator {
	
	public PowerfullAttack(Attack attack) {
		super(attack);
	}

	public String getAttackType() {
		return getAttack().getAttackType() + " poderosa(s)";
	}

}
