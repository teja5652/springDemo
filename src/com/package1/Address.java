package com.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Address {

	//@Value("969")
	private int houseNO;
	//@Value("DurgaBhavani")
	private String street;
	//@Value("SontoshNagar")
	private String street2;
	
	@Autowired
private Engine engine;
	
	public Engine getEngine() {
		return engine;
		
	}

	/*
	 * public void setEngine(Engine engine) { this.engine = engine; }
	 */

	
	
	public int getHouseNO() {
		return houseNO;
	}
	public void setHouseNO(int houseNO) {
		this.houseNO = houseNO;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	
	

}
