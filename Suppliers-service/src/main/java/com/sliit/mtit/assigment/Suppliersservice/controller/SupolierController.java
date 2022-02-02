package com.sliit.mtit.assigment.Suppliersservice.controller;

import com.sliit.mtit.assigment.Suppliersservice.dto.SupplierRequest;
import com.sliit.mtit.assigment.Suppliersservice.dto.SupplierResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/suppliers")
public class SupolierController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody SupplierResponse createSuppliers(@RequestBody SupplierRequest request){

        System.out.println("Supplier Details:"+request);

        var supplierResponse = new SupplierResponse();
        supplierResponse.setSupplierId(UUID.randomUUID().toString());
        supplierResponse.setMessage("order is successfully sent to supplier");

        return supplierResponse;
    }
}
