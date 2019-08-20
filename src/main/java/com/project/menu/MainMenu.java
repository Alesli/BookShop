package com.project.menu;

import com.project.dto.UserDto;
import com.project.facade.ShopFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainMenu {

    @Autowired
    private ShopFacade shopFacade;

    public void mainMenu() {

//        MainMenuParts mainMenuParts = new MainMenuParts();
//        int shopId;
//
//        String name = mainMenuParts.getName();
//        UserDto userDto = shopFacade.findOneUserByName(name);
//        if (userDto != null) {
//            String pass = mainMenuParts.checkPassword(name);
//            if (userDto.getPass().equals(pass)) {
//
//                if (shopFacade.countShops() > 1) {
//                    shopId = mainMenuParts.getShop(shopFacade.findAllShops()); // магазов может не быть, косяк
//                } else {
//                    shopId = shopFacade.findAllShops().get(0).getId();
//
//                    // весь этот бред надо еще и в цикл, чтобы юзер мог постоянно книги покупать
//
//                    int menuItem = mainMenuParts.getMenuItems();
//                    switch (menuItem) {
//                        case 1:
//                            List<Book> bookShopList = shopFacade.findAllShopsBooks(shopId); // подправить метод
//                            mainMenuParts.showAllShopBooks(bookShopList); // должен вернуть id выбранной книги
//                            break;
//                        case 2:
//                            List<Book> bookUserList = shopFacade.findAllUsersBooks(userDto.getId()); // подправить метод
//                            mainMenuParts.showAllUserBooks(bookUserList);
//                            break;
//                        case 3:
//                            /*
//                             тут самое интересное
//                             shopId уже есть
//                             userId уже есть
//                             осталось только книгу выбрать
//                             и отправить все это в метод продажи
//                            */
//                            break;
//                        case 4:
//                            System.out.println("Your balance: " + userDto.getCash());
//                            break;
//                    }
//                }
//
//                /*
//                 * выясняем количество магазинов, если один, то выкидываем главное меню
//                 * если больше, то предлагаем выбрать магазин, и только затем выкидываем главное меню
//                 */
//
//            } else {
//                System.out.println("Sorry, your pass is not correct");
//            }
//        } else {
//            System.out.println("Sorry, your name is not correct");
//        }
    }
}
