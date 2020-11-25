package com.hms.main;

public class RequestFacade {
  
  public static void measureDistance() {
    
    Request request = new DistanceRequest();
    request.execute();
    
  }
  public static void measureBloodPressure() {}
  

}
