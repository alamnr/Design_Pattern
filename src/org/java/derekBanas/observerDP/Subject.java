package org.java.derekBanas.observerDP;

public interface Subject {
	
	public void register(Observer newObserver);
	public void unregister(Observer deleteObserver);
	public void notifyObserver();

}
