package org.selenium;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Snehal");
        list.add("Megha");
        list.add("Kittu");
        list.add("Megha");

        for(String l:list){
            System.out.println(l);
        }

        //System.out.println("Names are:" + list);

        // we can create object of string also
        String s = new String("Snehal");
        System.out.println(s);
    }
}
