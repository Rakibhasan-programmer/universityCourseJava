package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number, srt;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        number = sc.nextInt();
        srt = (int) Math.sqrt(number);

        for(int i=2; i<=srt; i++){
            if(number%2 == 0){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime Number");
        }
    }
}
