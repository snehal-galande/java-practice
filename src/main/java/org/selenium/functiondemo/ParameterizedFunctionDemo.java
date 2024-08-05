package org.selenium.functiondemo;

public class ParameterizedFunctionDemo {
    public static void main(String[] args) {
        disp("hello");

        boolean isElder = isElder(32);
        if(isElder) {
            System.out.println("Elder");
//            disp("Elder");
        } else {
            System.out.println("Younger");
//            disp("Younger");
        }

        String firstName = "Aarav";
        String lastName = "Rokade";

//        getFullName("Snehal", "Galande");
        String fullName = getFullName(firstName, lastName);
//        System.out.println(fullName);
        disp(fullName);
    }

    public static void disp(String msg) {
        System.out.println(msg);
    }
    
    public static boolean isElder(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static String getFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
