package com.project.repository;

import com.project.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findBookByName(String name);

    @Query(value = "select DISTINCT * from book b, shop_book sb, shop s where b.id = sb.book_id and b.id=:bookid", nativeQuery = true)
    Book findBooksByIdFromShop(@Param("bookid")Integer bookId);
}
