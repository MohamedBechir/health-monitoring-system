package com.hms.main;

import java.util.ArrayList;
import java.util.List;

public class Route {

  private Route() {}
  private static Route instance = null;
  private static List<Point> points = null;

  public static Route getInstance() {
      if(instance == null) {
          instance = new Route();
      }
      return instance;
  }

  public void setPoints(List<Point> pts) {
      points = pts;
  }

  public List<Point> getPoints() {
      return points;
  }
}
