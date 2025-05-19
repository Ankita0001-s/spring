package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = contex.getBean("AudiVehicle",Vehicle.class);
        System.out.println("Vehicle name with context :"+ veh1.getName());

        Vehicle veh2 = contex.getBean("HondaVehicle",Vehicle.class);
        System.out.println("Vehicle name with context :"+ veh2.getName());

        Vehicle veh3 = contex.getBean("FerariVehicle",Vehicle.class);
        System.out.println("Vehicle name with context :"+ veh3.getName());
    }
}
