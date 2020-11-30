package com.hms.abstractfactory;

public class BasicTransmitterFactory implements TransmitterFactory{
	@Override
	public Watch createWatch() {
		return new BasicWatch();
	}
	
	@Override
	public BPB createBPB() {
		return new BasicBPB();
	}

}
