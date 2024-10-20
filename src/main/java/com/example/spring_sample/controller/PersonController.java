package com.example.spring_sample.controller;

import com.example.spring_sample.model.Book;
import com.example.spring_sample.model.Person;
import com.example.spring_sample.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class PersonController {

  PersonService personService;

  @GetMapping
  public List<Person> getPersons() {
    return personService.getPersons();
  }

  @GetMapping("/{id}")
  public Person getPerson(@PathVariable Integer id) {
    return personService.getPerson(id);
  }

  @PostMapping
  public Person createPerson(@RequestBody Person person) {
    return personService.createPerson(person);
  }

  @PutMapping("/{id}")
  public Person updatePerson(@PathVariable Integer id, @RequestBody Person person) {
    return personService.updatePerson(id, person);
  }

  @DeleteMapping("/{id}")
  public void deleteBook(@PathVariable Integer id) {
    personService.deletePerson(id);
  }
}
