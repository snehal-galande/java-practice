package org.selenium;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Snehal");
        set.add("Megha");
        set.add("Kittu");
        set.add("Snehal");
        //hashset dont allow duplicates
        for (String s : set){
            System.out.println(s);
        }
        //System.out.println(set);
    }
}
