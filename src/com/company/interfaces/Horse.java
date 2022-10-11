package com.company.interfaces;

public class Horse implements Animal, Herbivore{
    @Override
    public void walk() {
        System.out.println("Horse can walk");
    }

    @Override
    public void run() {
        System.out.println("It can run too");
    }
}
