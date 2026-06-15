package com.example.studentprofiledemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Student {
        @PostMapping("/students")
        public UserProfile addStudent(@RequestBody UserProfile student) {
            
            return student;
        }
        

}
