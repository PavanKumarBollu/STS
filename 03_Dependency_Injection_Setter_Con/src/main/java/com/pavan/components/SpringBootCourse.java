package com.pavan.components;

import org.springframework.stereotype.Component;

@Component(value="springboot")
public class SpringBootCourse implements ICourse {
	static
	{
		System.out.println("SpringBootCourse .class file is loading.....\n");
	}
	

	

	@Override
	public String courseContent() {
		return "Spring boot Course content is loading.....\n";
	}

	@Override
	public Float coursePrice() {
		return 5000.0f;
	}

	@Override
	public String toString() {
		return "SpringBootCourse []";
	}
	

}
