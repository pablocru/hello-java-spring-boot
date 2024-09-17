package com.pablocru.hibernatejpacrud.createdbtablesautomatically.dao;

import com.pablocru.hibernatejpacrud.createdbtablesautomatically.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
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

    @Override
    // `@Transactional` is not needed because this operation is readonly
    public Student findById(Integer id) {
        // `find` method needs an Entity Class and its primary key.
        return entityManager.find(Student.class, id);
    }

    @Override
    // `@Transactional` is not needed because this operation is readonly
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "FROM Student ORDER BY lastName DESC",
                // `Student` is the name of the Entity, not the DB Table
                // `lastName` is the filed of the Entity too
                Student.class);

        return theQuery.getResultList();
    }

    @Override
    // `@Transactional` is not needed because this operation is readonly
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "FROM Student WHERE lastName=:theData",
                // `:theData` is a Named Parameter. It is like a placeholder
                Student.class);

        theQuery.setParameter("theData", theLastName);

        return theQuery.getResultList();
    }

    @Override
    @Transactional // Needed because its an update of the database
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional // Needed because its going to remove something from the database
    public void delete(Integer id) {
        Student theStudent = entityManager.find(Student.class, id);

        entityManager.remove(theStudent);
    }

    @Override
    @Transactional // Needed because its going to delete an entire table from the database
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery(
                "DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }

}
