package com.hms.main;

public class DistanceRequest implements Request {
  
    private Route route;
    private Receiver receiver;

    public DistanceRequest(Route route, Receiver receiver) {
        this.route = route;
        this.receiver = receiver;
    }

  @Override
  public void execute() {
        receiver.action(this.route);
  }

  
}
