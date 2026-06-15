package com.example.postgresdemo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class NameController {

    private final NameRepository repo;

    public NameController(NameRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Name> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Name add(@RequestBody Name n) {
        return repo.save(n);
    }
}

@Entity
class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Repository
interface NameRepository extends JpaRepository<Name, Long> {
}