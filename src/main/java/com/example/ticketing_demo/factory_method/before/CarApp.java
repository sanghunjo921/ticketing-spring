package com.example.ticketing_demo.factory_method.before;

import com.example.ticketing_demo.factory_method.CarFactory;
import com.example.ticketing_demo.factory_method.model.Avante;
import com.example.ticketing_demo.factory_method.model.Car;
import com.example.ticketing_demo.factory_method.model.Santafe;

public class CarApp {
    public static void main(String[] args) {
        Car avante = new Avante("test@test.com");
        Car avante2 = CarFactory.orderCar("avante", "test1@test1.com");
        System.out.println(avante);
        System.out.println(avante2);
        Car santafe = new Santafe("test2@test2.com");
        Car santafe2 = CarFactory.orderCar("santafe", "test3@test3.com");
        System.out.println(santafe);
        System.out.println(santafe2);
    }
}
