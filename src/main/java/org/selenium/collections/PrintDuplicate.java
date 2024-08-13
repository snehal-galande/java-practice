package org.selenium.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicate {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,1,2,3,4,5,6,6,7,7,8,9,10);

       HashSet<Integer>set=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int i:list){
            if(set.contains(i)){
                duplicates.add(i);
            }else {
                set.add(i);
            }

        }
        System.out.println(duplicates);
    }
}
