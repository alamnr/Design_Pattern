package org.java.derekBanas.commandDP;

public class Televission implements ElectronicDevice {

	private int volume = 0;
	
	
	@Override
	public void on() {
		System.out.println("TV is On");

	}

	@Override
	public void off() {
		System.out.println("TV is Off");

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("TV volume is at: " + volume);

	}

	@Override
	public void volumeDown() {
		if(volume>0){
			volume--;
			System.out.println("TV volume is at: " + volume);
		}
		else if(volume==0){
			System.out.println("TV volume is on Mute : " + volume);
		}
		

	}

}
