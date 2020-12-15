package com.hms.main;

import java.util.ArrayList;
import java.util.List;


public class Util {	
	
    public static float bloodPressureCalculator() {
		return 8 + (int)(Math.random() * ((20 - 8) + 1));
    }
	
	
  public static int distanceCalculator(List<Point> points) {
    int distance = 0;

    for(int i = 0; i < points.size() - 1; i++) {
      distance += Math.sqrt(Math.pow(points.get(i).getxCor() - points.get(i+1).getxCor(), 2) + Math.pow(points.get(i).getyCor() - points.get(i+1).getyCor(), 2));
    }
    return distance;
  }

  public static List<Point> pointsGenerator() {
	
    List<Point> points = new ArrayList<Point>();
    
    for(int i = 0; i < 7; i++) {
      points.add(new Point(2 + (int)(Math.random() * ((6 - 2) + 1)), 2 + (int)(Math.random() * ((6 - 2) + 1))));
    }

    return points;
  }
}
