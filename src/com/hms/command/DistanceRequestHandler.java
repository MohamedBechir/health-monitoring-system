package com.hms.command;

import com.hms.main.Route;
import com.hms.main.Util;

public class DistanceRequestHandler implements Receiver {
  

  @Override
  public float action() {
        float distance = Util.distanceCalculator(Route.getInstance().getPoints());
        return distance;
  }
  
  

}
