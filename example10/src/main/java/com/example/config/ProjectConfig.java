package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    public Person person(Vehicle vehicle){
        var person = new Person();
        person.setName("Ankita");
        person.setVehicle(vehicle);
        return person;
    }

}
