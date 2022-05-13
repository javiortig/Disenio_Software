package Singleton;

public class Singleton {

	private Singleton() {
	}
	
	public static int calculadora(int daño, float defensa, boolean defendiendo) {
		if(defendiendo == true) {
			return (int)((float)daño*(1-defensa));
		} 
		return (daño);
	}

}
