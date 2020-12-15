package com.hms.command;

import com.hms.main.Util;

public class BloodPressureRequestHandler implements Receiver {

	@Override
	public void action() {
		float bloodPressure = Util.bloodPressureCalculator();
		System.out.println("Your Blood Pressure is at: "+ bloodPressure);
	}
	
}
