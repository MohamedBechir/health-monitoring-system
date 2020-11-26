package com.hms.main;

import java.util.ArrayList;

public class Util {
  
  public static float distanceCalculator(ArrayList<Point> points) {
    int distance = 0;
    
    for(int i = 0; i < points.size() - 1; i++) {
      distance += Math.sqrt(Math.pow(points.get(i).getxCor() - points.get(i+1).getxCor(), 2) + Math.pow(points.get(i).getyCor() - points.get(i+1).getyCor(), 2));
    }
    return distance;
  }
   
}
