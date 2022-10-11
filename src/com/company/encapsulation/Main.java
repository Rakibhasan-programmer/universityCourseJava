package com.company.encapsulation;

public class Main {
    public static void main(String[] args) {
        AccessModifiers a1 = new AccessModifiers();
        a1.age = 23;
        a1.name = "Saim";
        a1.profession = "Gamer";

        a1.setPassword("dh6ggd3");
        System.out.println(a1.getPassword());
    }
}

// access modifiers
// public - accessible to any class + also accessed by different packages.
// private - only the class where it defined.
// protected - only accessed by main package (class, methods) and subclass in different packages.
// default - only same packages can access.
