package org.java.derekBanas.prototypeDP;

public class CloneFactory {
	
	public Animal getClone(Animal animalSample){
		return animalSample.makeCopy();
	}

}
