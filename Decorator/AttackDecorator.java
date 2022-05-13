package Decorator;

public class AttackDecorator implements Attack {
	
	private Attack attack;
	
	public AttackDecorator(Attack attack) {
		this.attack = attack;
	}
	
	public Attack getAttack() {
		return attack;
	}
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public String getAttackType() {
		return attack.getAttackType();
	}

}
