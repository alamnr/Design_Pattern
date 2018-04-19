package org.java.derekBanas.singletonDP;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SingletonThreadSafe {

	public static SingletonThreadSafe firstInstance = null;

	// Holds all scrable letter in an array

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d",
			"e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n",
			"o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s",
			"t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", };

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

	// used to slow down forst thread

	static boolean firstThread = true;

	// Created to keep users from instantiation
	// Only Singleton will be able to instantiate this class

	private SingletonThreadSafe() {
	}

	// We could make getInstance a synchronized method to force
	// every thread to wait its turn. That way only one thread
	// can access a method at a time. This can really slow everything
	// down though
	// public static synchronized Singleton getInstance()

	public static SingletonThreadSafe getInstance() {

		
		if (firstInstance == null) {
			
			// This is here to test what happens if threads try
			// to create instances of this class

			if (firstThread) {

				firstThread = false;

				try {
					Thread.currentThread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

			// Here we just use synchronized when the first object
						// is created
			synchronized (SingletonThreadSafe.class) {
				if(firstInstance == null){
					// If the instance isn't needed it isn't created
					// This is known as lazy instantiation
			
					firstInstance = new SingletonThreadSafe();
					
					// Shuffle the letters in the list
					Collections.shuffle(firstInstance.letterList);
				}
					
			}
			
		}

		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
	
		LinkedList<String>  tilesToSend = new LinkedList<String>();
		
		for(int i=0;i<=howManyTiles;i++){
		 tilesToSend.add(firstInstance.letterList.remove(0));	
		}
	
		return tilesToSend;
	}
}
