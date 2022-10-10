package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(int i=1; i<=number; i++){
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }
}
