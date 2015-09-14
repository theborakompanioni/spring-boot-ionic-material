package com.github.theborakompanioni.ionicmaterial.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by void on 14.09.15.
 */
@RestController
public class HelloCtrl {

    @RequestMapping("/hello")
    public String hello() {
        return "{ \"message\": \"Hello World!\" }";
    }
}
