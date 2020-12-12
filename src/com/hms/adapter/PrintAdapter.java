package com.hms.adapter;

/*
* This class will behave as the Adapter in the Adapter design model
* TODO: Inject Services in print
* */


public class PrintAdapter extends ExpertPrinter implements Printer {
    @Override
    public void print() {
        expertPrint();
    }
}
