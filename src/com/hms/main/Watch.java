package com.hms.main;

public class Watch implements Transmitter{
	public void storeState() {
		System.out.println("Watch is created!");
	}

	@Override
	public void setToDefault() {
		System.out.println("Watch is set to default!");
	}
}
