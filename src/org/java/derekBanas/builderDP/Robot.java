package org.java.derekBanas.builderDP;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArm;
	private String robotLeg;
	
	@Override
	public void setRobotHead(String head) {
		robotHead = head;
		
	}
	
	public String getRobotHead(){
		return robotHead;
	}
	
	@Override
	public void setRobotTorso(String torso) {
		
		robotTorso = torso;
	}
	
	public String getRobotTorso(){
		return robotTorso;
	}
	
	@Override
	public void setRobotArms(String arms) {
		robotArm = arms;
		
	}
	
	public String getRobotArms(){
		return robotArm;
	}
	
	@Override
	public void setRobotLegs(String legs) {
		
		robotLeg = legs;
		
	}
	
	public String getRobotLegs(){
		return robotLeg;
	}
	
}
