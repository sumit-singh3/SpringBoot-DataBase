package com.project.employee.repositories;
//
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employee.entities.Employee;

@Repository
public interface EmployeeRepositories extends JpaRepository<Employee, UUID> {

}
