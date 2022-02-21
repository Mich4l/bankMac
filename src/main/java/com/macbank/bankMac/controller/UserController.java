package com.macbank.bankMac.controller;

import com.macbank.bankMac.model.ReadUserResponse;
import com.macbank.bankMac.service.UserDetailsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userService;

    public UserController(UserDetailsServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/konto")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/konto/{id}")
    public ReadUserResponse getUserInfo(@PathVariable(name = "id") Long id) {
        return userService.readUserResponse(id);
    }
}
