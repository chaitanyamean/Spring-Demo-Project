package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBakers {

    private final Frosting frosting;
    private final Syrup syrup;

    @Autowired
    public CakeBakers(
            @Qualifier("chocofrosting") Frosting frosting,
            @Qualifier("chololatesyrup") Syrup syrup
    ) {
        System.out.println("Constructor Cakebakers");
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public String bakeCakes() {
        System.out.println("Inside bake cakes");
        return "Baking cake with " +
                frosting.getFrosting() + " and " +
                syrup.getSyrup() + ".";

    }




}
