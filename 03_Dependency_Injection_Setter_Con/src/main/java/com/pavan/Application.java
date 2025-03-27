package com.pavan;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.pavan.components.StudentConstructor;
import com.pavan.components.StudentSetter;

@SpringBootApplication
public class Application {
	
	static
	{
		System.out.println("Application .class file got loading....\n");
	}
	
	public Application() {
		System.out.println("Application :: zero param constructor got called ....\n");
	}


    @Bean(value = "date")
    public LocalDateTime getDate()
	{
		System.out.println("Date Object got Created Using the @Bean Annotation\n");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		System.out.println("************* Container Started ****************\n");
		
		System.out.println("Beans Created By Container :: " + Arrays.toString(context.getBeanDefinitionNames()) + "\n");
		
		StudentSetter std = context.getBean(StudentSetter.class);
		
		System.out.println(std +"\n");
		System.out.println(std.getSubjectOpted() +"\n");
		
		
		StudentConstructor std2 = context.getBean(StudentConstructor.class);
		System.out.println(std2 +"\n");
		System.out.println(std2.getSubjectOpted() +"\n");
		
		
				
		System.out.println("************* Container Stopped ****************\n");
		((ConfigurableApplicationContext) context).close();
	}

}
