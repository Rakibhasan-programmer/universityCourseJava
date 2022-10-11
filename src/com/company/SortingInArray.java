package com.company;

import java.util.Scanner;

public class SortingInArray {
    public static void main(String[] args) {
        int tmp, max_size = 5;
        int array[] = new int[max_size];
        Scanner sc = new Scanner(System.in);

        // input values in array
        for(int i=0; i<max_size; i++){
            array[i] = sc.nextInt();
        }

        // sorting the array
        for(int i=0; i<max_size-1; i++){
            for(int j=i+1; j<max_size; j++){
                if(array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        // sorted array
        for(int i=0; i<max_size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
