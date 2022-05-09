package Decorator;

public class FireAttack extends AttackDecorator {
	
	public FireAttack(Attack attack) {
		super(attack);
	}

	public String getAttackType() {
		return getAttack().getAttackType() + " de fuego";
	}

}
