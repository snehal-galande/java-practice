package org.selenium.interfacedemo;

interface shape{
     void print();
}

class rectangle implements shape{
    public void print(){
        System.out.println("Shape is rectangle");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        shape s=new rectangle();
        s.print();

    }
}
