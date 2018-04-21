package org.java.derekBanas.adapterDP;

import java.util.Random;

public class EnemyRobot {
	
Random generator = new Random();
	
	
	public void smashWithHand() {
		int attackDamage =  generator.nextInt(7)+1;
		System.out.println("Enemy Robot Does :"+ attackDamage+" Damage by smashing with hands");
		
	}

	
	public void walkForward() {
		int movement =  generator.nextInt(5)+1;
		System.out.println("Enemy Robot Walk Forward :"+ movement+" Spaces");
		

	}

	
	public void reactToHuman(String human) {
		
		System.out.println(" Enemy Robot tramps on :"+ human);
	}
	

}
