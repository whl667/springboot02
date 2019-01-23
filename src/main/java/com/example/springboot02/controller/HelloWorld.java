package com.example.springboot02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello-world";
    }
    @RequestMapping("/hello2")
    public String helloWorld02(){
        return "hello-world02";
    }
    @RequestMapping("/hello3")
    public String helloWorld03(){
        System.out.println("测试");
        return "hello-world03";
    }
    @RequestMapping("/hello4")
    public String helloWorld04(){
        System.out.println("生效了么?");
        return "hello-world04";

    }
    @RequestMapping("/hello5")
    public String helloWorld05(){
        System.out.println("生效了么?");
        return "hello-world05";

    }


}
