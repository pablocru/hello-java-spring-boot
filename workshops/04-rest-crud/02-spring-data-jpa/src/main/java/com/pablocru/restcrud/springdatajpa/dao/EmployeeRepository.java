package com.pablocru.restcrud.springdatajpa.dao;

import com.pablocru.restcrud.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * JpaRepository<(entity type), (primary key type)>
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // It creates all CRUD methods "for free"

}
