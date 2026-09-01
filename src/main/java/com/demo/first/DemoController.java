package com.demo.first;

import com.demo.first.app.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //added prefix to every mapping (ex: http://localhost:8080/api/user)
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, World";
    }

//    @GetMapping("/user") //shortcut for below requestmapping annotation
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        User user = new User(101, "shubham", "shu@gmail.com");
        return user;
    }
}
