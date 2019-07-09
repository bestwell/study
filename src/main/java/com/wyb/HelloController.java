package com.wyb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello spring boot ,I am comming"+name;
    }

}
