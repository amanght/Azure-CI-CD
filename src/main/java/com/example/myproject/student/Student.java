package com.example.myproject.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Integer Age;
    private String email;
    private LocalDate dob;
}
