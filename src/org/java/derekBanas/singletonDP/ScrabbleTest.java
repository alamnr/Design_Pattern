
package org.java.derekBanas.singletonDP;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) {
		
		SingletonThreadSafe newInstance  = SingletonThreadSafe.getInstance();
		
		System.out.println("Instance 1 ID: "+ System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: "+ playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		SingletonThreadSafe newInstanceTwo = SingletonThreadSafe.getInstance();
		
System.out.println("Instance 2 ID: "+ System.identityHashCode(newInstanceTwo));
		
		System.out.println(newInstanceTwo.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("Player 2: "+ playerTwoTiles);
		
		System.out.println(newInstanceTwo.getLetterList());
		
		

	}

}
