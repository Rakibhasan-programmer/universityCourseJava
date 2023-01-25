package problemSolving;

import java.util.Scanner;

public class Problem2 {
    public static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        else
        {
            return fibo(n-2) + fibo(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(fibo(n));
    }
}
