package com.project.employee.domain;

//
import java.util.List;
import java.util.UUID;

import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;

public interface EmployeeDomain {
 
	Employee oneEmployee(UUID id); 
	
	String addEmployee(EmployeeModel employeeModel);

	List<EmployeeModel> findAllEmployee();

	Employee deleteEmployee(UUID id);

	String updateEmployee(EmployeeModel employeeModel, UUID id);
}
