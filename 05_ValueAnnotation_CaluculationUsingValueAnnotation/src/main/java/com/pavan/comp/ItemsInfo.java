package com.pavan.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ItemsInfo {

	
	@Value("${info.item.idly}")
	private Float idly;
	
	@Value("${info.item.voda}")
	private Float vada;
	
	@Value("${info.item.dosa}")
	private Float dosa;
	
	@Value("${info.item.puri}")
	private Float puri;
	
	@Value("${info.item.bonda}")
	private Float bonda;
	
	
	@Override
	public String toString() {
		return "ItemsInfo [idly=" + idly + ", vada=" + vada + ", dosa=" + dosa + ", puri=" + puri + ", bonda=" + bonda
				+ "]";
	}
	
	
	
	
	
	
}

