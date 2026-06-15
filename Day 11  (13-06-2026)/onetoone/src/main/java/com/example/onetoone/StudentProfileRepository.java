package com.example.onetoone;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {}