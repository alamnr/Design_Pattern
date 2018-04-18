package org.java.derekBanas.OOP;

abstract public class Creature {
	
	protected String name;
	protected int weight;
	protected String sound;
	
	public abstract void setname(String newName);
	public abstract String getname();
	
	public abstract void setweight(int newWeight);
	public abstract int getWeight();

}
