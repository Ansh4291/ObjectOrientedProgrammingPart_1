package com.bridgeLabz;
class A{
    int a;
    public int Ansh() {
        System.out.println("hello");
        return 0;
    }
    public void meth1() {
        System.out.println("I am method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth1() {
        System.out.println("I am method 1 of class B");
    }
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }
}
public class MethodOverloadingOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        a.Ansh();

        B b = new B();
        b.meth1();
        b.meth2();
    }
}
