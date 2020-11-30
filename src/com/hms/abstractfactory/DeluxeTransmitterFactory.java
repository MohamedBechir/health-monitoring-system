package com.hms.abstractfactory;

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
