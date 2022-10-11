package com.company.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        p1.name = "Md Rakibul Hasan";
        p1.age = 23;
        p1.printInfo(p1.name);
        p1.printInfo(p1.age);
        p1.printInfo(p1.name, p1.age);
    }
}
