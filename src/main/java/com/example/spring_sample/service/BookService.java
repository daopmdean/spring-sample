package com.example.spring_sample.service;

import com.example.spring_sample.model.Book;
import com.example.spring_sample.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class BookService {

  BookRepository bookRepository;

  public List<Book> getBooks() {
    return bookRepository.findAll();
  }

  public Book getBook(String id) {
    Optional<Book> opt = bookRepository.findById(id);
    return opt.orElse(null);
  }

  public Book createBook(Book book) {
    bookRepository.save(book);
    return book;
  }

  public Book updateBook(String id, Book book) {
    book.setId(id);
    bookRepository.save(book);
    return book;
  }

  public void deleteBook(String id) {
    bookRepository.deleteById(id);
  }
}
