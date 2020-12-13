package com.hms.command;

import com.hms.main.Runner;

public class WatchScreen {
	public float displayDistance() {
		Receiver r = new DistanceRequestHandler();
		CalculateDistanceCommand command = new CalculateDistanceCommand(r, Runner.getInstance());
		RequestFacade.setCommand(command);
	 	float distance = 0;
	 	return distance;
	}
}
