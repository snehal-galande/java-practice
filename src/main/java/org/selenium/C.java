package org.selenium;

public class C extends B {
    public void decor(){

        System.out.println("Photo frame is home decor item");
    }

    public static void main(String[] args) {
        C c = new C();
        c.animal();
        c.decor();
        c.bird();
    }
}
