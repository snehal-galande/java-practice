package org.selenium;

public class FunctionDemo {

    public void sum(int firstnum, int secondnum){
        int result = firstnum+secondnum;
        System.out.println(result);

    }

    public int getSum(int first,int second){
        int res = first+second;
        return res;
    }

    public static void main(String [] args){
        FunctionDemo function = new FunctionDemo();

        int a = 20;
        int b = 30;

        function.sum(a,b);

        int aa = 30;
        int bb = 40;

       function.sum(aa,bb);

       int num1 = 10;
       int num2 = 20;
       int result =  function.getSum(num1,num2);
        System.out.println(result);

    }
}
