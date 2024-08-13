package org.selenium.staticdemo;

public class CalculatorStaticDemo {


    public static int sum(int a, int b){

        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }

    public static int divide(int a,int b){
        try {
            return a/b;
        }catch (ArithmeticException ex){
            System.out.println("Given number is not divided by 0");
            return -1;
        }

    }
}
