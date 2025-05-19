package com.example.beans;

import org.springframework.stereotype.Component;

@Component("tataVehicle")
public class TataVehicle implements Vehicle {
    private String name;

    public TataVehicle() {
        this.name = "Tata";
    }

    @Override
    public String getName() {
        return name;
    }
}
