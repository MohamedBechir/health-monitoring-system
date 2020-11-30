package com.hms.main;

public class DistanceRequest implements Request {
  
    private Receiver receiver;

    public DistanceRequest(Receiver receiver) {
        this.receiver = receiver;
    }

  @Override
  public void execute() {
        receiver.action();
  }

  
}
