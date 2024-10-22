package org.example;

import vehicles.Car;
import vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car bmw = new Car("BMW", "1 Series");

        bmw.start();
        bmw.drive();


        Motorcycle yamaha = new Motorcycle("yamaha", "10000R", false);

    }


}
