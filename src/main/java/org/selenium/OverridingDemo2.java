package org.selenium;

public class OverridingDemo2 extends OverridingDemo {
    public void pet(){
        System.out.println("Hello my name is rockey");
    }

    public static void main(String[] args) {
        OverridingDemo demo = new OverridingDemo();
        demo.pet();
//        OverridingDemo2 demo2 = new OverridingDemo2();
//        demo2.pet();
        OverridingDemo obj = new OverridingDemo2();
        obj.pet();
    }
}
