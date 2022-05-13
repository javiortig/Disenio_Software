package Singleton;

public class Singleton {

	private Singleton() {
	}
	
	public static int calculadora(int da�o, float defensa, boolean defendiendo) {
		if(defendiendo == true) {
			return (int)((float)da�o*(1-defensa));
		} 
		return (da�o);
	}

}
