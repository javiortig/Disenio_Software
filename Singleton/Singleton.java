package Singleton;

public class Singleton {
	
	private static Singleton singleton;
	
	// El constructor es privado, así no permite que se genere un constructor por defecto
	private Singleton() {
		// Aquí simplemente realizamos la evaluación de los daños
	}
	
	public static Singleton getSingletonInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		} else {
			System.out.println("No se puede crear el objeto porque ya exite un objeto de la clase Singleton.");
		}
		return singleton;
	}
	
	// Métodos
	public int calcularDamage(int daño, int defensa, boolean defendiendo, boolean dodging) {
		if(dodging) return 0;
		else if(defendiendo) return daño*defensa;
		else return daño;
	}

	// Podemos sobrescribr el método clone, para que no se pueda clonar
	// un objeto de esta clase
	@Override
	public Singleton clone() {
		try {
			throw new CloneNotSupportedException();
		} catch(CloneNotSupportedException ex) {
			System.out.println("No se puede clonar un objeto de la clase Singleton.");
		}
		return null;
	}

}
