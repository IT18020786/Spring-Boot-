package com.sliit.mtit.assigment.inventorservice.service;

import com.sliit.mtit.assigment.inventorservice.dto.InventoryRequest;
import com.sliit.mtit.assigment.inventorservice.dto.InventoryResponse;
import com.sliit.mtit.assigment.inventorservice.dto.SupplierCreationRequest;
import com.sliit.mtit.assigment.inventorservice.dto.SupplierCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class InventoryServiceImpl  {

    @Autowired
    private RestTemplate restTemplate;
    public InventoryResponse createInventory(InventoryRequest inventoryRequest){

        var supplierCreationRequest = new SupplierCreationRequest();
        supplierCreationRequest.setOrderAmount(inventoryRequest.getOrderAmount());
        supplierCreationRequest.setOrderType(inventoryRequest.getOrderType());

        ResponseEntity<SupplierCreationResponse> supplierCreationResponse =  restTemplate.postForEntity("http://localhost:8071/suppliers",supplierCreationRequest, SupplierCreationResponse.class);

        var inventoryResponse = new InventoryResponse();
        inventoryResponse.setInventoryId(UUID.randomUUID().toString());
        inventoryResponse.setMessage("Inventory successfully sent");
        inventoryResponse.setSupplierId(supplierCreationResponse.getBody().getSupplierId());

        return inventoryResponse;

    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
