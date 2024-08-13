package org.selenium.abstractdemo;
class Sample{
    int i;
    int j;

    Sample(){
        this.i = 5;
        this.j = 5;
        //this(10,20);
    }

    Sample(int i, int j) {
       this.i=i;
       this.j=j;

        System.out.println(i + j + 30);
    }

    void sum(){
        System.out.println(i + j);
    }
}
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Sample s = new Sample(); //default constructor
        s.sum();

//        Sample s1 = new Sample(10,20); //parameterized constructor
//        s1.sum();
    }
}
