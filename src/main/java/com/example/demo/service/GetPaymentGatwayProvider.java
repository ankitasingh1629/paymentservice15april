package com.example.demo.service;

import com.razorpay.RazorpayClient;
import org.springframework.stereotype.Service;

@Service
public class GetPaymentGatwayProvider {
    private RazorPayPaymentGateWayProvider razorPayPaymentGateWayProvider;

    public GetPaymentGatwayProvider(RazorPayPaymentGateWayProvider razorPayPaymentGateWayProvider) {
        this.razorPayPaymentGateWayProvider = razorPayPaymentGateWayProvider;
    }

    public  PaymentGatwayProvider getPaymentGatwayProvider(){
        return razorPayPaymentGateWayProvider;
    }
}
