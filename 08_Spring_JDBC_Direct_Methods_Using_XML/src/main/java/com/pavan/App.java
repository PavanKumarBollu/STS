package com.pavan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.service.EmployeeMgmtServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/pavan/cfg/applicationContext.xml");
    	
    	EmployeeMgmtServiceImpl emp = context.getBean(EmployeeMgmtServiceImpl.class);
    	try {
			int count = emp.fetchEmpsCount();
			System.out.println("total Number of employees are :: " +count);
    		
    		
		} catch (Exception e) {
			System.out.println("Exception came " + e.getMessage());
			e.printStackTrace();
		}
    	
    	
    	
    	
    	((AbstractApplicationContext) context).close();
    }
}
