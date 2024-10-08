package com.example.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {




    private StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllStudents() {

        return service.findAllStudents();



    }
}
