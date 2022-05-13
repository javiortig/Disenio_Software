package facade;
import java.util.Scanner;
import AbstractFactory.*;
import player.*;
import Decorator.*;
import EntityStrategies.strategyType;
import Singleton.*;
import TemplateMethod.*;

public class GameController implements IGameController {

	private int mundo_int;
	private int n_enemy;
	private int turnos;
	private EnemyFactory mundo;
	private AttackDecorator decorador;
	private Attack ataque;
	private Enemy enemigo;
	private EnemyAction enemyAction;
	private int tipo_enemigo;
	private Player jugador;
	private int puntos;
	private int enemigos_matados;
	
	GameController(){
		mundo_int=0;
		n_enemy=0;
		puntos=0;
		enemigos_matados=0;
		tipo_enemigo=0;
		turnos=1;
		decorador=new AttackDecorator(new BodyAttack());
	}
	private boolean ambosVivos() {
		return (jugador.isAlive() && enemigo.isAlive());
	}
	private void comienzoBatalla(int vida,int ataque,int defensa) {
		turnos=1;
		jugador=new Player(vida,ataque,defensa);
		if(mundo_int==0) {
			mundo=new EnemiesWorld1Hell();
		}else if(mundo_int==1) {
			mundo=new EnemiesWorld2Land();
		}else if(mundo_int==2) {
			mundo=new EnemiesWorld3Heaven();
		}else{
			mundo=new EnemiesWorld4Void();
		}
		enemigo=mundo.randomEnemy();
		if(enemigo.getStrategy()==strategyType.AGGRESSIVE) {
			enemyAction=new AgresiveEnemyAction();
		}else if(enemigo.getStrategy()==strategyType.DEFENSIVE) {
			enemyAction=new DefensiveEnemyAction();
		}else if(enemigo.getStrategy()==strategyType.BALANCED) {
			enemyAction=new BalancedEnemyAction();
		}else {
			enemyAction=new PassiveEnemyAction();
		}
		if(n_enemy==3) {
			mundo_int++;
			n_enemy=0;
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Estadisticas Batalla");
		System.out.println("Jugador:\tVida "+jugador.getHealth()+"\tAtaque "+jugador.getAtaque()+"\tDefensa "+jugador.getDefensa());
		System.out.println("Enemigo:\tVida "+enemigo.getHealth()+"\tAtaque "+enemigo.getAttack()+"\tDefensa "+enemigo.getDefense());
	}
	private void ataque_player(int num) {
		System.out.print("El player esta usando: ");
		if(num==1) {
			ataque=new SwordAttack();
			decorador.setAttack(ataque);
			System.out.println(decorador.getAttackType());
			if(jugador.getEsquivar()==false) {
				System.out.println("El enemigo a perdido "+Singleton.calculadora(jugador.attack(),enemigo.getDefense(),enemigo.getDefending())+" vida");
				enemigo.takeDamage(Singleton.calculadora(jugador.attack(),enemigo.getDefense(),enemigo.getDefending()));
			}else {
				System.out.println("El enemigo lo ha esquivado");
			}
		}else if(num==2) {
			ataque=new DefenderAttack();
			decorador.setAttack(ataque);
			System.out.println(decorador.getAttackType());
			jugador.defender();
		}else if(num==3) {
			ataque=new EsquivarAttack();
			decorador.setAttack(ataque);
			System.out.println(decorador.getAttackType());
			jugador.esquivar();
		}else {
			ataque=new CurarAttack();
			decorador.setAttack(ataque);
			System.out.println(decorador.getAttackType());
			jugador.curar();
		}
	}
	private void ataque_enemy() {
		Action aux=enemyAction.getEnemyAction();
		if(aux==Action.ATACK) {
			if(tipo_enemigo==1) {
				ataque=new BowAttack();
			}else if(tipo_enemigo==2){
				ataque=new BodyAttack();
			}else {
				ataque=new SwordAttack();
			}
			decorador.setAttack(ataque);
			if(jugador.getEsquivar()==false) {
				int dano=enemigo.attack();
				System.out.println(decorador.getAttackType());
				System.out.println("Has perdido "+Singleton.calculadora(dano,jugador.getDefensa(),jugador.getDefensaBool())+" vida");
				jugador.takeDamage(Singleton.calculadora(dano,jugador.getDefensa(),jugador.getDefensaBool()));				
			}else {
				enemigo.attack();
				System.out.println(decorador.getAttackType());
				System.out.println("Has esquivado el ataque");
			}
		}else if(aux==Action.DEFEND) {
			enemigo.defend();
		}else if(aux==Action.DODGE) {
			enemigo.dodge();
		}else {
			if(jugador.getEsquivar()==false) {
				jugador.setState(enemigo.specialAttack());
			}else {
				System.out.println("Has esquivado el ataque especial");
			}
		}
	}
	private void final_turno() {
		turnos++;
		jugador.finalTurno();
	}
	private void imprimirPuntos() {
		System.out.println("Resultado: "+puntos+" puntos");
	}
	private void status() {
		System.out.println("-------------------------------------------------");
		jugador.imprimir();
		System.out.println("Enemigo:\tVida: "+enemigo.getHealth());
		System.out.println("-------------------------------------------------");
	}
	public void jugar() {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Vida del personaje:\tAconsejable 50");
		int vida=entrada.nextInt();
		System.out.println("Ataque del personaje:\tAconsejable 10");
		int ataque=entrada.nextInt();
		System.out.println("Defensa del personaje:\tAconsejable 6");
		int defensa=entrada.nextInt();
		boolean menu=true;
		while(menu) {
			comienzoBatalla(vida,ataque,defensa);
			while(ambosVivos()) {
				int num=0;
				System.out.println("-------------------------------------------------");
				System.out.println("Turno "+turnos);
				status();
				while(!(num>0 && num<5)) {
					System.out.println("Elegir ataque:");
					System.out.println("\t1.Atacar");
					System.out.println("\t2.Defender");
					System.out.println("\t3.Esquivar");
					System.out.println("\t4.Curar");
					num=entrada.nextInt();
				}
				ataque_player(num);
				if(ambosVivos()) {
					ataque_enemy();
					final_turno();
				}
			}
			puntos+=(int)(20*(1+((float)enemigos_matados/10)*((float)jugador.getHealth()/(float)jugador.getVidaTotal())));
			enemigos_matados++;
			if(jugador.isAlive()) {
				System.out.println("El enemigo ha sido derrotado");
				System.out.println("Quieres continuar? S/N");
				char aux='l';
				while(aux!='S' && aux!='N') {
					aux=entrada.next().charAt(0);
				}
				if(aux=='N') {
					menu=false;
				}
			}else {
				menu=false;
			}
		}
		imprimirPuntos();
		
		entrada.close();
	}
	
}
