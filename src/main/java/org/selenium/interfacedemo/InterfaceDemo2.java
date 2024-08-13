package org.selenium.interfacedemo;

interface animal{
    void pet();
}
class cat implements animal{
    public void pet(){
        System.out.println("My Pet is dog");
    }
}

class zebra implements animal{
    public void pet(){
        System.out.println("My pet is zebra");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        animal a= new cat();
        a.pet();
    }
}
