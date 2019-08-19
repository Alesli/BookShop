package com.project.service;

import com.project.dto.UserBookDto;
import com.project.entity.Book;

public interface BookService {

    Book findBooksByIdFromShop(Integer bookId);

}
