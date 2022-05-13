package TemplateMethod;
import java.util.*;

public abstract class EnemyAction {
	protected int atackProbability;
	protected int defendProbability;
	protected int dodgeProbability;
	
	public final Action getEnemyAction() {
		setProbabilitys();
		Random r = new Random();
		int random = r.nextInt(100);
		int p = atackProbability;
		if(random < p) {
			return Action.ATACK;
		}
		p += defendProbability;
		if(random < p) {
			return Action.DEFEND; 
		}
		p += dodgeProbability;
		if(random < p) {
			return Action.DODGE; 
		}
		return Action.SPECIAL_ATACK;
	}
	
	public abstract void setProbabilitys();
}
