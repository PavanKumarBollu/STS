package com.pavan;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.dto.EmployeeDto;
import com.pavan.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		System.out.println();
		EmployeeServiceImpl emp = context.getBean(EmployeeServiceImpl.class);
		System.out.println("Employee Details by Password is :: ");
		List<EmployeeDto> empDetailsByPassword = emp.getEmployeessByPassword("mypassword", "password123",
				"strongpass1");
		empDetailsByPassword.forEach(System.out::println);

		System.out.println("********************************************************************************");

		String email = emp.getEmployeMailByEmpNumber("EMP143");
		System.out.println("Employee Mail Which You Are Locking for is: " + email);
		System.out.println("********************************************************************************");

		System.out.println(new java.util.Date());

		((ConfigurableApplicationContext) context).close();
	}

}
