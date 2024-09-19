package com.pablocru.restcrud.jpaapi.dao;

import com.pablocru.restcrud.jpaapi.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    Employee deleteById(int theId);

}
