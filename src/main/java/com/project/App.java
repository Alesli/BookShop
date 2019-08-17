package com.project;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);

        //отключаем баннер spring boot, если не хотим видеть его лог в консоли
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//        if (args.length > 0) {
//            System.out.println();
//        } else {
//            System.out.println();
//        }
        exit(0); // завершаем программу
    }

}
