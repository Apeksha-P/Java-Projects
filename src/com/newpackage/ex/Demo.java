package com.newpackage.ex;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Create new Java package ");
        //Call newMethod to run
        newMethod();
        //newpackage.access(); can not access private
        access();
    }
    //create newMethod
    public static void newMethod(){
        System.out.println("Create new method ");
    }

    private static void access(){
        System.out.println("Access");
    }
}

