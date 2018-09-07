package com.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Employee;
import com.test.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	/*@RequestMapping("/")
	public String index(ModelMap model) {
		return "uploadFile";
	}*/
	
	@RequestMapping("/addEmployee")
	public boolean addEmployee()
	{
		Employee emp=new Employee();
		emp.setName("ABCD");
		return empService.addEmployee(emp);
	}
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		System.out.println("model::"+model);
		return "welcome";
	}
}
