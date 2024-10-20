package com.example.spring_sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Getter
@Setter
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;
  String name;
  String email;
}
