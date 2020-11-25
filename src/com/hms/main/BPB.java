package com.hms.main;

public class BPB implements Transmitter {
public void storeState() {
	System.out.println("BPB is created!");
}
@Override
public void setToDefault() {
	System.out.println("BPB is set to default!");
}
}
