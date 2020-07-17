package com.package1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value("010")
	private int eno;
	@Value("Teja")
	private String name;
	@Value("2020")
	private int mfg;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMfg() {
		return mfg;
	}
	public void setMfg(int mfg) {
		this.mfg = mfg;
	}
	

}
