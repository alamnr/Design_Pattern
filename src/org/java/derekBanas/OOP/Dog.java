package org.java.derekBanas.OOP;

public class Dog extends Animal {
	
	public  Dog(){
		super();
		setSound("Bark");
	}
	public void move(){
		System.out.println("Dog is running");
	}
	
	public void digHole(){
		System.out.println("Dog can dig hole.");
	}
	public void changeVar(int randNum){
		randNum = 12;
		System.out.println("Rand num in method -"+randNum);
	}
	
	private void bePrivate(){
		System.out.println("In a private method");
	}
	public void accessPrivate(){
		bePrivate();
	}
}
