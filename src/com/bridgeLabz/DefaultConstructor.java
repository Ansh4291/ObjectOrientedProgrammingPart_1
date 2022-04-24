package com.bridgeLabz;

public class DefaultConstructor {
    int a;
    boolean b;

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println("Default Constructor are :- ");
        System.out.println("Default value of integer is :- " + obj.a);
        System.out.println("Default Constructor of Boolean is :- " + obj.b);
    }
}
