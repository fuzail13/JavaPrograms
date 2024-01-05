/* Write a program to print the nth Fibonacci Terms using Recursion.
 */

import java.util.Scanner;

public class FibonacciSeries {

    static int fibonacci(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Nth Term: ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));


    }
}
