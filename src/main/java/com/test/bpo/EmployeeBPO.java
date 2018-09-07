package com.test.bpo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.dao.EmployeeDAO;
import com.test.entities.Employee;

@Component
public class EmployeeBPO {
	
	@Autowired
	private EmployeeDAO empDAO;
	
	public boolean addEmployee(Employee emp) {
		return empDAO.addEmployee(emp);
	}

}
