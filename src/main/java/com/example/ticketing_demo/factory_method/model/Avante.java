package com.example.ticketing_demo.factory_method.model;

public class Avante extends Car {
    private final String name;

    public Avante(String email) {
        super(email);
        this.name = "avante";
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Avante{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}
