package com.hms.main;

import com.hms.command.RequestFacade;

public class Runner {

  private String runnerName;
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

  public void setRunnerName(String name) {
    this.runnerName = name;
  }

  public float getDistanceCovered() {
    RequestFacade.measureDistance();
    return this.distanceCovered;
  }
  
}
