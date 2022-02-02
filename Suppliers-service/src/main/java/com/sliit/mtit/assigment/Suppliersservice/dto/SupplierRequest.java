package com.sliit.mtit.assigment.Suppliersservice.dto;

public class SupplierRequest {

    private String orderType;
    private String orderAmount;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "SupplierRequest{" +
                "orderType='" + orderType + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                '}';
    }
}
