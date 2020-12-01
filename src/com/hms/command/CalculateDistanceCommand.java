package com.hms.command;

public class CalculateDistanceCommand implements Command {
  
    private Receiver receiver;

    public CalculateDistanceCommand(Receiver receiver) {
        this.receiver = receiver;
    }

  @Override
  public void execute() {
        receiver.action();
  }

  
}
