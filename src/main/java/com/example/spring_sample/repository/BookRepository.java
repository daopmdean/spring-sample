package com.example.spring_sample.repository;

import com.example.spring_sample.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
