package org.selenium.collections;

import java.util.Arrays;
import java.util.List;

public class LargeNumberWithoutUsingMaxFunction {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,26,3,40,5);
        int max=list.get(0);
        for(int i:list){
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);
    }
}
