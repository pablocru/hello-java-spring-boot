package com.pablocru.crud_demo_update_student;

import com.pablocru.crud_demo_update_student.dao.StudentDAO;
import com.pablocru.crud_demo_update_student.entity.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoUpdateStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoUpdateStudentApplication.class, args);
    }

    // Function to execute the project from the command line. It will be executed
    // after the Spring Beans hae been loaded
    @Bean
    CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        // Java Lambda Expression that works like a shortcut notation for providing an
        // implementation of the command line runner
        return runner -> {
            updateStudent(studentDAO);
        };
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 4;
        System.out.println("Getting student with id: " + studentId);
        Student myStudent = studentDAO.findById(studentId);

        System.out.println("Updating student...");
        myStudent.setFirstName("Mary");
        studentDAO.update(myStudent);

        System.out.println("Updated student: " + myStudent);
    }

}
