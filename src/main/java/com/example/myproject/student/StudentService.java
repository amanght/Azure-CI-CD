package com.example.myproject.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Amanuel",
                        24,
                        "Amanuel@microsoft.com",
                        LocalDate.of(1998, Month.SEPTEMBER,22))
        );
    }
}
