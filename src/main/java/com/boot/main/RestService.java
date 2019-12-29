package com.boot.main;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestService{

    @RequestMapping("/")
    public String index(){

        return "Welcome to spring boot data load";

    }

}
