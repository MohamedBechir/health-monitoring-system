package com.hms.services;

import com.hms.abstractfactory.BPB;
import com.hms.abstractfactory.Watch;

public class DeluxeService extends Service {
    @Override
    public Iterator createIterator() {
        return new DeluxeServiceIterator();
    }

    @Override
    public String toString() {
        return "Deluxe Service";
    }
}
