package com.capg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class EmployeeSearchController {

	@Autowired
	EmployeeSearch employeeSearch;

	@GetMapping("/employee/find/{id}")
	public Employee findById(@PathVariable int id)
	{	return employeeSearch.getEmployeeById(id);
	}

	@GetMapping("/employee/findAll")	
	public List<Employee> findById()
	{
		return employeeSearch.getAllEmployee();
	}

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp)
	{	employeeSearch.addEmployee(emp);
		return "Employee Addedd Successfully";
	}
	

	@PutMapping("/updateEmployee")
	public void putEmployee(@RequestBody Employee emp)
	{	employeeSearch.updateEmployee(emp);
		
	}

	
	@DeleteMapping("/employee/delete/{id}")
	public void deleteEmployeeById(@PathVariable int id)
	{	employeeSearch.removeEmployeeById(id);
	
	}

}