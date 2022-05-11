package AbstractFactory;

public class EnemiesWorld1Hell extends EnemyFactory {

	public Slime createSlime() {
		return new SlimeWorld1();
	}

	public Skeleton createSkeleton() {
		return new SkeletonWorld1();
	}

	public Zombie createZombie() {
		return new ZombieWorld1();
	}

}
