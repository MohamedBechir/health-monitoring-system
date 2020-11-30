package com.hms.main;

import java.util.ArrayList;

public class DistanceRequestHandler implements Receiver {
  

  @Override
  public void action(Route route) {
        Util.distanceCalculator(route.getPoints());
  }
  
  

}
