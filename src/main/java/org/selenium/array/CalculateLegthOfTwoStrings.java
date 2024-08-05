package org.selenium.array;

public class CalculateLegthOfTwoStrings {
    public static void main(String[] args) {
        String[] name= {"Snehal","Rahul"};
            System.out.println("Size of array:"+ name.length);
            int totalCharachter=0;
            for(String s:name){
                totalCharachter = totalCharachter + s.length();
            }
        System.out.println("Total characters"+totalCharachter);
    }
}
