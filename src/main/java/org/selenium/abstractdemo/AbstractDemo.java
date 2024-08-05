package org.selenium.abstractdemo;

abstract class Bike {
    abstract void run();
    void display(){

        System.out.println("Hello Rahul");
    }
}

class Honda extends Bike{
    @Override
    void run() {

        System.out.println("Bike is running");
    }
    void display(){

        System.out.println("Hello Snehal");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.display();
    }
}


