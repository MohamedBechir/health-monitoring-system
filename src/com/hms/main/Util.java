package com.hms.main;

import java.util.ArrayList;
import java.util.List;

public class Util {
  
  public static float distanceCalculator(List<Point> points) {
    int distance = 0;
    
    for(int i = 0; i < points.size() - 1; i++) {
      distance += Math.sqrt(Math.pow(points.get(i).getxCor() - points.get(i+1).getxCor(), 2) + Math.pow(points.get(i).getyCor() - points.get(i+1).getyCor(), 2));
    }
    return distance;
  }

  public static List<Point> pointsGenerator() {
    List<Point> points = new ArrayList<Point>();
    points.add(new Point(1,1));
    points.add(new Point(2,2));
    points.add(new Point(2,3));
    points.add(new Point(3,4));
    points.add(new Point(4,6));
    points.add(new Point(8, 12));

    return points;
  }
}
