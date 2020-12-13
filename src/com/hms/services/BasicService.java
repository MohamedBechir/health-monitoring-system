package com.hms.services;

import com.hms.abstractfactory.BPB;
import com.hms.abstractfactory.Watch;

public class BasicService extends Service {

    @Override
    public Iterator createIterator() {
        return new BasicServiceIterator();
    }

    @Override
    public String toString() {
        return "Basic Service";
    }
}
