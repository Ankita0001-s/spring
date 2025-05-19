package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda City");
        return  vehicle;
    }

    @Bean
    String hello(){
        return "Hello";
    }
    @Bean
    Integer number(){
        return 45;
    }
}
