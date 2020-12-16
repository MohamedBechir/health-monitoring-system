package com.hms.services;

import java.util.List;

public class DeluxeServiceIterator implements Iterator {
	
	private ServiceType serviceType;
	private List<Service> deluxeServicesList;
	private int position;
	
    public DeluxeServiceIterator(ServiceType serviceType, List<Service> deluxeServicesList) {
    	this.serviceType = serviceType;
    	this.deluxeServicesList = deluxeServicesList;
	}

	@Override
    public Service next() {
		Service service = deluxeServicesList.get(position);
		position++;
		return service;
	}    

    @Override
    public boolean hasNext() {
    	while (position < deluxeServicesList.size()) {
			Service service = deluxeServicesList.get(position);
			if (service.getTYPE().equals(serviceType)) {
				return true;
			} else
				position++;
		}
		return false;
    }
}
