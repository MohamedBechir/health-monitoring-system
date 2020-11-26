/**
 * This the driver class where the project can launched.
 * */
package com.hms.main;

import java.util.Scanner;

public class Main {
	static TransmitterFactory transmitterFactory; 

	/*@SuppressWarnings("static-access")
	public Main(TransmitterFactory transmitterFactory) {
		this.transmitterFactory = transmitterFactory;
	}*/
  public static void main(String[] args) {
	Scanner chooseProduct = new Scanner(System.in);
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
	
	int logCounter = 0;
    // Create a Runner
	Runner runner = Runner.getInstance();
    // Log the Runner's initial distance.
	System.out.printf("[LOG %d] Distance covered: %f\n", ++logCounter ,runner.getDistanceCovered() );
    // Populate the route (Simulation for a run made by the runner).
    Route.initRoute();
    // Log the Runner's distance.
    System.out.printf("[LOG %d] Distance covered: %f\n", ++logCounter ,runner.getDistanceCovered() );
  }

}
