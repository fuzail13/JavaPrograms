//Program to find all the prime factors of a given number.

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        printPrimeFactor(n);

    }
    //Efective Approach -> Complexity - O(root(n(log(n)))
    static void printPrimeFactor(int n){
        int i = 2;
        while (i*i <= n){
            while(n % i == 0){

                System.out.println(i);
                n = n / i;
            }
            i++;
        }
        if (n>1)
            System.out.println(n);
    }

}

