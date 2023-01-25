package problemSolving;

import java.util.Scanner;

public class Problem3 {
    public static int primeNumbers(int n)
    {
        boolean flag = false;
        if(n==0 || n==1)
        {
            return 0;
        }
        else
        {
            int m = n/2;
            for(int i=2; i<=m; i++)
            {
                if(n%i == 0)
                {
                    flag = true;
                    break;
                }
            }
        }

        if(!flag)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sum+=n;

        for(int i=n+1; i<=100; i++)
        {
            sum+=i;
            if(primeNumbers(i) == 1)
            {
                break;
            }
        }
        System.out.println(sum);
    }
}
