package AbstractFactory;

public interface EnemyFactory {
	Slime createSlime();
	Skeleton createSkeleton();
	Zombie createZombie();
}
