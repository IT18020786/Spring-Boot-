package com.sliit.mtit.assigment.Cartservice.service;

import com.sliit.mtit.assigment.Cartservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CartServiceImpl {

    @Autowired
    private RestTemplate restTemplate;
    public CartResponse createCart(CartRequest cartRequest) {

        var paymentCreationRequest = new PaymentCreationRequest();
        paymentCreationRequest.setAddress(cartRequest.getAddress());
        paymentCreationRequest.setPaymentType(cartRequest.getPaymentType());


        ResponseEntity<PaymentCreationResponse> paymentCreationResponse = restTemplate.postForEntity("http://localhost:8090/payment", paymentCreationRequest, PaymentCreationResponse.class);

        var shippingCreationRequest = new ShippingCreationRequest();
        shippingCreationRequest.setAddress(cartRequest.getAddress());
        shippingCreationRequest.setOrderAmount(cartRequest.getOrderAmount());
        shippingCreationRequest.setOrderType(cartRequest.getOrderType());

        ResponseEntity<ShippingCreationResponse> shippingCreationResponse =  restTemplate.postForEntity("http://localhost:8183/ship",shippingCreationRequest,ShippingCreationResponse.class);

        var cartResponse = new CartResponse();
        cartResponse.setCartOrderId(UUID.randomUUID().toString());
        cartResponse.setMessage("Order successfully added to the cart");
        cartResponse.setPaymentId(paymentCreationResponse.getBody().getPaymentId());
        cartResponse.setShippingId(shippingCreationResponse.getBody().getShippingId());

        return cartResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}

