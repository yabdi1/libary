package com.example.libary.book;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/application/")
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @GetMapping("genre")
    public List<Book> findByGenre(){
        return bookRepository.findBookByGenreIs("horror");


    }
    @GetMapping("author")
    public List<Book> findByAuthor(){
        return bookRepository.findBookByAuthor("william shakespeare");


    }
    @GetMapping("title")

    public List<Book> findBookByTitle(){
        return bookRepository.findBookByTitle("hunger games");


    }





    @GetMapping("books")
    public List<Book>findAllBooks(){
        return bookRepository.findAll();

    }}
