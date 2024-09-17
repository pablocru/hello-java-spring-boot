package com.pablocru.hibernatejpacrud.createstudent.dao;

import com.pablocru.hibernatejpacrud.createstudent.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// Supports component scanning and translates JDBC exceptions
@Repository
public class StudentDAOImpl implements StudentDAO {

    // ATTRIBUTES

    private EntityManager entityManager;

    // CONSTRUCTORS

    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // OTHER METHODS
    @Override
    @Transactional // Since this is an update it is needed to manage as a transaction
    public void save(Student theStudent) {
        // Save the student in the database
        entityManager.persist(theStudent);
    }

}
