package org.java.derekBanas.OOP;

public class Girafee extends Creature {

	
	@Override
	public void setname(String newName) {
		name = newName;

	}

	@Override
	public String getname() {
		return this.name;
	}

	@Override
	public void setweight(int newWeight) {
		if(newWeight>0){
			this.weight = newWeight;
		}
		else{
			System.out.println("Weight must be greater than 0");
		}

	}

	@Override
	public int getWeight() {
		return this.weight;
	}

}
