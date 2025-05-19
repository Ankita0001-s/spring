package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("Random number :" + number);

        if (number % 2 == 0) {
            context.registerBean("Volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("Audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("Volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("Error while creating Volkswagen vehicle.." );
        }

        try {
           audiVehicle = context.getBean("Audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("Error while creating Audi Vehicle.." );
        }

        if (null != volksVehicle) {
            System.out.println("Programming vehicle name from spring context is : " + volksVehicle.getName());
        } else {
            System.out.println("Programming vehicle name from spring context is :" + audiVehicle.getName());
        }
    }
}
