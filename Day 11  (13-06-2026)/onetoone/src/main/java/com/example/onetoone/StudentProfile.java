package com.example.onetoone;
import jakarta.persistence.*;



@Entity
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
   @OneToOne(mappedBy = "profile")
    private Student student;
}