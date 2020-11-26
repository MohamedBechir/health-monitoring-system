package com.hms.main;

public class DeluxeTransmitterFactory implements TransmitterFactory{

	@Override
	public Watch createWatch() {
		return new DeluxeWatch();
	}

	@Override
	public BPB createBPB() {
		return new DeluxeBPB();
	}

}
