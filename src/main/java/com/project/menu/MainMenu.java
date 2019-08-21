package com.project.menu;

import com.project.entity.Book;
import com.project.entity.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainMenu {

    public String getName() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------------------------------------------------------\n" +
                "Please enter your name:");
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String checkPassword(String name) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------------------------------------------------------\n" +
                "Hi '" + name + "', please enter your pass:");
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Long getShop(List<Shop> shopList) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("----------------------------------------------------------------\n" +
                    "Please, choose shop:");
            for (Shop shop : shopList) {
                System.out.println(shop.getId() + " - " + shop.getName());
            }
            System.out.println("Please, enter SHOP ID: ");
            try {
                return Long.parseLong(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("Please, enter digits only...");
            }
        }
    }

    // todo: продумать на ввод неверного числа
    public Integer getMenuItems() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------------------------------------------------------\n" +
                "Please choose menu item:\n" +
                "1 - Show all books in shop\n" +
                "2 - Show all my books\n" +
                "3 - By new book\n" +
                "4 - Show my balance\n" +
                "0 - exit");
        try {
            // todo: обработать ошибку ввода не чисел
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Please, enter digits only...");
        }
        return 0;
    }

    public Long showAllShopBooks(List<Book> bookList) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("----------------------------------------------------------------\n" +
                    "Please, choose book:");
            for (Book book : bookList) {
                System.out.println(book.getId() + " - " + book.getName() + ", " + book.getCost() + "$, " + book.getDescription());
            }
            System.out.println("Please, enter BOOK ID: ");
            try {
                return Long.parseLong(bufferedReader.readLine());
            } catch (IOException e) {
                System.out.println("Please, enter digits only...");
            }
        }
    }

    public void showAllUserBooks(List<Book> bookList) {
        System.out.println("----------------------------------------------------------------\n" +
                "Its all your books:");
        for (Book book : bookList) {
            System.out.println(book.getId() + " - " + book.getName() + ", " + book.getCost() + "$, " + book.getDescription());
        }
    }
}
