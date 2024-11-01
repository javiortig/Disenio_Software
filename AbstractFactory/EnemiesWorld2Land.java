package AbstractFactory;

public class EnemiesWorld2Land extends EnemyFactory {

	public Slime createSlime() {
		return new SlimeWorld2();
	}

	public Skeleton createSkeleton() {
		return new SkeletonWorld2();
	}

	public Zombie createZombie() {
		return new ZombieWorld2();
	}

}
