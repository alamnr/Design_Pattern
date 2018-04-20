package org.java.derekBanas.prototypeDP;

public class TestClonning {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep();
		
		Sheep deepClonedSheep = (Sheep)new CloneFactory().getClone(sheep);
		
		
		System.out.println(" Sheep Hashcode - "+ System.identityHashCode(sheep));
		System.out.println(" Sheep clone Hashcode - " + System.identityHashCode(deepClonedSheep));

	}

}
