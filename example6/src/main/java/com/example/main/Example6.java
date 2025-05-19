package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name with context :" + veh1.getName());

        context.close();
    }
}
