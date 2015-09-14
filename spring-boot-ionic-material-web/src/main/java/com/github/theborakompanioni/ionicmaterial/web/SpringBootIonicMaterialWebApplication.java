package com.github.theborakompanioni.ionicmaterial.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootIonicMaterialWebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringBootIonicMaterialWebApplication.class)
                .sources(CorsConfiguration.class)
                .web(true)
                .showBanner(true)
                .run(args);
    }
}
