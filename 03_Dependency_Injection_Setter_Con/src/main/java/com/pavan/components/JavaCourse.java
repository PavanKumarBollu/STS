package com.pavan.components;

import org.springframework.stereotype.Component;

@Component(value="java")
public class JavaCourse implements ICourse {
	
	static
	{
		System.out.println("javacourse .class file is loading.....\n");
	}
	

	public JavaCourse() {
		System.out.println("JavaCourse.Java() :: Zero Parameter Constructor got called");
	}

	@Override
	public String courseContent() {
		return "Java Course Content Is Here.....\n";
	}

	@Override
	public Float coursePrice() {
		return 1500.0f;
	}

	@Override
	public String toString() {
		return "JavaCourse";
	}

	
	
}
