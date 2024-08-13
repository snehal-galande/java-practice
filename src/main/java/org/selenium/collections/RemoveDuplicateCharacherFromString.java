package org.selenium.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacherFromString {
    public void removeDuplicate(String str){
        LinkedHashSet<Character>set= new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
            for(char ch:set){
                System.out.println(ch);
            }
        }
    }
    public static void main(String[] args) {
        String str="javaTpoint is the best learning website";
        RemoveDuplicateCharacherFromString r=new RemoveDuplicateCharacherFromString();
        r.removeDuplicate(str);
    }
}
