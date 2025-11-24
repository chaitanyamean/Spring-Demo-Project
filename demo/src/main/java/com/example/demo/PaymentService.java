package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {


    public void getPayment() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("After bean init");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("Before Destroy");
    }
}
