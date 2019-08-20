package com.project;

import com.project.dto.BookShopDto;
import com.project.dto.ShopBookDto;
import com.project.facade.ShopFacade;
import com.project.menu.MainMenu;
import com.project.menu.MainMenuParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = {"com.project.entity"})
@EnableJpaRepositories(basePackages = {"com.project.repository"})
public class App implements CommandLineRunner {

    @Autowired
    private ShopFacade shopFacade;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    //TODO: определиться с какой dto работаем
    @Override
    public void run(String... args) throws Exception {

//        List<ShopBookDto> shopBookDtoList = shopFacade.findAllShopsBooks();
//        for (ShopBookDto shops : shopBookDtoList) {
//            System.out.println(shops);
//        }
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
    }
}
