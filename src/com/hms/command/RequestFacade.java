package com.hms.command;

public class RequestFacade {

  private static Command command;

  public static float measureDistance() {
	  float result = command.execute();
	  return result;
  }
  public static void measureBloodPressure() {}

  public static void test() {}

  
  public static void setCommand(Command r) {
	  command = r;
  }

}
