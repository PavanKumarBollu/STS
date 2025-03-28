package com.pavan.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component(value="cmp2")
@ConfigurationProperties(prefix = "info.com")
public class Company_2 {
	@Value("${info.com.name}")
	private String name;
	@Value("${info.com.empcount}")
	private Integer empCount;
	@Value("${info.com.ceoName}")
	private String ceoName;

	static {
		System.out.println("Company_2 .class file is loading.....\n");
		
	}
	
	public Company_2()
	{
		System.out.println("company_2  zero param constructo got called .....\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpCount() {
		return empCount;
	}

	public void setEmpCount(Integer empCount) {
		this.empCount = empCount;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	@Override
	public String toString() {
		return "Company_2 [name=" + name + ", empCount=" + empCount + ", ceoName=" + ceoName + "]";
	}
	
	
	
}
