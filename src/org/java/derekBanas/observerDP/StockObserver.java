package org.java.derekBanas.observerDP;

public class StockObserver implements Observer {

	private double ibmPrice,aaplPrice,googPrice;
	
	private static int observerIdTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(StockGrabber newStockGrabber){
		this.stockGrabber = newStockGrabber;
		this.observerId = ++observerIdTracker;
		System.out.println("New observer " + this.observerId);
		
		stockGrabber.register(this);
	}
	
	@Override
	public void updatePrice(double ibmPrice, double applPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = applPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}
	
	public void printThePrices(){
		System.out.println(observerId + "\nIBM: "+ibmPrice+"\nAAPL: " +aaplPrice  + "\nGOOG: "+googPrice+"\n");
	}

}
