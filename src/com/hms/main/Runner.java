package com.hms.main;

import com.hms.command.RequestFacade;
import com.hms.services.Service;

public class Runner {

  private String runnerName;
  private Service service;
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
  
  public void setRunnerName(String name) {
    this.runnerName = name;
  }


  public void setService(Service s) {
    this.service = s;
  }

  public Service getService() {
    return service;
  }
}
