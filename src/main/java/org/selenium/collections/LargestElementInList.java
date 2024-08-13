package org.selenium.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LargestElementInList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);
        list.add(100);

            System.out.println("Maximum number from list is:"+Collections.max(list));

    }
}
