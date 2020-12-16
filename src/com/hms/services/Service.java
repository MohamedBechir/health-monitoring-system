package com.hms.services;

import com.hms.abstractfactory.BPB;
import com.hms.abstractfactory.Watch;
import com.hms.main.Runner;

public class Service {
    private Watch w;
    private BPB belt;
    private Runner runner;
    private String serviceName;
    private ServiceType serviceType;

    
    public Service() {}
    
    public Service(String serviceName, ServiceType serviceType) {
    	this.serviceName = serviceName;
    	this.serviceType = serviceType;
    }
    
    @Override
	public String toString(){
		return "Service name is "+this.serviceName + " of "+ this.serviceType+ " Type";
	}
    
    public ServiceType getTYPE() {
		return serviceType;
	}
    
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
