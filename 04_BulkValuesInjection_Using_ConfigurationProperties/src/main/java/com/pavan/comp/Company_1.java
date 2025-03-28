package com.pavan.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component(value="cmp1")
@ConfigurationProperties(prefix = "info.com")

public class Company_1 {
	
	private String name;
	private Integer empCount;
	private String ceoName;

	static {
		System.out.println("Company_1 .class file is loading.....\n");
		
	}
	
	public Company_1()
	{
		System.out.println("company_1 zero param constructo got called .....\n");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpCount(Integer empCount) {
		this.empCount = empCount;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	@Override
	public String toString() {
		return "Company_1 [name=" + name + ", empCount=" + empCount + ", ceoName=" + ceoName + "]";
	}
	
	
}
