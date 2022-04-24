package com.bridgeLabz;
class animal{
    String color = "White";

}
class dog extends animal {
    String color = "black";

    public void color() {
        System.out.println(color);
        System.out.println(super.color);

    }
}

public class InhertanceSuperKeyword {
    public static void main(String[] args) {

        dog dg = new dog();
        dg.color();

    }
}
