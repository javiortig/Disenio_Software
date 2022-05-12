package Singleton;

public class Singleton {
	
	private static Singleton singleton;
	
	// El constructor es privado, así no permite que se genere un constructor por defecto
	private Singleton(Player jugador, Enemy enemigo) {
		// Aquí simplemente realizamos la evaluación de los daños
	}
	
	public static Singleton getSingletonInstance(Player jugador, Enemy enemigo) {
		if(singleton == null) {
			singleton = new Singleton(jugador, enemigo);
		} else {
			System.out.println("No se puede crear el objeto porque ya exite un objeto de la clase Singleton.");
		}
		return singleton;
	}
	
	// Métodos getters y setters


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
