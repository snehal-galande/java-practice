package org.selenium;


public class AnimalDemo {
    String category = "Dog";
    String color = "Black";
    String name ="Ray";

    public void display(){
        System.out.println(category + " " +color + " " + name);
    }

    public static void main(String[] args) {

        AnimalDemo animal = new AnimalDemo();
        System.out.println(animal.category);
        animal.display();
    }
}