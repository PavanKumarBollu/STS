package com.pavan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.comp.Company_1;
import com.pavan.comp.Company_2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Company_1 company_1 = context.getBean("cmp1", Company_1.class);
		System.out.println(company_1);
		Company_2 company_2 = context.getBean("cmp2", Company_2.class);
		System.out.println(company_2);
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
