package com.project.employee.Service;
//
import java.util.List;
import java.util.UUID;

import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;

public interface EmployeeService {

	String addEmployee(EmployeeModel employeeModel);
	List<EmployeeModel> findAllEmployee();
	Employee deleteEmployee(UUID id);
	public String updateEmployee(EmployeeModel employeeModel,UUID id);
	public Employee oneEmployee(UUID id);
	
}
