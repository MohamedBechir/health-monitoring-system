package com.hms.main;

import java.util.ArrayList;

public class Util {
  
  public static int distanceCalculator(ArrayList<Point> points) {
    int distance = 0;
    
    for(int i = 0; i < points.size() - 1; i++) {
      distance += Math.sqrt(Math.pow(points.get(i).getxCor() - points.get(i+1).getxCor(), 2) + Math.pow(points.get(i).getyCor() - points.get(i+1).getyCor(), 2));
    }
    
    return distance;
  }
  
  // Route initializer  
  private static Route newRoute = new Route(null); 
  public static void initRoute() {
   if(Util.newRoute.getRoute() == null) {
     ArrayList<Point> route = new ArrayList<Point>();
     route.add(new Point(1,1));
     route.add(new Point(2,2));
     route.add(new Point(2,3));
     route.add(new Point(3,4));
     route.add(new Point(4,6));
     route.add(new Point(8, 12));
     newRoute.setRoute(route);
   }
 }
  
  
}
