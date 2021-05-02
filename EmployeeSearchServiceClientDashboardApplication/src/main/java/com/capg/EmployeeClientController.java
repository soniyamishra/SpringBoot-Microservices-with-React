package com.capg;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
public class EmployeeClientController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{id}")

	public EmployeeInfo getemployeeRecord(@PathVariable int id)

	{

	String url="http://EMPLOLYEE-SEARCH:8080/employee/find/"+id;

	return restTemplate.getForObject(url, EmployeeInfo.class);

	}


	@GetMapping("/employee/findAll")	
	public List<EmployeeInfo> findById()
	{	
		String url="http://EMPLOLYEE-SEARCH:8080/employee/findAll/";
		EmployeeInfo[] list =restTemplate.getForObject(url, EmployeeInfo[].class);
		List<EmployeeInfo> emp = Arrays.asList(list);
		return emp;
	}
	
	@PutMapping("/updateEmployee")
	public void putEmployee(@RequestBody EmployeeInfo emp)
	{	
		String url="http://EMPLOLYEE-SEARCH:8080/updateEmployee/";
		 restTemplate.put(url, emp);
			
	}

	
	@DeleteMapping("/employee/delete/{id}")
	public void deleteEmployee (@PathVariable int id)
	{	String url="http://EMPLOLYEE-SEARCH:8080/employee/delete/"+id;
	   restTemplate.delete(url);
		
	}
	

	@PostMapping("/addEmployee")

	public String addemployeeRecord(@RequestBody EmployeeInfo emp)

	{

	String url="http://EMPLOLYEE-SEARCH:8080/addEmployee/";

	return restTemplate.postForObject(url, emp, String.class);

	}
}