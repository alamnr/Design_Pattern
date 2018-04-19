package org.java.derekBanas.observerDP;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private List<Observer> observers;
	private double ibmPrice,applPrice,googPrice;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int index = observers.indexOf(deleteObserver);
		System.out.println("Observer "+(index+1) + " deleted");
		observers.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer: observers){
			observer.updatePrice(ibmPrice, applPrice, googPrice);
		}
		
	}
	
	public void setIBMPrice(double newIBMPrice){
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}
	public void setApplPrice(double newApplPrice){
		this.applPrice = newApplPrice;
		notifyObserver();
	}
	public void setGoogPrice(double newGoogPrice){
		this.googPrice = newGoogPrice;
		notifyObserver();
	}
}
