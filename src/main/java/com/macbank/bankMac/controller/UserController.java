package com.macbank.bankMac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/konto")
    public String accountBalance(){
        return "account";
    }
}
