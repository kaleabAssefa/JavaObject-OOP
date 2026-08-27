package org.example;
public class Main {
    public static void main(String[] args) {
       User user1 = new User("Kaleab");
       User user2= new User("BOB","Bob@gmail.com");
       User user3 = new User("Jack","jackemail",25);
       Car car1 = new Car("Toyota","Grey");
       Car car2 = new Car("Honda","Blue");
        Car car3 = new Car("Kia","Black");
       Car [] cars = {car1,car2,car3};
       for(int i =0;i< cars.length;i++){
           cars[i].drive();
       }

    }
}