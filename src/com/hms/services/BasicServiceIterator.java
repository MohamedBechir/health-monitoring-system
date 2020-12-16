package com.hms.services;

import java.util.List;

public class BasicServiceIterator implements Iterator {
	
	private ServiceType serviceType;
	private List<Service> basicServicesList;
	private int position;
	
    public BasicServiceIterator(ServiceType serviceType, List<Service> basicServicesList) {
    	this.serviceType = serviceType;
    	this.basicServicesList = basicServicesList;
	}

	@Override
    public Service next() {
		Service service = basicServicesList.get(position);
		position++;
		return service;
	}    

    @Override
    public boolean hasNext() {
    	while (position < basicServicesList.size()) {
			Service service = basicServicesList.get(position);
			if (service.getTYPE().equals(serviceType)) {
				return true;
			} else
				position++;
		}
		return false;
    }
}
