package com.pavan.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value="info")
@PropertySource(value="application.properties")
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


	public void setIdly(Float idly) {
		System.out.println("ItemsInfo.setIdly()");
		this.idly = idly;
	}


	public Float getIdly() {
		return idly;
	}


	public Float getVada() {
		return vada;
	}


	public Float getDosa() {
		return dosa;
	}


	public Float getPuri() {
		return puri;
	}


	public Float getBonda() {
		return bonda;
	}


	public void setVada(Float vada) {
		this.vada = vada;
	}


	public void setDosa(Float dosa) {
		this.dosa = dosa;
	}


	public void setPuri(Float puri) {
		this.puri = puri;
	}


	public void setBonda(Float bonda) {
		this.bonda = bonda;
	}
	
	
	
	
	
	
	
	
}

