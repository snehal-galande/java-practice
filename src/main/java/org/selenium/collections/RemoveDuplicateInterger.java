package org.selenium.collections;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateInterger {
    public static void main(String[] args) {
        // //to find out duplicate int from list
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,1,3,4,2,6,4);
        HashSet<Integer>set=new HashSet<>(list);
        System.out.println(set);
    }


}
