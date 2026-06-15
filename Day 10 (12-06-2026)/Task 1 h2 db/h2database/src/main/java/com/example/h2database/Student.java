package com.example.h2database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Student(){}
    public Student(String name){
        this.name= name;}
    public Long getId(){return id;}
    public String getName(){return name;}
}
//public Student(){} -> required byJPA(Hibernate uses it internally).
//public Student(String name) -> convenience constructor for quick object creation.