package com.example.ticketing_demo.factory_method.model;

public abstract class Car {
    static private Long ID;
    {
        ID = 1L;
    }
    private Long id;
    private String email;

    public Car(String email) {
        this.id = Car.ID++;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
