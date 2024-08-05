package org.selenium.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Snehal");
        map.put(2,"Rahul");
        map.put(3,"Aarav");
        map.put(4,"Rahul");
        map.put(4,"Radha");
        System.out.println(map.size());
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println("Key is:" + m.getKey() + " and value is :"+ m.getValue());
        }
        //to check if key is present or not in map and return value for given key
        if(map.containsKey(4)){
            System.out.println(map.get(4));
        }
        //if u want to update new value for any key
        if(map.containsKey(3)){
            map.put(3,"Saloni");
            System.out.println(map);
        }





    }
}
