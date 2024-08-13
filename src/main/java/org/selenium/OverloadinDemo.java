package org.selenium;

public class OverloadinDemo {
     public static int add(int a,int b){
             return a+b;
    }

    public static int add(int p,int q,int r){

         return p+q+r;
    }

    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(2,5,6));
    }
}
