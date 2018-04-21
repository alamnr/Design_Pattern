package org.java.derekBanas.commandDP;

import java.util.List;

public class TurnItAllOff implements Command {

	List<ElectronicDevice> thedevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		thedevices = newDevices;
	}
	
	@Override
	public void execute() {
		for(ElectronicDevice electronicDevice: thedevices){
			electronicDevice.off();
		}

	}

	@Override
	public void undo() {
		
		for(ElectronicDevice electronicDevice: thedevices){
			electronicDevice.on();
		}
		
		
	}

}
