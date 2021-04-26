package com.cem.springnativeexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringNativeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNativeExampleApplication.class, args);
    }

}
