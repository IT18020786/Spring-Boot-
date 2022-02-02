package com.sliit.mtit.assigment.inventorservice.dto;

public class InventoryRequest {
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
        return "InventoryRequest{" +
                "orderType='" + orderType + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                '}';
    }
}
