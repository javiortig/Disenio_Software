package AbstractFactory;

import java.util.Random;

public abstract class EnemyFactory {
	public abstract Slime createSlime();
	public abstract Skeleton createSkeleton();
	public abstract Zombie createZombie();
	public final Enemy randomEnemy() {
		Random rand = new Random();
		int enemyType = rand.nextInt(2);
		if(enemyType == 0)
			return createSlime();
		else if(enemyType == 1)
			return createSkeleton();
		else
			return createZombie();
	}
}
