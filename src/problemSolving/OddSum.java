package problemSolving;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        int OddSum = 0, sum = 0, n, OddAvg = 0, odd_cnt = 0, avg = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        // array sum
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        // odd sum
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 1){
                OddSum+=arr[i];
                odd_cnt++;
            }
        }

        OddAvg = OddSum/odd_cnt;
        avg = sum/n;

        if(OddAvg>avg)
            System.out.println("no");
        else
            System.out.println("yes");

    }
}
