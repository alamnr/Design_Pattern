 package org.java.derekBanas.factoryDP;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		/*EnemyShip theEnemy =null;
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption="";
		System.out.println("What type of ship ? (U/R)");
		if(userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
		}
		
		if(enemyShipOption.equals("U")){
			theEnemy = new UfoEnemyShip();
		}
		else if(enemyShipOption.equals("R")){
			theEnemy = new RocketEnemyShip();
		}*/
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy =null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship ? (U/R/B)");
		if(userInput.hasNextLine()){
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if(theEnemy!=null){
		 doStuffEnemy(theEnemy);
		}else{
			System.out.println("Enter a U, R, B next time.");
		}
		
	}

	public static void doStuffEnemy(EnemyShip enemyShip){
		
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
