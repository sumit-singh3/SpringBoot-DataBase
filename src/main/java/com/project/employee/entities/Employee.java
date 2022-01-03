package com.project.employee.entities;
//
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "employee")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(name = "name")
	private String name;

	@Column(name = "post")
	private String post;

	@Column(name = "add")
	private String add;

	@Column(name = "salary")
	private Double salary;

}
