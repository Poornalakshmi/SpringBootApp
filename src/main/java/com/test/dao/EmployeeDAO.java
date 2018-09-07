package com.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.test.entities.Employee;

@Repository
@Transactional
public class EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entity;

	public boolean addEmployee(Employee emp) {
		 entity.persist(emp);
		 return true;
	}

}
