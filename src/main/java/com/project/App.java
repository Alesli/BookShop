package com.project;

import com.project.entity.Book;
import com.project.entity.Shop;
import com.project.entity.User;
import com.project.facade.ShopFacade;
import com.project.menu.MainMenu;
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

    private Shop shop;
    private User user;
    private Book book;
    private boolean signIn = false;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n\n\n\n\n\n\n\n\nWelcome!!!\n\n");

        MainMenu mainMenu = new MainMenu();

        for (int n = 0; n < 3; n++) {
            String name = mainMenu.getName();
            if (name.length() == 0) {
                exit();
            } else {
                User user = shopFacade.findOneUserByName(name);
                if (user != null) {
                    setUser(user);
                    break;
                } else {
                    System.out.println((n + 1) + " - Sorry, your name is not correct");
                }
            }
        }

        if (getUser() == null) {
            exit();
        }

        for (int p = 0; p < 3; p++) {
            String pass = mainMenu.checkPassword(user.getName());
            if (pass.length() == 0) {
                exit();
            } else {
                if (user.getPass().equals(pass)) {
                    signIn = true;
                    break;
                } else {
                    System.out.println((p + 1) + " - Sorry, your pass is not correct");
                }
            }
        }

        if (signIn) {

            List<Shop> shopList = shopFacade.findAllShops();
            if (shopList.isEmpty()) {
                System.out.println("Sorry, all shops is not available");
                exit();
            }
            if (shopList.size() > 1) {
                Long shopId = mainMenu.getShop(shopList);
                Shop shop = shopFacade.findOneShopById(shopId);
                setShop(shop);
            } else {
                setShop(shopList.get(0));
            }
            // todo: попробовать в обернуть в цикл, чтобы юзер мог постоянно книги покупать

            while (true) {
                int menuItem = mainMenu.getMenuItems();
                switch (menuItem) {
                    case 0:
                        exit();
                        break;
                    case 1:
                        List<Book> bookShopList = shopFacade.findAllShopsBooks(getShop().getId());
                        Long bookId = mainMenu.showAllShopBooks(bookShopList);
                        Book book = shopFacade.findOneBookById(bookId);
                        setBook(book);
                        break;
                    case 2:
                        List<Book> bookUserList = shopFacade.findAllUsersBooks(user.getId());
                        mainMenu.showAllUserBooks(bookUserList);
                        break;
                    case 3:

                        // это только пример, надо получить id книги из пункта 1, иначе, просто вызвать его

                        shopFacade.saleBook(1L, 1L, 1L);
                        List<Book> basket = shopFacade.findAllUsersBooks(user.getId());
                        mainMenu.showAllUserBooks(basket);

                        // вот тут есть робкая попытка уточнить, выбрана ли книга
//                         if (getBook() != null) {
//                             shopFacade.saleBook(getShop().getId(), getUser().getId(), getBook().getId());
//                         }
                        break;
                    case 4:
                        User user = shopFacade.findOneUserById(getUser().getId());
                        setUser(user);
                        System.out.println("Your balance: " + getUser().getCash());
                        break;
                    default:
//                         System.out.println("Please, enter digits only...");
                        break;
                }
            }

            /*
             * выясняем количество магазинов, если один, то выкидываем главное меню
             * если больше, то предлагаем выбрать магазин, и только затем выкидываем главное меню
             */
        } else {
            exit();
        }
    }

    private void exit() {
        System.out.println("\n\nBay bay!!!\n\n\n\n\n\n\n\n\n");
        System.exit(0);
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
