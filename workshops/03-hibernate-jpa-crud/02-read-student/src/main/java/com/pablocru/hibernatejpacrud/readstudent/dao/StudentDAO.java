package com.pablocru.hibernatejpacrud.readstudent.dao;

import com.pablocru.hibernatejpacrud.readstudent.entity.Student;
import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

}
