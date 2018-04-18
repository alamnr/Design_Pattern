package org.java.derekBanas.strategyDP;

public class Animal {
	
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	public Flys flyingType;
	
	public String tryToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyingType){
		flyingType = newFlyingType;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight>0){
			this.weight = weight;
		}
		else{
			System.out.println("Weight must be greater than 0");
		}
	}
	
	public void setSound(String sound){
		this.sound=sound;
	}
	public String getSound(){
		return this.sound;
	}

}
