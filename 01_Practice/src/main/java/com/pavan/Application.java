package com.pavan;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		System.out.println("bean names : " + Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getClass().getName());
		((ConfigurableApplicationContext) context).close();
	}

}
