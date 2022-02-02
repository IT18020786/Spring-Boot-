package com.sliit.mtit.assigment.Accountservice.controller;

import com.sliit.mtit.assigment.Accountservice.dto.AccountRequest;
import com.sliit.mtit.assigment.Accountservice.dto.AccountResponse;
import com.sliit.mtit.assigment.Accountservice.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;
    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody AccountResponse createAccount(@RequestBody AccountRequest request){

        System.out.println("User Details:"+request);


        return accountService.createAccount(request);
    }
}
