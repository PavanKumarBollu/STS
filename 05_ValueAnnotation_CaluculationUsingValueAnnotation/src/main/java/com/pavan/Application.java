package com.pavan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.comp.BillGenarator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		BillGenarator bill = context.getBean("bill",BillGenarator.class);
		
		System.out.println(bill);

		
		((ConfigurableApplicationContext) context).close();
	}

}
