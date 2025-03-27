package com.pavan.components;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value= "wmg")
public class Wish {
	
		// Field Injection
	@Autowired(required = true)
	private LocalDateTime date;
	
	static
	{
		System.out.println("wish .class file is loading....");
	}
	public Wish()
	{
		System.out.println("wish zero parameter constructor");
	}
	
	public String wishUser(String uName)
	{
		int hour = date.getHour();
		if (hour < 12)
			return "Good Morning :: " + uName;
		else if (hour < 16)
			return "Good Afternoon :: " + uName;
		else if (hour < 20)
			return "Good Evening :: " + uName;
		else
			return "Good Night :: " + uName;
	}
	@Override
	public String toString() {
		return "Wish [date=" + date + "]";
	}
	
	
	
}
