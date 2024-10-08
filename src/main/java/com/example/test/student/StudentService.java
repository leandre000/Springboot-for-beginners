package com.example.test.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {

        return List.of(
                new Student(
                        "shema",
                        "Leandre",
                        LocalDate.now(),
                        "iamshemaleandre@gmail.com",
                        17
                ),
                new Student(
                        "student2",
                        "Honore",
                        LocalDate.now(),
                        "nihonor@gmail.com",
                        16
                )
        );

    }
}
