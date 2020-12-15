package com.hms.abstractfactory;

public abstract class BPB extends Transmitter {
	public abstract void TestBPB();
	
	public void storeState() {
	  System.out.println("Storing Belt State ...");
	}
	
	public void setToDefault() {
	  System.out.println("Resetting the Belt to Factory Settings ...");
	}

}
