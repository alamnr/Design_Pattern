package org.java.derekBanas.commandDP;

public class TurnTvOff implements Command {

	private ElectronicDevice theDevice;
	
	public TurnTvOff(ElectronicDevice newDevice) {
		theDevice = newDevice;
		
	}
	@Override
	public void execute() {
		theDevice.off();

	}
	@Override
	public void undo() {
		theDevice.on();
		
	}

}
