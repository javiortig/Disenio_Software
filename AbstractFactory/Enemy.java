package AbstractFactory;

import java.util.Random;

public abstract class Enemy {
	private int health;
	private int attack;
	private float defense;
	private boolean defending;
	private boolean dodging;
	
	public Enemy(int health, int attack, int defense) {
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.defending = false;
		this.dodging = false;
	}
	
	public final boolean isAlive() {
		if(health > 0) return true;
		return false;
	}
	
	public final void takeDamage(int damage) {
		if(this.defending) {
			this.health -= damage*this.defense;
			this.defending = false;
		}else if(!this.dodging){
			this.health -= damage;
		}
		this.dodging = false;
	}
	
	public final int attack() {
		return attack;
	}
	
	public final void defend() {
		this.defending = true;
	}
	
	public final void dodge() {
		Random rand = new Random();
		if(rand.nextInt(100) < 5) {
			this.dodging = true;
		}
	}
	
	public abstract void specialAttack();
}
