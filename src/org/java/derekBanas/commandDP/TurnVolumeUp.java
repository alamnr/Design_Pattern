package org.java.derekBanas.commandDP;

public class TurnVolumeUp implements Command {

	ElectronicDevice theDevice;
	
	public TurnVolumeUp(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}
	@Override
	public void execute() {
		theDevice.volumeUp();

	}
	@Override
	public void undo() {
		theDevice.volumeDown(); 
		
	}

}
