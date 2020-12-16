package com.hms.services;

import com.hms.abstractfactory.BPB;
import com.hms.abstractfactory.Watch;
import com.hms.main.Runner;

public abstract class Service {
    private Watch w;
    private BPB belt;
    private Runner runner;

    public abstract Iterator createIterator();
    
    public void setWatch(Watch w) {
        this.w = w;
    }
    public void setBelt(BPB belt) {
        this.belt = belt;
    }
    public void setRunner(Runner runner) { this.runner = runner; }
    
    public Watch getWarch() { return this.w; }
    
    public BPB getBelt() { return this.belt; }
}
