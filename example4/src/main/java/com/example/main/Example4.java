package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = contex.getBean(Vehicle.class);
        System.out.println("Vehicle name with context :"+ veh1.getName());


    }
}
