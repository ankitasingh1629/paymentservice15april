package com.example.demo.service;

import com.example.demo.model.PaymentStatus;

public interface PaymentGatwayProvider {
    public String createPaymentLink(Long amount, String username, String useremail, String userphoneNumber,Long orderId);
    public PaymentStatus getPaymentStatus(Long paymentId);
}
