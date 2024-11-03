package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tolga", "Ozmacun", 35);
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Teenage: " + person.isTeen());

        Person person1 = new Person("Ahmet", "Ozmacun", 70, 100, 1.82, "blue");
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Teenage: " + person1.isTeen());

        Wall wall = new Wall(2.5, 3);
        wall.setWidth(-4);
        wall.setHeight(3.5);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Heigt: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
    }
}
