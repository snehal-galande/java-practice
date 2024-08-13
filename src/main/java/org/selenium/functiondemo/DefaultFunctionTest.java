package org.selenium.functiondemo;

import java.util.Random;

public class DefaultFunctionTest {
    public static void main(String[] args) {
        disp();

        int randomNumber = getRandom();
//        System.out.println(randomNumber);
        System.out.println(getRandom());

        String name = getName();
//        System.out.println(name);
        System.out.println(getName());
    }

    public static void disp() {
        System.out.println("hey");
    }

    public static int getRandom() {
        return new Random().nextInt();
    }

    public static String getName() {
        return "Aarav";
    }
}
