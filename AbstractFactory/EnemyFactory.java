package AbstractFactory;

public abstract class EnemyFactory {
	public abstract Slime createSlime();
	public abstract Skeleton createSkeleton();
	public abstract Zombie createZombie();
	public final Enemy randomEnemy() {
		
	}
}
