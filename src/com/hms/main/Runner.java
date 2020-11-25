package com.hms.main;

public class Runner {

  private String runnerName = "John Doe";
  private static Runner instance = null;
  private Runner(){}
  
  public static Runner getInstance() {
    if(instance == null) {
      instance = new Runner();
    }
    return instance;
  }
  
  public String getName() {
    return this.runnerName;
  }
}
