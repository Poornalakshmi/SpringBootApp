package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bpo.EmployeeBPO;
import com.test.entities.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeBPO empBPO;
	
	public boolean addEmployee(Employee emp) {
		return empBPO.addEmployee(emp);
	}

}
