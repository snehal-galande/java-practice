package org.selenium;
//Datatype in java

//int
//String
//Char
//boolean
//float
//double
//void

public class ReturnType {
    public static void main(String[] args) {
        ReturnType type = new ReturnType();
        type.add(10,20);
        int res = type.sub(20, 10);
        type.display(res);

        String name = type.getName("Snehal");
        System.out.println(name);

        Character ch = type.getCharFromMessage("Aarav");
        System.out.println("Character of message is: " + ch);

        boolean isYounger = type.isYounger(15);
        if(isYounger) {
            System.out.println("Person is Younger");
        }else {
            System.out.println("Person is Older");
        }
    }

    public boolean isYounger(int age) {
//        if(age < 18) {
//            return true;
//        }else {
//            return false;
//        }

//        return age < 18 ? true : false;

        return age < 18;
    }

    public Character getCharFromMessage(String message) {
        return message.charAt(0);
    }

    public String getName(String message) {
        return message;
    }

    public void add(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }

    public int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    public void display(int res) {
        System.out.println(res);
    }


}
