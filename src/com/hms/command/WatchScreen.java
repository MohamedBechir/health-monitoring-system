package com.hms.command;

public class WatchScreen {
	public void displayDistance() {
		Receiver r = new DistanceRequestHandler();
		CalculateDistanceCommand command = new CalculateDistanceCommand(r);
		RequestFacade.setCommand(command);
	 	RequestFacade.measureDistance();
	}
}
