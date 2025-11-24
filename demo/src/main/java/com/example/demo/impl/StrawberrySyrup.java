package com.example.demo.impl;

import com.example.demo.Syrup;
import org.springframework.stereotype.Component;

@Component("strawsyrup")
public class StrawberrySyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Strawberry Syrup";
    }
}
