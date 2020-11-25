package com.hms.main;

public class Runner {

  private String runnerName = "John Doe";
  private float distanceCovered = 0;
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
  
  public void setDistanceCovered(float distance) {
    this.distanceCovered = distance;
  }
  
  public float getDistanceCovered() {
    RequestFacade.measureDistance();
    return this.distanceCovered;
  }
  
}
