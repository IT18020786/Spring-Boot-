package com.sliit.mtit.assigment.UserLoginservice.controller;

import com.sliit.mtit.assigment.UserLoginservice.dto.LoginRequest;
import com.sliit.mtit.assigment.UserLoginservice.dto.LoginResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/login")
public class UserLoginController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody LoginResponse createLogin(@RequestBody LoginRequest request){

        System.out.println("login Details:"+request);
        var loginResponse = new LoginResponse();
        loginResponse.setLoginId(UUID.randomUUID().toString());
        loginResponse.setMessage("Successfully login");

        return loginResponse;
    }
}
