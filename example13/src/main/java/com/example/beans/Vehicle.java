package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "BMW";

    public Vehicle(){
        System.out.println("Vehicle constructor called..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
