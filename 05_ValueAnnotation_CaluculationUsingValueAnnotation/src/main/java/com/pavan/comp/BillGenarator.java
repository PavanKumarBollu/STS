package com.pavan.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="bill")
public class BillGenarator {

	@Value("#{info.itemIdly + info.itemVada + info.itemDosa + info.itemPuri + info.itemBonda}")
	private Float bill;
	
	
	@Autowired
	private ItemsInfo items;
	
	@Value("Raghavendra")
	private String hotelName;

	@Override
	public String toString() {
		return "BillGenarator [bill=" + bill + ", items=" + items + ", hotelName=" + hotelName + "]";
	}
	
	
	
	
}
