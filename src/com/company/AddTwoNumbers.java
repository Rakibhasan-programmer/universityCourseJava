package com.company;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int number_1, number_2, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        number_1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        number_2 = sc.nextInt();

        sum = number_1 + number_2;

        System.out.println("Summation of two number is: " + sum);
    }
}
