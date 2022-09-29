package com.none.study.ch10.second;

import com.none.study.ch08.first.RemoteControl;
import com.none.study.ch08.first.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
	
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
		remoteControl.turnOff();		

	}

}
