package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
public class Payment extends BaseModel{
    private Long amount;
    private PaymentStatus paymentStatus;
    private Long orderId;
    private Long userId;
    private PaymentGatway paymentGatway;
    private String paymentGatwayReferenceId;
    private String paymentLink;
}
