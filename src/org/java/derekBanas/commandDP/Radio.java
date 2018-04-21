package org.java.derekBanas.commandDP;

public class Radio implements ElectronicDevice {

private int volume = 0;
	
	
	@Override
	public void on() {
		System.out.println("Radio is On");

	}

	@Override
	public void off() {
		System.out.println("Radio is Off");

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Radio volume is at: " + volume);

	}

	@Override
	public void volumeDown() {
		if(volume>0){
			volume--;
			System.out.println("Radio volume is at: " + volume);
		}
		else if(volume==0){
			System.out.println("Radio volume is on Mute : " + volume);
		}
		

	}


}
