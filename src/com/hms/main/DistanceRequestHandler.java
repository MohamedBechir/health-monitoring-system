package com.hms.main;

import java.util.ArrayList;

public class DistanceRequestHandler implements Receiver {
  

  @Override
  public void action(Runner runner) {
        ArrayList<Point> route = Route.getRoute();
        float distance = Util.distanceCalculator(route);
        runner.setDistanceCovered(distance);
  }
  
  

}
