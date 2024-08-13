package org.selenium;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Snehal",30);
        hashMap.put("Megha", 22);
        hashMap.put("Snehal 1",30);
        //hashMap.put("Snehal",40)
        hashMap.put("Kittu", 2);
        //in hashmap key can not be duplicate but value can be duplicate so if we print 30 for two times it will print but
        //if u take snehal for two times it will override on first value and give second output as  snehal=40
        System.out.println(hashMap);


    }
}
