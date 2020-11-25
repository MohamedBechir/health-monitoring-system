package com.hms.main;

import java.util.ArrayList;

public class Route {

  // Route initializer  
  private static ArrayList<Point> route = new ArrayList<Point>();
  public static void initRoute() {
     route.add(new Point(1,1));
     route.add(new Point(2,2));
     route.add(new Point(2,3));
     route.add(new Point(3,4));
     route.add(new Point(4,6));
     route.add(new Point(8, 12));
 }
  
  private Route() {}
  
  public static ArrayList<Point> getRoute() {
    return route;
  }
  
  


  
}
