package com.project;

import com.project.dto.BookShopDto;
import com.project.dto.ShopBookDto;
import com.project.facade.ShopFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private ShopFacade shopFacade;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    //TODO: определиться с какой dto работаем
        @Override
    public void run(String... args) throws Exception {

            List<BookShopDto> bookList = shopFacade.findAllShopsBooks();
            for (BookShopDto books : bookList) {
                System.out.println(books);
            }
    }
}
