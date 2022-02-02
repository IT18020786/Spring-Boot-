package com.sliit.mtit.assigment.Accountservice.service;

import com.sliit.mtit.assigment.Accountservice.dto.AccountRequest;
import com.sliit.mtit.assigment.Accountservice.dto.AccountResponse;
import com.sliit.mtit.assigment.Accountservice.dto.LoginCreationRequest;
import com.sliit.mtit.assigment.Accountservice.dto.LoginCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class AccountServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public AccountResponse createAccount(AccountRequest accountRequest){
        var loginCreationRequest = new LoginCreationRequest();
        loginCreationRequest.setFullName(accountRequest.getFullNAme());
        loginCreationRequest.setAge(accountRequest.getAge());

        ResponseEntity<LoginCreationResponse> loginCreationResponse = restTemplate.postForEntity("http://localhost:8083/login",loginCreationRequest, LoginCreationResponse.class);


        var accountResponse = new AccountResponse();
        accountResponse.setUserId(UUID.randomUUID().toString());
        accountResponse.setMessage("Successfully User account created");
        accountResponse.setLoginId(loginCreationResponse.getBody().getLoginId());

        return accountResponse;
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
