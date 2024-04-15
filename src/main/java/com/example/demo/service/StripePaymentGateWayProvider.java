package com.example.demo.service;

import com.example.demo.model.PaymentStatus;

public class StripePaymentGateWayProvider implements PaymentGatwayProvider{
    @Override
    public String createPaymentLink(Long amount, String username, String useremail, String userphoneNumber,Long orderId) {
        return null;
    }

    @Override
    public PaymentStatus getPaymentStatus(Long paymentId) {
        return null;
    }
}
