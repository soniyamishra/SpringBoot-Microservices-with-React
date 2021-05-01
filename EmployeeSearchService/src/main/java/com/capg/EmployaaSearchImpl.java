package com.capg;
	
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	
@Service
public class EmployaaSearchImpl implements EmployeeSearch {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployeeById(int id) {
	
	// TODO Auto-generated method stub
	return employeeRepository.findById(id).get();
	
	}
	
	@Override
	public String addEmployee(Employee emp) {
	
	// TODO Auto-generated method stub
	employeeRepository.save(emp);
	return "New Employee Added";
	
	}
	
	@Override
	public Employee updateEmployee(Employee emp) {
	
	// TODO Auto-generated method stub
	
	//IF EMPLOYEE WILL HAVE NEW DATA OTHER THAN PK
	
	Optional<Employee> updateEmployee= employeeRepository.findById(emp.getEid());
	Employee empUpdate =updateEmployee.get();
	empUpdate.setName(emp.getName());
	empUpdate.setDesignation(emp.getDesignation());
	empUpdate.setEmailId(emp.getEmailId());
	return employeeRepository.save(empUpdate);
	
	}
	
	@Override
	public String removeEmployeeById(int id) {
	
	// TODO Auto-generated method stub
	
	employeeRepository.deleteById(id);
	return "Employee with Id"+id+"deleted";
	
	}
	
	@Override
	public List<Employee> getAllEmployee() {
	
	// TODO Auto-generated method stub
	return employeeRepository.findAll();
	
	}
	
}