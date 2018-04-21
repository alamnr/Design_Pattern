package org.java.derekBanas.commandDP;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {

		ElectronicDevice newDevice = TvRemote.getDevice();

		TurnTvOn onCommand = new TurnTvOn(newDevice);

		DeviceButton onPressed = new DeviceButton(onCommand);

		onPressed.press();

		// -----------------

		TurnTvOff offCommand = new TurnTvOff(newDevice);

		onPressed = new DeviceButton(offCommand);

		onPressed.press();

		// -----------------

		TurnVolumeUp volumeUpCommand = new TurnVolumeUp(newDevice);

		onPressed = new DeviceButton(volumeUpCommand);

		onPressed.press();
		onPressed.press();
		onPressed.press();

		// -----------------

		TurnVolumeDown volumeDownCommand = new TurnVolumeDown(newDevice);

		onPressed = new DeviceButton(volumeDownCommand);

		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();

		// -----------------

		Televission theTv = new Televission();
		Radio theRadio = new Radio();

		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		allDevices.add(theRadio);
		allDevices.add(theTv);

		TurnItAllOff allOff = new TurnItAllOff(allDevices);

		onPressed = new DeviceButton(allOff);

		onPressed.press();

		// -----------------

		
		TurnItAllOff allUndo = new TurnItAllOff(allDevices);

		onPressed = new DeviceButton(allUndo);

		onPressed.pressUndo();

	}

}
