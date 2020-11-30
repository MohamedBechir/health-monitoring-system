package com.hms.main;

public class RequestFacade {

  private static Request request;

  public static void measureDistance() {
    request.execute();
  }
  public static void measureBloodPressure() {}


  public static void setRequest(Request r) {
    request = r;
  }
  

}
