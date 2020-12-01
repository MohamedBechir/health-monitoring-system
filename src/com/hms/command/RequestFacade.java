package com.hms.command;

public class RequestFacade {

  private static Command command;

  public static void measureDistance() {
	  command.execute();
  }
  public static void measureBloodPressure() {}

  public static void test() {}

  
  public static void setCommand(Command r) {
	  command = r;
  }

}
