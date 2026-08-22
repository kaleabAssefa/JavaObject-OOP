package org.example;

public class Student{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    Student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;

    }
    // Object properties
    String brand;
    int year;

    // Method
    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        // Creating an object
        Car myCar = new Car();

        // Assigning values
        myCar.brand = "Honda";
        myCar.year = 2024;

        // Calling the method
        myCar.displayCarInfo();
}
