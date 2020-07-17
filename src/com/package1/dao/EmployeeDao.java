package com.package1.dao;

import org.springframework.stereotype.Component;

import com.package1.Employee;

@Component
public class EmployeeDao {
	

	public Employee getEmployee(int empID)
	{
		Employee e = new Employee();
		
		e.setEid(empID);
		e.setEname("sai");
		e.setEpay(1000);
		return e;
		
	}
}
