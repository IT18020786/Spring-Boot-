package com.sliit.mtit.assigment.inventorservice.controller;

import com.sliit.mtit.assigment.inventorservice.dto.InventoryRequest;
import com.sliit.mtit.assigment.inventorservice.dto.InventoryResponse;
import com.sliit.mtit.assigment.inventorservice.service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/inventory")
public class inventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;
    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody InventoryResponse createInventory(@RequestBody InventoryRequest request){

        System.out.println("Inventory Details:"+request);


        return inventoryService.createInventory(request);
    }
}
