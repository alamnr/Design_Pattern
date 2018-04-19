package org.java.derekBanas.singletonDP;

public class Singleton {
	
	private static Singleton firstInstance = null;
	static boolean firstThread = true;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(firstInstance== null){
		if (firstThread) {

			firstThread = false;

			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
			firstInstance = new Singleton();
		}
		return firstInstance;  
	}

}
