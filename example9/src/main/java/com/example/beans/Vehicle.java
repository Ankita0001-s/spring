package com.example.beans;

public class Vehicle {

    private String name;

    public Vehicle() {
        this.name = "honda";
    }

    public Vehicle(String name){
        this.name = name;
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
