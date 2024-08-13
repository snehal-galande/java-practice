package org.selenium.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "I am not tester not tester";
        HashSet<String> set= new LinkedHashSet<>();
        List<String> list=new ArrayList<>();
        String[] words=str.split(" ");
        for(String word:words){
            if(set.add(word)){
                list.add(word);
            }
        }
       String output=String.join(" ",list);
        System.out.println(output);
    }
}
