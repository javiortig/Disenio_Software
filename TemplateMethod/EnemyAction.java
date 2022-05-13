package TemplateMethod;
import java.util.*;

public abstract class EnemyAction {
	protected int atackProbability;
	protected int defendProbability;
	protected int dodgeProbability;
	
	public final Action getEnemyAction() {
		Action enemyAction = Action.SPECIAL_ATACK;
		Random r = new Random();
		int random = r.nextInt(100);
		int p = atackProbability;
		if(random < p) {
			enemyAction = Action.ATACK;
		}
		p += defendProbability;
		if(random < p) {
			enemyAction = Action.DEFEND; 
		}
		p += dodgeProbability;
		if(random < p) {
			enemyAction = Action.DODGE; 
		}
		return enemyAction;
	}
	
	public abstract void setProbabitys();
}
