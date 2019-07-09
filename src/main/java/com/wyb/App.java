package com.wyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication//标识是一个springboot应用
public class App {
    public static void main( String[] args ){
        
        //启动springAppliction程序
        SpringApplication.run(App.class,args);
    }
}
