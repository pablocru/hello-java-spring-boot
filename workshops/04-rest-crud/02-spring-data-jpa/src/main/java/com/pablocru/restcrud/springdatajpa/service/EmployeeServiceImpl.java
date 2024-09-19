package com.pablocru.restcrud.springdatajpa.service;

import com.pablocru.restcrud.springdatajpa.dao.EmployeeRepository;
import com.pablocru.restcrud.springdatajpa.entity.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // ATTRIBUTES

    private EmployeeRepository employeeRepository;

    // CONSTRUCTORS

    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    // METHODS

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        if (!result.isPresent()) {
            throw new EmployeeNotFoundException(theId);
        }

        return result.get();
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public Employee deleteById(int theId) {
        Employee theEmployee = this.findById(theId);

        employeeRepository.delete(theEmployee);
        /*
         * `employeeRepository` has a method called `deleteById()` that can be used to
         * delete the entity directly. However, I want the API to return the deleted
         * entity
         */
        // employeeRepository.deleteById(theId);

        return theEmployee;
    }

}
