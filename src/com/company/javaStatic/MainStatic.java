package com.company.javaStatic;
public class MainStatic {
    static int ab = 12;

    public static void check(){
        System.out.println("Checked!!");
    }
    public static void main(String[] args) {
        check();
        System.out.println(ab);
        Name.namePrint();
    }
}
