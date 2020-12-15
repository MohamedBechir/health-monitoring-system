package com.hms.abstractfactory;

public abstract class Transmitter {
  public void reboot() {
    System.out.println();
    print();
    storeState();
    setToDefault();
  }

  public void print() {
    System.out.println("Rebooting Device ...");
  }

  public abstract void storeState();

  public abstract void setToDefault();
}
