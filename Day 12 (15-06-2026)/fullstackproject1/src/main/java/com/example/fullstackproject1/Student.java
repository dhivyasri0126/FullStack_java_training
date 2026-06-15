package com.example.fullstackproject1;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "students")
@Data
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private Long id;
    @Column(name="student_name", nullable= false,length = 100)
    private String name;
    @Column(name = "department", nullable = false,length=100)
    private String dept;
   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;
}
