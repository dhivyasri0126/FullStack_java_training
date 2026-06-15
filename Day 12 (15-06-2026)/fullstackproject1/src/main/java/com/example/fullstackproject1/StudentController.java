package com.example.fullstackproject1;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping
    public Student create(@RequestBody Student s){
        return service.save(s);
    }
    @GetMapping
    public List<Student> all(){
        return service.all();
    }

}
