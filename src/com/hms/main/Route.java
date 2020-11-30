package com.hms.main;

import java.util.ArrayList;
import java.util.List;

public class Route {

  // A route is composed of Points
    private List<Point> points;

    public Route(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return this.points;
    }

  /*public static void initRoute() {
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
  }*/
}
