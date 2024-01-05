//Program to print all the divisors of a number 'n' in ascending order.

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        printDivisors(n);
        printDivisorsEff(n);
    }

    //Brute Force Approach -> Complexity is O(n)
    static void printDivisors(int n){

        for (int i=1; i<=n; i++)
        {
            if(n%i == 0)
                System.out.println(i);

        }

    }
    //Efficient Approach -> Complexity is O(root(n))
    static void printDivisorsEff(int n){
        int i=0;
        for (i=1; i*i<=n; i++)
        {
            if(n%i == 0){
                System.out.println(i);
            }
        }
        for (;i>=1;i--){
            if(n%i == 0 && i != n/i){
                System.out.println(n/i);
            }
        }

    }
}
