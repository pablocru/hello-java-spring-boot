package com.pablocru.crud_demo_read_student.dao;

import java.util.List;
import com.pablocru.crud_demo_read_student.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

}
