package com.sliit.mtit.assigment.Cartservice.dto;

public class CartResponse {

    private String cartOrderId;
    private String paymentId;
    private String shippingId;
    private  String message;

    public String getCartOrderId() {
        return cartOrderId;
    }

    public void setCartOrderId(String cartOrderId) {
        this.cartOrderId = cartOrderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }
}
