package org.java.derekBanas.singletonDP;

public class ThreadObj implements Runnable {

	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		
		System.out.println("singleton : "+ singleton.toString());
		
		
		
	}

}
