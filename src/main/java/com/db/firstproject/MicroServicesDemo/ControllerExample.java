package com.db.firstproject.MicroServicesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class ControllerExample {
	
	@Autowired
	ServiceClass serviceClass;
	
	@RequestMapping("/hello")
	public String Hello() {
		return serviceClass.firstService();
	}
	
	@RequestMapping("/model")
	public Model getModel() {
		return serviceClass.getModel();
	}
	
	

}
