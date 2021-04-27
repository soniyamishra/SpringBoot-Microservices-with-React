package com.capg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/addEmployee")

	public String addemployeeRecord(@RequestBody EmployeeInfo emp)

	{

	String url="http://EMPLOLYEE-SEARCH:8080/addEmployee/";

	return restTemplate.postForObject(url, emp, String.class);

	}

	}