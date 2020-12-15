/**
 * This the driver class where the project can launched.
 * */
package com.hms.main;

import java.util.Scanner;

import com.hms.abstractfactory.BasicTransmitterFactory;
import com.hms.abstractfactory.DeluxeTransmitterFactory;
import com.hms.abstractfactory.TransmitterFactory;
import com.hms.command.WatchScreen;
import com.hms.facade.ServicesFacade;
import com.hms.observer.ControlUnit;
import com.hms.observer.Device;
import com.hms.services.Service;
import com.hms.services.ServiceType;

public class Main {
	
	static TransmitterFactory transmitterFactory; 
	public static void main(String[] args) {
		// Create a runner
		Runner runner = Runner.getInstance();
		runner.setRunnerName("John Doe");
		
		// Create a route
		Route.getInstance().setPoints(Util.pointsGenerator());
		
		// Create a Deluxe Service
		Service service = ServicesFacade.createService(ServiceType.DELUXE);
		runner.setService(service);
		service.setRunner(runner);
		System.out.println(runner.getService().toString());
		
		//Test Observer
		ControlUnit cu = new ControlUnit();
		Device device = new Device(cu);
		cu.attach(device);
		cu.ticks();
	  
		// Test Composite Pattern
		ServicesFacade.getInstance().buildMusicList();
		ServicesFacade.getInstance().browseMI();
	}

}
