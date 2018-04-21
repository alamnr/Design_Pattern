package org.java.derekBanas.adapterDP;

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		theRobot = newRobot;
	}
	@Override
	public void fireWeapon() {
		theRobot.smashWithHand();

	}

	@Override
	public void driveForward() {
		theRobot.walkForward();

	}

	@Override
	public void assignDriver(String driver) {
		theRobot.reactToHuman(driver);

	}

}
