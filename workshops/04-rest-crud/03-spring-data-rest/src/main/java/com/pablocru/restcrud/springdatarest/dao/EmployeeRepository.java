package com.pablocru.restcrud.springdatarest.dao;

import com.pablocru.restcrud.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")
/*
 * Customize the API path for this resource.
 * By default, it will be in lowercase and with an `s` at the end. However, it
 * doesn't handles complex plural names like Goose -> Geese. Thats why this
 * annotation is so powerful.
 */
/*
 * JpaRepository<(entity type), (primary key type)>
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // It creates all CRUD methods "for free"

}
