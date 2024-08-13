package org.selenium.array;

import org.selenium.StringReverseDemo;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String first="Snehal";
        String second="Rahul";
        String third="Snehal";
        boolean result = first.equals(second);
        System.out.println(result);
        boolean result2=first.equals(third);
        System.out.println(result2);
    }
}
