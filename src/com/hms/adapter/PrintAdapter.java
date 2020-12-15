package com.hms.adapter;

import com.hms.services.Service;

/*
* This class will behave as the Adapter in the Adapter design model
* TODO: Inject Services in print
* */


public class PrintAdapter implements Printer {
	public PrintAdapter(ExpertPrinter expertPrinter) {
		this.expertPrinter = expertPrinter;
	}

	ExpertPrinter expertPrinter;
	
    @Override
    public void print(Service s) {
    	expertPrinter.expertPrint(s);
    }
}
