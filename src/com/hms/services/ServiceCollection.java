package com.hms.services;

public interface ServiceCollection {
	public void addService(Service service);
	public void removeService(Service service);
	public  Iterator iterator(ServiceType type);
}
