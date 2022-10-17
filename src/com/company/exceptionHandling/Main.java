package com.company.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("End of the block!!");
        }
        catch (ArithmeticException e) {
            /* This block will only execute if any Arithmetic exception
             * occurs in try block
             */
            System.out.println(e.getMessage());
        }
        System.out.println("Out of try catch block");
    }
}
