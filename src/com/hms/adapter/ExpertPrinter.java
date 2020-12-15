package com.hms.adapter;

import com.hms.services.Service;

/*
* This class will behave as the adaptee in the Adapter design pattern
* TODO: Inject Services in expertPrint()
* */

public class ExpertPrinter {
	
	
    public void expertPrint(Service s) {
    	System.out.println("Service: "+ s);
    }
}
