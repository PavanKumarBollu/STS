package com.pavan.components;

import org.springframework.stereotype.Component;

@Component(value="spring")
public class SpringCourse implements ICourse{

	
	static
	{
		System.out.println("SpringCourse .class file is loading.....\n");
	}
	

	public SpringCourse() {
		System.out.println("SpringCourse:: Zero Parameter Constructor got called");
	}


	@Override
	public String courseContent() {
		return "Spring Course Content Is Here.....\n";
	}

	@Override
	public Float coursePrice() {
		return 2500.0f;
	}


	@Override
	public String toString() {
		return "SpringCourse ";
	}
	
}
