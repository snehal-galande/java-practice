package org.selenium.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
        set.add("Snehal");
        set.add("Rahul");
        set.add("Rahul");
        for(String s:set){
            System.out.println("Set is: " + s);
        }

        System.out.println(set.size());
    }
}
