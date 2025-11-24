package com.example.demo;

import com.example.demo.impl.ChocolateFrosting;
import com.example.demo.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    PaymentService paymentService1;

    @Autowired
    PaymentService paymentService2;

    @Autowired
    EmailService emailService;

    @Autowired
    @Qualifier("strawfrosting")
    Frosting chocolateFrosting;

    @Autowired
    @Qualifier("chololatesyrup")
    Syrup syrup;

    @Autowired
    CakeBakers cakeBakers;

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//        paymentService1.getPayment();
//        paymentService2.getPayment();
        //String s = emailService.sendMessage();
        //System.out.println(s);

        String s = chocolateFrosting.getFrosting();
        System.out.println(s);

        String syrup1 = syrup.getSyrup();
        System.out.println(syrup1);

        System.out.println(cakeBakers.bakeCakes());

//        StringAppl

    }
}
