package com.hms.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Util {	
	
    public static float bloodPressureCalculator() {
		return 2 + (int)(Math.random() * ((6 - 2) + 1));
    }
	
	
  public static int distanceCalculator(List<Point> points) {
    int distance = 0;

    for(int i = 0; i < points.size() - 1; i++) {
      distance += Math.sqrt(Math.pow(points.get(i).getxCor() - points.get(i+1).getxCor(), 2) + Math.pow(points.get(i).getyCor() - points.get(i+1).getyCor(), 2));
    }
    return distance;
  }

  public static List<Point> pointsGenerator() {
	int x1 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int y1 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int x2 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int y2 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int x3 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int y3 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int x4 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int y4 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int x6 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int y6 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int x7 = 2 + (int)(Math.random() * ((6 - 2) + 1));
	int y7 = 2 + (int)(Math.random() * ((6 - 2) + 1));
    List<Point> points = new ArrayList<Point>();
    points.add(new Point(x1,y1));
    points.add(new Point(x2,y2));
    points.add(new Point(x3,y3));
    points.add(new Point(x4,y4));
    points.add(new Point(x6,y6));
    points.add(new Point(x7,y7));

    return points;
  }
}
