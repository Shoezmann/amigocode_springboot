package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Miriam",
                        "miriam.jamal@gmail.com",
                        LocalDate.of(1999, Month.AUGUST,12),
                        4)
        );
    }
}
