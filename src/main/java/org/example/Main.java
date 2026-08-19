package org.example;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.isRunning = true;
        car.stop();
        car.start();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.isRunning);
    }
}