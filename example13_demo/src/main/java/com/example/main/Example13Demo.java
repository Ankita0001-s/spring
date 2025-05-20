package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13Demo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle vehicle = context.getBean("vehicle2",Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name : "+ person.getName());
        System.out.println("Vehicle onwed by person : "+ person.getVehicle().getName());
//        System.out.println("Vehicle : "+vehicle);
    }
}
