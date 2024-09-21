package com.example.ticketing_demo.factory_method.model;

public class Santafe extends Car{
    private final String name;

    public Santafe(String email) {
        super(email);
        this.name = "santafe";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Santafe{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}
