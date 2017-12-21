package com.example.demo;


import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
}
