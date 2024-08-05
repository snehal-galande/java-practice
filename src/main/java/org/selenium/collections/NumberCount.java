package org.selenium.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberCount {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(4,1,1,2,2,2,3,4,5,6,6,6,7);
        Map<Integer,Integer>map=new HashMap<>();
        for(int m:list){
            if(map.containsKey(m)){
                map.put(m,map.get(m)+1);
            }else {
                map.put(m,1);
            }
        }
        for(Map.Entry<Integer,Integer>map1:map.entrySet()){
            System.out.println(map1.getKey()+ " -> " +map1.getValue());
        }

    }
}
