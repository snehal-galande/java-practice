package org.selenium.collections;

import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        System.out.println("Size of list:" + list.size());
        for(int l:list){
            System.out.println("List is:" + l);
        }
    }
}
