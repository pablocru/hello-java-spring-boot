package com.pablocru.hibernatejpacrud.createstudent;

import com.pablocru.hibernatejpacrud.createstudent.dao.StudentDAO;
import com.pablocru.hibernatejpacrud.createstudent.entity.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoCreateStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoCreateStudentApplication.class, args);
    }

    // Function to execute the project from the command line. It will be executed
    // after the Spring Beans hae been loaded
    @Bean
    CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        // Java Lambda Expression that works like a shortcut notation for providing an
        // implementation of the command line runner
        return runner -> {
            createMultipleStudents(studentDAO);
        };
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating 3 student objects...");
        Student[] tempStudents = new Student[] {
                new Student(
                        "Pablo",
                        "Cru",
                        "pablocru@example.com"),
                new Student(
                        "Miguel",
                        "Cru",
                        "miguelcru@example.com"),
                new Student(
                        "Daniel",
                        "Morales",
                        "danimorales@example.com"),
        };

        System.out.println("Saving the students...");
        for (Student tempStudent : tempStudents) {
            studentDAO.save(tempStudent);
            System.out.println("Saved student. Generated id: " + tempStudent.getId());
        }

    }
}
