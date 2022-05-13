package AbstractFactory;

import EntityStrategies.Strategy;
import State.*;

import java.util.Random;

public abstract class Enemy {
	protected Strategy strategy;
	
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
		this.health -= damage;
	}
	
	public final int attack() {
		this.defending = false;
		this.dodging = false;
		return this.attack;
	}
	
	public final void defend() {
		this.dodging = false;
		this.defending = true;
	}
	
	public final void dodge() {
		this.defending = false;
		Random rand = new Random();
		if(rand.nextInt(100) < 5) {
			this.dodging = true;
		}
	}
	
	public final int getAttack() {
		return this.attack;
	}
	
	public final int getHealth() {
		return this.health;
	}
	
	public float getDefense() {
		return this.defense;
	}
	
	public boolean getDefending() {
		return this.defending;
	}
	
	public boolean getDodging() {
		return this.dodging;
	}
	
	public abstract StateType specialAttack();
}
