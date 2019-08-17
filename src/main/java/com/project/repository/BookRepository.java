package com.project.repository;

import com.project.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookByName(String name);

    List<Book> findBookByAuthor(String name);


}
