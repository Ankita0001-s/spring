package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public Vehicle(){
        this.name = "Altroz";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
