package com.emp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.modal.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
