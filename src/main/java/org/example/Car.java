package org.example;

public class Car {
    String make = "Toyota";
    String model = "Camry";
    int year= 2026;
    double price = 30000.25;
    boolean isRunning = false;

    Car(String make,String model,int year,double price,boolean isRunning){
        make=this.make;
    }
    void start(){
        isRunning = true;
        System.out.println("You have started the car");
    }
    void stop(){
        isRunning = false;
        System.out.println("you have stopped the car");
    }
}
