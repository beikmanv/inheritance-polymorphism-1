package org.example;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;
import vehicles.Car;
import vehicles.Motorcycle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car bmw = new Car("BMW", "1 Series");

        bmw.start();
        bmw.drive();


        Motorcycle yamaha = new Motorcycle("yamaha", "10000R", false);

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );


    }


}
