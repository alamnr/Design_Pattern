package org.java.derekBanas.reflectionAPI;

import org.java.derekBanas.factoryDP.EnemyShip;
import org.java.derekBanas.factoryDP.EnemyShipFactory;

public class UfoEnemyShip extends EnemyShip {
	
	
	
	private EnemyShipFactory enemyShipFactory;

	private String idCode = "100";
	private String getPrivate(){return "How do you get this";}
	private String getOtherPrivate(int thisInt, String thatString)
	{
		return " How did you get here "+ thisInt +" " + thatString;
	}
	
	public UfoEnemyShip(int number , String randString){
		System.out.println("You sent: "+ number +" " + randString);
	}
	
	public UfoEnemyShip(EnemyShipFactory enemyShipFactory){
		this.enemyShipFactory  = enemyShipFactory;
	}
	
	
}
