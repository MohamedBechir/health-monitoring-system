package com.hms.services;

import java.util.ArrayList;
import java.util.List;


public class DeluxeServiceCollection implements ServiceCollection {
    List<Service> deluxeServicesList = new ArrayList<Service>();

	@Override
	public void addService(Service service) {
		this.deluxeServicesList.add(service);
	}

	@Override
	public void removeService(Service service) {
		this.deluxeServicesList.remove(service);
	}

	@Override
	public Iterator iterator(ServiceType serviceType) {
		return new DeluxeServiceIterator(serviceType, this.deluxeServicesList);
	}
    

}
