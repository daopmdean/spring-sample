package com.example.spring_sample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Getter
@Setter
@Document(collection = "books")
public class Book {
  @Id
  String id;
  String title;
  String author;
  Date publishedDate;
}
