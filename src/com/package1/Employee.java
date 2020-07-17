package com.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class Employee {

//	@Value("jaxx")
	private String ename;
	//@Value("10000")
	private int eid;
	//@Value("10000")
	private int epay;
	
	 
	  //This condition is used if we have a ambuguity in
	//  bytype even if byname cant fix it we use it
	  
	 

	@Autowired
	@Qualifier(value = "as")
	private Address address;

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEpay(int epay) {
		this.epay = epay;
	}

	
	  public void setAddress(Address address) { this.address = address; }
	 

	/*
	 * Employee(String name , int id, int pay ) {
	 * System.out.println(" Inside employee class"); this.ename = name; this.eid =
	 * id; this.epay = pay; }
	 */

	public String getEname() {
		return ename;
	}

	public int getEid() {
		return eid;
	}

	public int getEpay() {
		return epay;
	}

	public Address getAddress() {
		return address;
	}

}
