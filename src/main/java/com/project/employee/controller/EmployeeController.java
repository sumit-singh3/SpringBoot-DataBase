package com.project.employee.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.Service.EmployeeService;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;
//abc
@RestController
@RequestMapping("/employee")

public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeeModel empModel) {
		String response = empService.addEmployee(empModel);
		return response;
	}
	
	@RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
	public Employee oneEmploye(@PathVariable UUID id) {
		Employee response = empService.oneEmployee(id);
		return response;
		
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public List<EmployeeModel> findAllEmployee(){
		List<EmployeeModel> response  =empService.findAllEmployee();
		return response;
}
	
	
	 @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
	   public Employee deleteEmployee(@PathVariable UUID id) {
		   Employee employee = empService.deleteEmployee(id);
		   return  employee;
	   }
	  
	@RequestMapping(value ="/update/{id}", method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody EmployeeModel empModel ,@PathVariable UUID id) {
		String response = empService.updateEmployee(empModel, id);
		return response;
		
	}
	
}
