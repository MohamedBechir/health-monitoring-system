package com.hms.main;

import java.util.Scanner;

public class TransmitterMain {
	static TransmitterFactory transmitterFactory;
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Which Transmitter you want to create: ");
	    String userInput = myObj.nextLine();  // Read user input
	    if (userInput.equalsIgnoreCase("Watch")) {
			transmitterFactory = new WatchCreator();
		}else if (userInput.equalsIgnoreCase("BPB")) {
			transmitterFactory = new BPBCreator();
		}
		transmitterFactory.create().setToDefault();
	}

}
