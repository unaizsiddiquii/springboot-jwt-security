package com.unaiz.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api")
public class UserController {

    @GetMapping("/user")
    public String userAccess() {
        return "Welcome USER — you can access user endpoint!";
    }
}
