package com.company.exceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        int num1, num2;
        try {
            num1 = 3;
            num2 = 62 / num1;
            System.out.println(num2);
            int a[]=new int[7];
            a[7]=30;
            System.out.println("End of try block");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /* finally block will always execute
         * even if there is no exception in try block
         */
        finally{
            System.out.println("Finally block");
        }
        System.out.println("Out of try catch block");
    }
}
