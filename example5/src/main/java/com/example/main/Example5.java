package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = contex.getBean(Vehicle.class);
        System.out.println("Vehicle name with context :"+ veh1.getName());
        veh1.setName("BMW");
        System.out.println("Vehicle name with context :"+ veh1.getName());


    }
}
