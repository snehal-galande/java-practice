package org.selenium.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        //to find out duplicate string from list
        String str = "I am not tester not tester";
        HashSet<String> set = new LinkedHashSet<>();
        String[] strings = str.split(" ");
        set.addAll(List.of(strings));
        String output = String.join(" ", set);
        System.out.println(output);



    }
}
