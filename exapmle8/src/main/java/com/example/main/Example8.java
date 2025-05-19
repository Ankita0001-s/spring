package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example8 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("vehicle name by using xml configuration :" + veh.getName());
    }
}
