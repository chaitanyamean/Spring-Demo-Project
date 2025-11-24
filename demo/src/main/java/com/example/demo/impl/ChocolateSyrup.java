package com.example.demo.impl;

import com.example.demo.Syrup;
import org.springframework.stereotype.Component;

@Component("chololatesyrup")
public class ChocolateSyrup implements Syrup {


    @Override
    public String getSyrup() {
        return "Chocolate Syrup";
    }
}
