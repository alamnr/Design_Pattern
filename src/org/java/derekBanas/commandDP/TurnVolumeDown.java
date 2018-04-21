package org.java.derekBanas.commandDP;

public class TurnVolumeDown implements Command {

	ElectronicDevice theDevice;
	
	public TurnVolumeDown(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		theDevice.volumeDown();

	}

	@Override
	public void undo() {
		theDevice.volumeUp();
		
	}

}
