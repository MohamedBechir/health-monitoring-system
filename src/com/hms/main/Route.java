package com.hms.main;

import java.util.ArrayList;

public class Route {

private ArrayList<Point> route = new ArrayList<Point>();

/**
 * @param route
 */
public Route(ArrayList<Point> route) {
  this.route = route;
}

public ArrayList<Point> getRoute() {
  return route;
}

public void setRoute(ArrayList<Point> route) {
  this.route = route;
}

public int getDistance() {
  return Util.distanceCalculator(this.route);
}


  
}
