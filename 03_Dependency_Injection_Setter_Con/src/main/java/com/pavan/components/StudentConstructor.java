package com.pavan.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "studentConstructor")
public class StudentConstructor {

	private ICourse course1;

	private ICourse course2;

	static {
		System.out.println("Student .class file is loading.....\n");
	}

	public StudentConstructor() {
		System.out.println("Student :: Zero Parameter Constructor got called");
	}

	@Autowired
	public StudentConstructor(@Qualifier(value = "springboot") ICourse course1,
			@Qualifier(value = "spring") ICourse course2) {
		this.course1 = course1;
		this.course2 = course2;
		System.out.println("StudentConstructor  two param constructor got called..... \n");
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
