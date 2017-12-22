package com.example.demo;


import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Study2Application {

    public static void main(String[] args) {
/*		SpringApplication app = new SpringApplication(Study2Application.class);
        app.setBannerMode(Banner.Mode.OFF);
		app.run(args);*/

        new SpringApplicationBuilder()
                .sources(Parent.class)
                .child(Study2Application.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
