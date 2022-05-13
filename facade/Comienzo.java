package facade;

public class Comienzo {

	public static void main(String[] args) {
		
		IGameController gameController=new GameController();
		gameController.jugar();
		
	}
	
}
