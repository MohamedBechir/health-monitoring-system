package com.hms.observer;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit implements ISubject<String> {

    private List<IObserver<String>> observerList = new ArrayList<IObserver<String>>();
    private String state;

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
        this.state = s;
    }

    public String getState() {
        return this.state;
    }
}
