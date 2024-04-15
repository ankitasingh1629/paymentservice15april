package com.example.demo.configuation;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
//import lombok.Value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayConfig {
    @Value("${razorpay.key_id}")
    private String secretKeyId;
    @Value("${razorpay.key_secret}")
    private String secretKey;
    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        RazorpayClient razorpayClient = new RazorpayClient(secretKeyId,secretKey);
        return razorpayClient;
    }
}
