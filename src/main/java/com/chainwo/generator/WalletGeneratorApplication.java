package com.chainwo.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.web3j.crypto.CipherException;

import java.io.IOException;

@SpringBootApplication
public class WalletGeneratorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WalletGeneratorApplication.class, args);
        GenerateCore generateCore = context.getBean(GenerateCore.class);
        generateCore.generate();
    }

}
