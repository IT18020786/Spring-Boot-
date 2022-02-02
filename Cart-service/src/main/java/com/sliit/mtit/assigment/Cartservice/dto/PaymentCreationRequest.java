package com.sliit.mtit.assigment.Cartservice.dto;

public class PaymentCreationRequest {

    private String address;
    private String paymentType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
