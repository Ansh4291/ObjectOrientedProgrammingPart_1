package com.bridgeLabz;

public class StaticVariableBlocks {
    static int x = 10;
    static int y ;
    static void func(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    static {
        System.out.println("Use of static variable and block ");
        y = x + 2;
    }

    public static void main(String[] args) {
        func(4);
    }
}
