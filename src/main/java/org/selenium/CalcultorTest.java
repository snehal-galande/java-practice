package org.selenium;

public class CalcultorTest {
//    public static void mul(int a, int b) {
//        System.out.println(a * b);
//    }
    public static void main(String[] args) {
        CalculatorUtility.mul(10,20);
        int d = CalculatorUtility.mul(10, 10, 10);
        System.out.println(d);
    }
}
