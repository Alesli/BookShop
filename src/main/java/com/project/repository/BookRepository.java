package com.project.repository;

import com.project.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findBookByName(String name);

    List<Book> findAll();

    @Query(value = "select distinct * from book b, shop_book sb, shop s where b.id = sb.book_id and b.id=:bookid", nativeQuery = true)
    Book findBooksByIdFromShop(@Param("bookid") Integer bookId);

}
