package com.example.onetoone;

import jakarta.persistence.*;



@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "profile_id")   // FK in student table
    private StudentProfile profile;
}

