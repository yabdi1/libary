package com.example.libary;
import com.example.libary.book.Book;
import com.example.libary.book.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.springframework.test.annotation.Rollback;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class LibaryApplicationTests {
	@Autowired
	private BookRepository repo;

	@Autowired
	private TestEntityManager entityManager;


	@Test
	public void testCreateUser(){
		Book b =new Book();
		b.setAuthor("Jacqueline Wilson");
		b.setTitle("Tracey Beaker");
		b.setGenre("drama");
		b.setPrice(10.99f);
		repo.save(b);











	}
	@Test
	public void testChecknotnull(){






	}















}