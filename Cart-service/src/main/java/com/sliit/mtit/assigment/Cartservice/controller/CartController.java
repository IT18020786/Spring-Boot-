package com.sliit.mtit.assigment.Cartservice.controller;

import com.sliit.mtit.assigment.Cartservice.dto.CartRequest;
import com.sliit.mtit.assigment.Cartservice.dto.CartResponse;
import com.sliit.mtit.assigment.Cartservice.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartServiceImpl cartService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CartResponse createCart(@RequestBody CartRequest request){

        System.out.println("Cart Order Details:"+request);


        return cartService.createCart(request);
    }
}

