package com.project.menu;

import com.project.facade.ShopFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainMenu {

    @Autowired
    private ShopFacade shopFacade;
}
