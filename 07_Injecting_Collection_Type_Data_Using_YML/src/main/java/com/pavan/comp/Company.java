package com.pavan.comp;

public class Company {
//	this values will set by the has a properties style using the application.properties file
	private String title;
	private String location;
	private int size;
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public void setSize(int size) {
		this.size = size;
	}



	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", size=" + size + "]";
	}
	
	

}
