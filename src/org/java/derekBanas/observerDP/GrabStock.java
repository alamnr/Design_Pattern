package org.java.derekBanas.observerDP;

public class GrabStock {

	public static void main(String[] args){
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver stockObserver1 =  new StockObserver(stockGrabber);
	
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		StockObserver stockObserver2 =  new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		stockGrabber.unregister(stockObserver1);
		
		stockGrabber.setIBMPrice(999.00);
		stockGrabber.setApplPrice(666.60);
		stockGrabber.setGoogPrice(777.40);
		
		Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 199.00);
		Runnable getAapl = new GetTheStock(stockGrabber, 2, "AAPL", 399.00);
		Runnable getGoog = new GetTheStock(stockGrabber, 2, "GOOG", 499.00);
		
		new Thread(getIbm).start();
		new Thread(getAapl).start();
		new Thread(getGoog).start();
		
	}
}
