package org.selenium;

public class StringComparisonDemo {
    public static void main(String[] args) {
        String str="Snehal";
        String str2 = new String("Snehal");
        System.out.println(str2);

//        if(str==str2){
//            System.out.println("String are matching");
//        }else {
//            System.out.println("String is not matching");
//        }

        if(str.equals(str2)){
            System.out.println("String are matching");
        }else {
            System.out.println("String is not matching");
        }
    }
}
