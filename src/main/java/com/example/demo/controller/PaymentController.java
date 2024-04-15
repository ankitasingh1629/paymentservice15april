package com.example.demo.controller;

import com.example.demo.dtos.CreatePaymentLinkDto;
import com.example.demo.dtos.CreatePaymentLinkResponseDto;
import com.example.demo.model.PaymentStatus;
import com.example.demo.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping()
    public CreatePaymentLinkResponseDto createPaymentLink(@RequestBody CreatePaymentLinkDto createPaymentLinkDto){
        String redirectUrl = paymentService.createPaymentLink(createPaymentLinkDto.getOrderId());
        CreatePaymentLinkResponseDto response = new CreatePaymentLinkResponseDto();
        response.setUrl(redirectUrl);
        return response;
    }
    @GetMapping("{id}")
    public PaymentStatus getPaymentStatus(@PathVariable("id") Long paymentId){
        return paymentService.getPaymentStatus(paymentId);
    }

}
