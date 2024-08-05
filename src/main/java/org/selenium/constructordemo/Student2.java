package org.selenium.constructordemo;

public class Student2 {

        int id;
        String name;
        //parameterized constructor
    Student2(int i,String s){
        this.id=i;
        this.name=s;
    }
    public void display(){
        System.out.println(id +" "+name);
    }

    public static void main(String[] args) {
        Student2 s=new Student2(1,"Snehal");
        s.display();
    }
}
