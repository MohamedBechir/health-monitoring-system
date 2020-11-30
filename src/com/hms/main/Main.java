/**
 * This the driver class where the project can launched.
 * */
package com.hms.main;

import java.util.Scanner;

import com.hms.abstractfactory.TransmitterFactory;
import com.hms.command.DistanceRequestHandler;
import com.hms.command.Receiver;

public class Main {
	
	static TransmitterFactory transmitterFactory; 
	public static void main(String[] args) {
		// Create a runner
		Runner runner = Runner.getInstance();
		runner.setRunnerName("John Doe");
		// Create a route
	  Route.getInstance().setPoints(Util.pointsGenerator());
	  
	  Receiver r = new DistanceRequestHandler();
	  System.out.println("Distance covered by  John Doe is: "+ r.action());
	  
	  
	  /*Scanner chooseProduct = new Scanner(System.in);
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
  }

}
