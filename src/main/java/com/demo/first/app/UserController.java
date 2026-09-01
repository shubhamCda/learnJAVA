package com.demo.first.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
public class UserController {

    private Map<Integer, User> userDb = new HashMap<>();

    @PostMapping
    public String createUser(@RequestBody User user){
        userDb.put(user.getId(), user);
        return "User Created!";
    }
}
