package org.selenium.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueElementFromList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println("Size of Arraylist:" +list.size());
        for(int l:list){
            System.out.println("List with duplicate integer is:" +l);
        }


        HashSet<Integer> set= new HashSet<>(list);
        for (int s:set){
            System.out.println("List with unique interger: " +s);
        }
    }
}
