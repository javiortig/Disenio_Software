package AbstractFactory;

public class EnemiesWorld4Void extends EnemyFactory {

	public Slime createSlime() {
		return new SlimeWorld4();
	}

	public Skeleton createSkeleton() {
		return new SkeletonWorld4();
	}

	public Zombie createZombie() {
		return new ZombieWorld4();
	}

}
