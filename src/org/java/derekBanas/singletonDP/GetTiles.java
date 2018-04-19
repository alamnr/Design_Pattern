package org.java.derekBanas.singletonDP;

import java.util.LinkedList;

public class GetTiles  implements Runnable {

	@Override
	public void run() {
		SingletonThreadSafe newInstance = SingletonThreadSafe.getInstance();
		
		System.out.println("Instance Id: "+System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player : "+ playerOneTiles);
		
		System.out.println("Got Tiles");
		
	}

}
