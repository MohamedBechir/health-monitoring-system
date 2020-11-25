package com.hms.main;

public class BPBCreator implements TransmitterFactory{

	@Override
	public Transmitter create() {
		return new BPB();
	}

}
