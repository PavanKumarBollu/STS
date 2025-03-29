package com.pavan.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="bill")
public class BillGenarator {

	@Value("#{items.idly + items.voda}")
	private Float bill;
	
	
	@Autowired
	@Qualifier(value = "info")
	private ItemsInfo items;
	
	@Value("Raghavendra")
	private String hotelName;

	@Override
	public String toString() {
		return "BillGenarator [bill=" + bill + ", items=" + items + ", hotelName=" + hotelName + "]";
	}

	public void setBill(Float bill) {
		this.bill = bill;
	}

	public void setItems(ItemsInfo items) {
		this.items = items;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	
	
	
	
	
}
