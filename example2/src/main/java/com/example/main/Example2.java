package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {

       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name with context :"+ veh1.getName());

        Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name with context : "+veh2.getName());

        Vehicle veh3 = context.getBean("vehicle3", Vehicle.class);
        System.out.println("Vehicle name with context : "+veh3.getName());



    }
}
