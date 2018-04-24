package com.glqdlt.bmsserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.glqdlt.**")
@Slf4j
@SpringBootApplication
public class BmsServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BmsServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
