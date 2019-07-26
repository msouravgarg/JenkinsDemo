package com.db.firstproject.MicroServicesDemo;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	
	public String firstService() {
		return "Hello Service";
	}
	
	public Model getModel() {
		return new Model("1", "Sourav", 30);
	}

}
