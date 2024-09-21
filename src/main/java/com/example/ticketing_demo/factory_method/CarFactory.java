package com.example.ticketing_demo.factory_method;

import com.example.ticketing_demo.factory_method.model.Avante;
import com.example.ticketing_demo.factory_method.model.Car;
import com.example.ticketing_demo.factory_method.model.Santafe;

public class CarFactory {

    public static Car orderCar(String type, String email) {
        //prepare
        prepare(type);

        //process
        Car car = buildCar(type, email);

        //notification
        notify(type, email);
        return car;
    }

    private static void prepare(String type) {
        System.out.println("Preparing" + type + "...");
    }

    private static Car buildCar(String type, String email) {
        Car car = type.equals("avante") ? new Avante(email) : new Santafe(email);
        return car;
    }

    private static void notify(String type, String email) {
        System.out.println("Your" + type + "is ready! so sending email to" + email);

    }

}
