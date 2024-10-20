package com.example.spring_sample.repository;

import com.example.spring_sample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Integer> {
}
