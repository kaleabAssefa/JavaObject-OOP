package org.example;

class Student{
    static int numOfFriends;
    String name;
    Student(String name){
        this.name = name;
        numOfFriends++;
    }

}