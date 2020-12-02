package com.hms.observer;

public class Device implements IObserver<String>{


    private ControlUnit controlUnitSubject;
    private String deviceState;

    public Device(ControlUnit cu) {
        this.controlUnitSubject = cu;
    }

    @Override
    public void update(String message) {
        this.deviceState = message;
    }
}
