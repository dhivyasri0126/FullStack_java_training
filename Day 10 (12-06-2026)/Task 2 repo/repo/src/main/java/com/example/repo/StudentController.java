package com.example.repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repo = new StudentRepository();
    @GetMapping
    public List<Student> getStudents(){
        return repo.findAll();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s) {
        repo.save(s);
        return s;
    }
    

}
