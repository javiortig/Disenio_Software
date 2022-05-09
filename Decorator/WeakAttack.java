package Decorator;

public class WeakAttack extends AttackDecorator {
	
	public WeakAttack(Attack attack) {
		super(attack);
	}

	public String getAttackType() {
		return getAttack().getAttackType() + " debil(es)";
	}

}
