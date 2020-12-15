package com.hms.abstractfactory;

public abstract class Watch extends Transmitter {
  public abstract void testWatch();

  public void storeState() {
    System.out.println("Storing Watch State ...");
  }

  public void setToDefault() {
    System.out.println("Resetting the Watch to Factory Settings ...");
  }
}
