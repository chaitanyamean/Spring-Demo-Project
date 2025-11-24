package com.example.demo.impl;

import com.example.demo.Frosting;
import org.springframework.stereotype.Component;

@Component("chocofrosting")
public class ChocolateFrosting implements Frosting {

    @Override
    public String getFrosting() {
        return "Chocolate Frosting";
    }
}
