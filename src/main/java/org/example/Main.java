package org.example;
public class Main {
    public static void main(String[] args) {
       User user1 = new User("Kaleab");
       User user2= new User("BOB","Bob@gmail.com");
       User user3 = new User("Jack","jackemail",25);
       Car car1 = new Car("Toyota","Grey");
       Car car2 = new Car("Honda","Blue");
       car2.drive();
        car1.drive();
        System.out.println();
        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user1.userName);
        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);

    }
}