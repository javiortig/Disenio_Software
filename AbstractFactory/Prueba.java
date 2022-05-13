package AbstractFactory;

public class Prueba {
	public static void main(String argv[]) {
		EnemyFactory fabrica1 = new EnemiesWorld1Hell();
		Enemy esqueleto = fabrica1.createSkeleton();
		esqueleto.attack();
	}
}
