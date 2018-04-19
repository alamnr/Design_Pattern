package org.java.derekBanas.singletonDP;
public class ScrabbleTestThread {

	public static void main(String[] args) {
		Runnable getTiles = new GetTiles();
		Runnable getTilesAgain = new GetTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		

	}

}
