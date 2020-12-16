package com.hms.services;

import java.util.ArrayList;
import java.util.List;


public class BasicServiceCollection implements ServiceCollection {
    List<Service> basicServicesList = new ArrayList<Service>();

	@Override
	public void addService(Service service) {
		this.basicServicesList.add(service);
	}

	@Override
	public void removeService(Service service) {
		this.basicServicesList.remove(service);
	}

	@Override
	public Iterator iterator(ServiceType serviceType) {
		return new BasicServiceIterator(serviceType, this.basicServicesList);
	}
    

}
