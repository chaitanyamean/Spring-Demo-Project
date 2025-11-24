package com.example.demo.impl;

import com.example.demo.Frosting;
import org.springframework.stereotype.Component;

@Component("strawfrosting")
public class StrawberryFrosting implements Frosting {

    @Override
    public String getFrosting() {
        return "Strawberry Frosting";
    }
}
