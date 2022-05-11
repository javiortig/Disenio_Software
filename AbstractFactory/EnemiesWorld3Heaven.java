package AbstractFactory;

public class EnemiesWorld3Heaven extends EnemyFactory {

	public Slime createSlime() {
		return new SlimeWorld3();
	}

	public Skeleton createSkeleton() {
		return new SkeletonWorld3();
	}

	public Zombie createZombie() {
		return new ZombieWorld3();
	}

}
