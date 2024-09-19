package com.pablocru.restcrud.jpaapi.service;

import com.pablocru.restcrud.jpaapi.dao.EmployeeDAO;
import com.pablocru.restcrud.jpaapi.entity.Employee;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // ATTRIBUTES

    private EmployeeDAO employeeDAO;

    // CONSTRUCTORS

    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // METHODS

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Employee theEmployee = employeeDAO.findById(theId);

        if (theEmployee == null) {
            throw new EmployeeNotFoundException(theId);
        }

        return theEmployee;
    }

    /*
     * The following methods are modifying the database so it is needed to manage it
     * as a transaction. The service is responsible for manage this transaction as
     * it can use different databases or entities to perform a given transaction.
     */

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public Employee deleteById(int theId) {
        return employeeDAO.deleteById(theId);
    }

}
