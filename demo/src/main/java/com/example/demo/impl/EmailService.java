package com.example.demo.impl;

import com.example.demo.NotificationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmailService implements NotificationService {

    @Override
    public String sendMessage() {
        return "Email Notification";
    }
}
