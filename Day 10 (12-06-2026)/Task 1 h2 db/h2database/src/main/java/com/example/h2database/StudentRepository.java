package com.example.h2database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
//JpaRepository <Student,Long>
// JpaRepository is a Spring Data JPA interface that already has all the common CRUD methods built in.
// *By extending it,your StudentRepository automatically gets methods like:
//save(Student s) -> insert/update a student
//findAll() -> get all students
//ffind