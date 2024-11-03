package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int weight;
    double height;
    String eyeColor;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, int weight, double height, String eyeColor){
        this(firstName,lastName,age);
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        return this.age <= 19 && this.age >= 13;
    }
}
