package com.example.libary.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
    @Override
    List<Book> findAll();
    List<Book> findBookByGenreIs(String g);
    List<Book> findBookByAuthor(String a);
    List<Book> findBookByTitle( String t);
}
