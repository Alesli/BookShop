package com.project;

import com.project.dto.UserDto;
import com.project.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

        @Override
    public void run(String... args) throws Exception {
            ShopLogic shopLogic = new ShopLogic();
            shopLogic.getMainMenu();
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void testJpaMethods() {
//        userFacade.findAll().forEach(System.out::println);

//        UserDto user = userFacade.findOneByPass("pass123");
//        System.out.println(user);

//       BookShopDto bookShopDto = shopFacade.findBooksByIdFromShop(6);
//        System.out.println(bookShopDto);
//    }
}
