package com.sliit.mtit.assigment.Cartservice.dto;

public class CartRequest {

    private String orderType;
    private String orderAmount;
    private String paymentType;
    private String address;

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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CartRequest{" +
                "orderType='" + orderType + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
