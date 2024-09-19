package com.pablocru.restcrud.jpaapi.dao;

import com.pablocru.restcrud.jpaapi.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    // ATTRIBUTES

    private EntityManager entityManager;

    // CONSTRUCTORS

    public EmployeeDAOImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    // METHODS

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery(
                "FROM Employee",
                Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        return entityManager.find(Employee.class, theId);
    }

    @Override
    public Employee save(Employee theEmployee) {
        return entityManager.merge(theEmployee);
    }

    @Override
    public Employee deleteById(int theId) {
        Employee theEmployee = this.findById(theId);

        entityManager.remove(theEmployee);

        return theEmployee;
    }

}
