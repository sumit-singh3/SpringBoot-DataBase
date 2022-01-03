package com.project.employee.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//
@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmployeeModel {
	private UUID id;
	private String name;
	private String post;
	private String add;
	private Double salary;

}
