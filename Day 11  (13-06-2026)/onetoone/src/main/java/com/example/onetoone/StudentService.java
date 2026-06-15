package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired private StudentRepository studentRepo;
    public Student save(Student s) { return studentRepo.save(s); }
    public List<Student> findAll() { return studentRepo.findAll(); }
}