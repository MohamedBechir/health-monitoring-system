package com.hms.main;

public class DistanceRequest implements Request{
  
  DistanceRequestHandler drh = new DistanceRequestHandler();

  @Override
  public void execute() {
   drh.action();
  }

  
}
