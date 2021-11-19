package com.naman.lecture31OOP.oop2;

// demo to show initialisation of static variables
public class StaticBlock {
    static int a =4;
    static int b;

    // will only run once when the first object is created i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static Block");
        b = a *5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }

}
