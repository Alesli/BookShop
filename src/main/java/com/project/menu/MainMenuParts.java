package com.project.menu;

import com.project.dto.BookDto;
import com.project.dto.ShopDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainMenuParts {

    String getName() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");

        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    String checkPassword(String name) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hi " + name + ", please enter your pass: ");
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    Long getShop(List<ShopDto> shopDtoList) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please, choose shop:");
            for (ShopDto shopDto : shopDtoList) {
                System.out.println(shopDto.getId() + " - " + shopDto.getName());
            }
            System.out.print("Please, enter SHOP ID: ");
            try {
                return Long.parseLong(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("Please, enter digit...");
            }
        }
    }

    Long showAllBooksByShop(List<BookDto> bookDtoList) {
        return show(bookDtoList);
    }

    Long showAllUserBooks(List<BookDto> bookUserList) {
       return show(bookUserList);
    }

    private Long show(List<BookDto> bookDtoList){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please, choose book:");
            for (BookDto bookDto : bookDtoList) {
                System.out.println(bookDto.getId() + " - " + bookDto.getName());
            }
            System.out.print("Please, enter BOOK ID: ");
            try {
                return Long.parseLong(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("Please, enter digit...");
            }
        }
    }
    Integer getMenuItems() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please choose menu item:\n" +
                    "1 - Show all books in shop\n" +
                    "2 - Show all my books\n" +
                    "3 - Buy new book\n" +
                    "4 - Show my balance\n" +
                    "0 - exit");
            try {
                int item = Integer.parseInt(bufferedReader.readLine());
                if (item == 0 || item < 0 || item > 4) {
                    System.exit(0);
                } else {
                    return item;
                }
            } catch (IOException e) {
                System.out.println("Please, enter digit...");
            }
        }
    }
}
