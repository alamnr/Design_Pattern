package org.java.derekBanas.singletonDP;

public class SingletonTest {
	
	
	public static void main(String[] args){
		/*Singleton singleton = Singleton.getInstance();
		
		Singleton singleton_1 = Singleton.getInstance();
		
		System.out.println("s-1: "+ singleton_1.toString());
		System.out.println("s-1: "+ singleton.toString());
		
		System.out.println(singleton==singleton_1);*/
		
		Runnable getSingleInstance1 = new ThreadObj();
		Runnable getSingleInstance2 = new ThreadObj();
		
		new Thread(getSingleInstance1).start();
		new Thread(getSingleInstance2).start();
	}
	

}

