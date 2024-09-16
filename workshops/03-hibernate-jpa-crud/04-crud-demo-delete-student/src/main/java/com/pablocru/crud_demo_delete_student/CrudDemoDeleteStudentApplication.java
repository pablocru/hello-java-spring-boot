package com.pablocru.crud_demo_delete_student;

import com.pablocru.crud_demo_delete_student.dao.StudentDAO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoDeleteStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoDeleteStudentApplication.class, args);
    }

    // Function to execute the project from the command line. It will be executed
    // after the Spring Beans hae been loaded
    @Bean
    CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        // Java Lambda Expression that works like a shortcut notation for providing an
        // implementation of the command line runner
        return runner -> {
            // deleteStudent(studentDAO);

            deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting all students...");
        int numRowsDeleted = studentDAO.deleteAll();
        System.out.println("Deleted row count: " + numRowsDeleted);
    }

    @SuppressWarnings("unused")
    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 4;
        System.out.println("Deleting student id: " + studentId);
        studentDAO.delete(studentId);
    }

}
