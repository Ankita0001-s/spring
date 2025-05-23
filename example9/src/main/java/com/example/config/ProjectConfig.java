package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Altroz");
        return  vehicle;
    }

    @Bean
    Person person(){
        Person person = new Person();
        person.setName("Himanshu");
        person.setVehicle(vehicle());
        return person;
    }

}
