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
	  
		/*Let's assume that this is the client
	  	this is how we run our command pattern code!*/
		/*Receiver r = new DistanceRequestHandler();
		CalculateDistanceCommand command = new CalculateDistanceCommand(r);
		RequestFacade.setCommand(command);
	 	RequestFacade.measureDistance();*/
		
		/*Let's assume that WatchScreen is the client
	  	this is how we run our command pattern code!*/
		/*float result = new WatchScreen().displayDistance();
		System.out.println(result);
		*/
	/* 	Scanner chooseProduct = new Scanner(System.in);
	 	System.out.println("Enter the product of your choice: ");
	 	// Read user input
	 	String productChosen = chooseProduct.nextLine();
	 	if (productChosen.equalsIgnoreCase("Deluxe Watch")) {
	 		transmitterFactory = new DeluxeTransmitterFactory();
	 		transmitterFactory.createWatch().testWatch();
	 	} else if (productChosen.equalsIgnoreCase("Basic Watch")) {
	 		transmitterFactory = new BasicTransmitterFactory();
	 		transmitterFactory.createWatch().testWatch();
	 	}else if (productChosen.equalsIgnoreCase("Deluxe BPB")) {
	 		transmitterFactory = new DeluxeTransmitterFactory();
	 		transmitterFactory.createBPB().TestBPB();		
	 	}else if (productChosen.equalsIgnoreCase("Basic BPB")) {
	 		transmitterFactory = new BasicTransmitterFactory();
	 		transmitterFactory.createBPB().TestBPB();	
	 	}
	 	chooseProduct.close();*/

		// Test Composite Pattern
		ServicesFacade.getInstance().buildMusicList();
		ServicesFacade.getInstance().browseMI();
	}

}
