package com.hms.services;

public class BasicServiceCreator extends ServiceCreator{
    @Override
    public Service create() {
        return new BasicService();
    }
}
