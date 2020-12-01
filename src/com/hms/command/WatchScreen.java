package com.hms.command;

public class WatchScreen {
	public float displayDistance() {
		Receiver r = new DistanceRequestHandler();
		CalculateDistanceCommand command = new CalculateDistanceCommand(r);
		RequestFacade.setCommand(command);
	 	float distance = RequestFacade.measureDistance();
	 	return distance;
	}
}
