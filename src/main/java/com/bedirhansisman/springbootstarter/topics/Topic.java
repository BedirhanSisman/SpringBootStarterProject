package com.bedirhansisman.springbootstarter.topics;

public class Topic {

	private String ID;
	private String Name;
	private String Description;
		
	public Topic() {

	}

	public Topic(String iD, String name, String decription) {
		super();
		ID = iD;
		Name = name;
		Description = decription;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDecription() {
		return Description;
	}
	public void setDecription(String decription) {
		Description = decription;
	}
	
	
	
}
