package org.selenium.staticdemo;

public class StaticTest {
    //static int a = 10; // static data member


    public static void main(String[] args) {

//        StaticTest staticTest = new StaticTest();








//        System.out.println(a);
//        staticTest.disp();
//        print();

        //non-static member function
//        ProgramStaticTest programStaticTest = new ProgramStaticTest();
//        System.out.println(programStaticTest.getRandom());

        int number = ProgramStaticTest.getRandom();
        System.out.println(number);
    }

    public void disp() {

        System.out.println("hey");
    }

    public static void print() {

        System.out.println("hey static");
    }
}
