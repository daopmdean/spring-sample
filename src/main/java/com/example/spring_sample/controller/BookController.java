package com.example.spring_sample.controller;

import com.example.spring_sample.model.Book;
import com.example.spring_sample.service.BookService;
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
@RequestMapping("/books")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class BookController {

  BookService bookService;

  @GetMapping
  public List<Book> getBooks() {
    return bookService.getBooks();
  }

  @GetMapping("/{id}")
  public Book getBook(@PathVariable String id) {
    return bookService.getBook(id);
  }

  @PostMapping
  public Book createBook(@RequestBody Book book) {
    return bookService.createBook(book);
  }

  @PutMapping("/{id}")
  public Book updateBook(@PathVariable String id, @RequestBody Book book) {
    return bookService.updateBook(id, book);
  }

  @DeleteMapping("/{id}")
  public void deleteBook(@PathVariable String id) {
    bookService.deleteBook(id);
  }
}
