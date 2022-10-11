package com.company;

import java.util.Scanner;

public class MaxMin {
    int max_size = 5;
    int a[] = new int[max_size];
    int max = 0, min = 9999999;
    void user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Values: ");
        for(int i=0; i<max_size; i++){
            a[i] = sc.nextInt();
        }

    }
    void MaxMinFinder(){
        for(int i = 0; i<max_size; i++){
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
    }
    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        maxMin.user_input();
        maxMin.MaxMinFinder();
        System.out.println("Maximum is: " + maxMin.max);
        System.out.println("Minimum is :" + maxMin.min);
    }
}
