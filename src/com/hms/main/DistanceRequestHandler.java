package com.hms.main;

import java.util.ArrayList;

public class DistanceRequestHandler implements Receiver {
  

  @Override
  public void action() {
        Util.distanceCalculator(Route.getInstance().getPoints());
  }
  
  

}
