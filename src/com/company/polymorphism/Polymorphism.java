package com.company.polymorphism;

public class Polymorphism {
    String name;
    int age;


    // function overloading
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
