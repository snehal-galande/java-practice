package org.selenium.abstractdemo;

abstract class Test {
    int num1;
    int num2;

//    Test() {
//        this.num1 = 10;
//        this.num2 = 20;
//    }

    Test(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    abstract void disp();

    public void sum() {
        System.out.println(num1 + num2);
    }
}

class TestImpl extends Test {

    TestImpl(int a, int b) {
        super(a, b);
    }

    @Override
    void disp() {
        System.out.println("hi!!!");
    }
}

public class AbtstractConstructorDemo {
    public static void main(String[] args) {
        Test t = new TestImpl(20,30);
        t.sum();
    }
}
