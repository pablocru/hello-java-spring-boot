package com.pablocru.crud_demo_read_student;

import com.pablocru.crud_demo_read_student.dao.StudentDAO;
import com.pablocru.crud_demo_read_student.entity.Student;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoReadStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoReadStudentApplication.class, args);
    }

    // Function to execute the project from the command line. It will be executed
    // after the Spring Beans hae been loaded
    @Bean
    CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        // Java Lambda Expression that works like a shortcut notation for providing an
        // implementation of the command line runner
        return runner -> {
            readStudent(studentDAO);
            System.out.println();

            queryForStudents(studentDAO);
            System.out.println();

            queryForStudentsByLastName(studentDAO);
        };
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        String lastName = "Doe";
        System.out.println("Retrieving any student whose last name is: " + lastName);
        List<Student> theStudents = studentDAO.findByLastName(lastName);

        displayStudents(theStudents);
    }

    private void queryForStudents(StudentDAO studentDAO) {
        System.out.println("Retrieving all students...");
        List<Student> theStudents = studentDAO.findAll();

        displayStudents(theStudents);
    }

    private void displayStudents(List<Student> theStudents) {
        for (Student myStudent : theStudents) {
            System.out.println(myStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object...");
        Student tempStudent = new Student(
                "Jane",
                "Doe",
                "janedoe@example.com");

        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);

        System.out.println("Retrieving student with id: " + theId);
        Student myStudent = studentDAO.findById(theId);

        System.out.println("Found: " + myStudent);
    }
}
