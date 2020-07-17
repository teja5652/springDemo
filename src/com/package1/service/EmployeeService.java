package com.package1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.package1.Employee;
import com.package1.dao.EmployeeDao;

@Component(value = "service") 
// if we use component spring will automatically create the bean class and inject the dependences
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public void setEmployee(EmployeeDao dao) {
		this.dao = dao;
	}
	
	public Employee getEmployee(int empID)
	{
	EmployeeDao d = new EmployeeDao();
return 	d.getEmployee(empID);

	}
	

}
