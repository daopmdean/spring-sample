package com.example.spring_sample.service;

import com.example.spring_sample.model.Person;
import com.example.spring_sample.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class PersonService {

  PersonRepository personRepository;

  public List<Person> getPersons() {
    return personRepository.findAll();
  }

  public Person getPerson(Integer id) {
    Optional<Person> opt = personRepository.findById(id);
    return opt.orElse(null);
  }

  public Person createPerson(Person person) {
    personRepository.save(person);
    return person;
  }

  public Person updatePerson(Integer id, Person person) {
    person.setId(id);
    personRepository.save(person);
    return person;
  }

  public void deletePerson(Integer id) {
    personRepository.deleteById(id);
  }
}
