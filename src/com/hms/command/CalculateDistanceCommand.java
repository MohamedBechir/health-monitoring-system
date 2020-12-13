package com.hms.command;

import com.hms.main.Runner;

public class CalculateDistanceCommand implements Command {
  
    private Receiver receiver;
    private Runner runner;

    public CalculateDistanceCommand(Receiver receiver, Runner runner) {
        this.receiver = receiver;
        this.runner = runner;
    }

  @Override
  public void execute() {
        receiver.action();
  }

  
}
