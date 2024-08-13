package org.selenium;

public class Calculator {
    //add
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    //sub
    public static void sub(int a, int b) {

        System.out.println(a - b);
    }

//    //mul
//    public static void mul(int a, int b) {
//        System.out.println(a * b);
//    }

    //div
    public static void div (int a, int b) {

        System.out.println(a/b);
    }

    public static void main(String[] args) {
        add(10,20);
        sub(20, 10);
        CalculatorUtility.mul(2,4);
        div(4, 2);
        int d = CalculatorUtility.mul(2,3,4);
        System.out.println(d);
    }
}
