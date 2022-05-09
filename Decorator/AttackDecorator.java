package Decorator;

public abstract class AttackDecorator implements Attack {
	
	public Attack attack;
	
	public AttackDecorator(Attack attack) {
		this.attack = attack;
	}
	
	public Attack getAttack() {
		return attack;
	}
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}

}
