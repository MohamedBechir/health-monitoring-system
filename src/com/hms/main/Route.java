package com.hms.main;

import java.util.List;

import com.hms.command.RequestFacade;

public class Route {

  private Route() {}
  private static Route instance = null;
  private static List<Point> points = null;
  private float distanceCovered = 0;


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
  
  public float getDistanceCovered() {
	    RequestFacade.measureDistance();
	    return this.distanceCovered;
	  }
  
  public void setDistanceCovered(float distance) {
	    this.distanceCovered = distance;
	  }

  
}
