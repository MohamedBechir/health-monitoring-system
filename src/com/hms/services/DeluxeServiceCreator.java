package com.hms.services;

public class DeluxeServiceCreator extends ServiceCreator {
    @Override
    public Service create() {
        return new DeluxeService();
    }
}
