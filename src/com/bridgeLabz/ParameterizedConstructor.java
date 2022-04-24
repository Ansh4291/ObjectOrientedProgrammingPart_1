package com.bridgeLabz;

public class ParameterizedConstructor {
    String familyMembers;
    ParameterizedConstructor(String names) {
        familyMembers = names;
        System.out.println("Family Members names are :- " + names);

    }

    public static void main(String[] args) {

        ParameterizedConstructor obj1 = new ParameterizedConstructor("Anshul");
        ParameterizedConstructor obj2 = new ParameterizedConstructor("Rahul");
        ParameterizedConstructor obj3 = new ParameterizedConstructor("Lavi");
    }
}
