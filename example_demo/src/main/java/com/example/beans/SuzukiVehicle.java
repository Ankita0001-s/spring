package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("suzukiVehicle")
public class SuzukiVehicle implements Vehicle {

    private String name;

    public SuzukiVehicle() {
        this.name = "Suzuki";
    }

    @Override
    public String getName() {
        return name;
    }
}
