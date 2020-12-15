/**
 * This the driver class where the project can launched.
 * */
package com.hms.main;


import com.hms.abstractfactory.TransmitterFactory;
import com.hms.adapter.ExpertPrinter;
import com.hms.adapter.PrintAdapter;
import com.hms.adapter.Printer;
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
		System.out.println("Runner: "+ runner.getName());
		
		// Create a route
		Route.getInstance().setPoints(Util.pointsGenerator());
		
		// Create a Deluxe Service
		Service service = ServicesFacade.createService(ServiceType.DELUXE);
		runner.setService(service);
		service.setRunner(runner);
		
		
		//Adapter
		ExpertPrinter expertPrinter = new ExpertPrinter();
		Printer printer = new PrintAdapter(expertPrinter);
		ServicesFacade.getInstance().printService(printer, service);
		
		
		//Observer
		ControlUnit cu = new ControlUnit();
		Device device = new Device(cu);
		cu.attach(device);
		cu.ticks();
		
		//Measure Distance
		ServicesFacade.getInstance().measureDistance(runner);
		
		// Test Composite Pattern
		ServicesFacade.getInstance().buildMusicList();
		ServicesFacade.getInstance().browseMI();
	}

}
