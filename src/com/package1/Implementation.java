package com.package1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.package1.service.EmployeeService;

public class Implementation {
	
	public static void main(String[] args)
	{
		
		  ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("sai.xml");
		   
			
			/*
			 * EmployeeService es = (EmployeeService) con.getBean("service");
			 * 
			 * Employee e = es.getEmployee(100); System.out.println(e.getEid());
			 */
		  Employee e = (Employee)con.getBean("emp");
			  System.out.println(e.getEname());
			 
			  
			  System.out.println(e.getAddress().getHouseNO());
			    
			  Address a =(Address)con.getBean("address");
			  System.out.println(a.getEngine().getEno());
		  
		 // Employee e1 = (Employee)con.getBean("employee");
		  
		 /* System.out.println(e1.getEname());
		  System.out.println(e1.getAddress().getHouseNO());
		  System.out.println(e1.getAddress().getStreet());
		 */ 
		 	  
		 	
		
		
	}

}
