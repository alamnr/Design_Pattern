package org.java.derekBanas.prototypeDP;

public class Sheep implements Animal {

	public Sheep(){
		
		System.out.println("Sheep is made");
	}
	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Clone Sheep is being Made");
		
		Sheep sheepObjDeepClone = null;
		
		try {
			sheepObjDeepClone = (Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return sheepObjDeepClone;
	}
	
	public String toString(){
		return "Dolly is my Hero, Baaaa";
	}

}
