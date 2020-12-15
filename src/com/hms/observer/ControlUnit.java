package com.hms.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ControlUnit implements ISubject<String> {

    private List<IObserver<String>> observerList = new ArrayList<IObserver<String>>();
    private String state;
    private int time;
	Random generator = new Random();

    @Override
    public void attach(IObserver<String> o) {
        this.observerList.add(o);
    }

    @Override
    public void detach(IObserver<String> o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.update(getState()));
    }

    public void setState(String s) {
    	notifyObservers();
        this.state = s;
    }
    
    public void ticks() {
    	time = generator.nextInt(1000)+10;
    	System.out.println("An activity of "+ time+ " seconds has been detected");
    	notifyObservers();
    }

    public String getState() {
        return this.state;
    }
}
