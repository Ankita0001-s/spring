package com.example.beans;

import org.springframework.stereotype.Component;

@Component("hondaVehicle")
public class HondaVehicle implements Vehicle {
    private String name;

    public HondaVehicle() {
        this.name = "Honda";
    }

    @Override
    public String getName() {
        return name;
    }
}
