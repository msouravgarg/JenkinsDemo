package com.db.firstproject.MicroServicesDemo;

public class Model {

	String id;
	String name;
	int age;
	
	public Model(String id,String name,int age) {
		
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
