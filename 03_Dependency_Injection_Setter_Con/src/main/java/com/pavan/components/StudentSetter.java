package com.pavan.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value= "student")
public class StudentSetter {
	
	@Autowired
	@Qualifier(value="java")
	private ICourse course1;
	
	

	//setter Injection
	private ICourse course2;

	
	@Autowired
	public void setCourse2(@Qualifier(value ="spring") ICourse course2) {
		System.out.println("Setter Injection for course two has happened.....\n");
		this.course2 = course2;
	}

	static
	{
		System.out.println("Student .class file is loading.....\n");
	}
	

	public StudentSetter() {
		System.out.println("Student :: Zero Parameter Constructor got called");
	}
	
	@Override
	public String toString() {
		return "Student [course1=" + course1 + ", course2=" + course2 + "]";
	}
	
	public String getSubjectOpted()
	{
		return course1.toString() +"\t" + course2.toString();
	}
	
}
