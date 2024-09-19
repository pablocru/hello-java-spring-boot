package com.pablocru.restcrud.springdatajpa.service;

import com.pablocru.restcrud.springdatajpa.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    Employee deleteById(int theId);

}
