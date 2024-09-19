package com.pablocru.restcrud.jpaapi.service;

import com.pablocru.restcrud.jpaapi.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    Employee deleteById(int theId);

}
