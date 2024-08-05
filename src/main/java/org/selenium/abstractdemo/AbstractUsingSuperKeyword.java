package org.selenium.abstractdemo;

abstract class A{
    int num1;
    int num2;
   // A(){}

    A(int p,int q){
        this.num1=p;
        this.num2=q;
    }
    abstract void sum();
}

class B extends A{

    B(int a,int b){

        super(a,b);
    }

    @Override
    void sum() {
        System.out.println(num1+num2);
    }
}
public class AbstractUsingSuperKeyword {
    public static void main(String[] args) {
        A obj = new B(10,20);
        obj.sum();
    }
}
