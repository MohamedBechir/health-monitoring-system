/**
 * This the driver class where the project can launched.
 * */
package com.hms.main;

public class Main {

  public static void main(String[] args) {
    int logCounter = 0;
    // Create a Runner
    Runner runner = Runner.getInstance();
    // Log the Runner's initial distance.
    System.out.printf("[LOG %d] Distance covered: %f\n", ++logCounter ,runner.getDistanceCovered() );
    // Populate the route (Simulation for a run made by the runner).
    Route.initRoute();
    // Log the Runner's distance.
    System.out.printf("[LOG %d] Distance covered: %f\n", ++logCounter ,runner.getDistanceCovered() );

  }

}
