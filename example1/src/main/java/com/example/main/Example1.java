package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Altroz");
        System.out.println("non context : "+ vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("with context :"+ veh.getName());

        String str = context.getBean(String.class);
        System.out.println("string : " + str);

        Integer in = context.getBean(Integer.class);
        System.out.println("Integer : "+ in);
    }
}
