package com.pablocru.hibernatejpacrud.deletestudent.dao;

import com.pablocru.hibernatejpacrud.deletestudent.entity.Student;
import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();

}
