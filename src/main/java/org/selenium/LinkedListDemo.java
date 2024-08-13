package org.selenium;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Rahul");
        list.add("Meghna");
        list.add("Kittu");
        list.add("Snehal");
        list.add("Rahul");

        System.out.println(list);
    }
}
