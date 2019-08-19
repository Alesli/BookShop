package com.project;

import com.project.dto.UserDto;
import com.project.facade.ShopFacade;
import com.project.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopLogic {


    @Autowired
    private UserFacade userFacade;

    @Autowired
    private ShopFacade shopFacade;


    public void getMainMenu() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter user name(or enter 'exit'): ");

        String lineInput = bufferedReader.readLine();
        String lineInput1 = bufferedReader.readLine();
        String menuItem = "";
        String pass = "";
        try {
            menuItem = lineInput;
            pass = lineInput1;
//            System.out.println("You choice - " + menuItem);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        switch (menuItem) {
            case "exit":
                System.exit(0);
                break;
            case "Ivan":
                System.out.println("Hello Ivan! ");
                hello();
                break;

            case "Rita":
                System.out.println("Hello Rita! ");
//                findByPass("pass456");
                break;
            case "Alex":
                System.out.println("Hello Alex! ");
//                findByPass("pass789");
                break;
            case "Olga":
                System.out.println("Hello Olga! ");
//                findByPass("pass098");
                break;
            case "Michael":
                System.out.println("Hello Michael! ");
//                findByPass("michael123");
                break;
        }
    }

    private void hello() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ivan, enter your pass: ");

        String lineInput1 = bufferedReader.readLine();
        String pass = "";
        pass = lineInput1;

        switch (pass) {
            case "exit":
                System.exit(0);
                break;
            case "pass123":
                findByPass();
                break;
        }
    }

    public void findByPass() {
        UserDto user = userFacade.findOneByPass("pass123");
        System.out.println(user);
    }

}
