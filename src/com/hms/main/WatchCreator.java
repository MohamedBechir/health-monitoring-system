package com.hms.main;

public class WatchCreator implements TransmitterFactory{

	@Override
	public Transmitter create() {
		return new Watch();
	}

}
