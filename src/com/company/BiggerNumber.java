package com.company;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        int number_1, number_2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number_1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number_2 = sc.nextInt();

        if(number_1 >= number_2){
            System.out.println("Bigger number is: " + number_1);
        }else{
            System.out.println("Bigger number is: " + number_2);
        }

    }
}
