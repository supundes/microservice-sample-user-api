package com.wso2.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {

        Object[] sources = {App.class, Debug.class};
        SpringApplication.run(sources, args);

        //SpringApplication.run(UserAPI.class, args);
    }
}
