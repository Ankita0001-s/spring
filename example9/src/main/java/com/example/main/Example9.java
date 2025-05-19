package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {
    public static void main(String[] args) {

       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name : "+ person.getName());
        System.out.println("Vehicle : "+ vehicle );
        System.out.println("vehicle name from vehicle obj : "+ vehicle.getName());
        System.out.println("Vehicle name : "+ person.getVehicle());


    }
}
