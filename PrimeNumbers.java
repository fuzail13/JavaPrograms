//Program to check the Prime Number & Print the Prime Number up to given Number.

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println(isPrime(n));
        System.out.println(isPrimeNum(n));
        System.out.println(checkPrime(n));
        printPrime(n);
        sievePrintPrime(n);
    }
    //Brute Force Approach -> Complexity : O(n)
    static boolean isPrime(int n){
        for (int i=2; i<=n/2;i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;

    }
    //Efficient Code -> Complexity : O(root(n))
    static boolean isPrimeNum(int n){
        for (int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;

    }
    //Much More efficient method -> Complexity : O(root(n))
    static boolean checkPrime(int n){
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if (n%2==0 || n%3==0)
            return false;
        for (int i=5; i*i<=n;i=i+6){
            if (n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
    //Brute Force Approach to print the Prime Number -> Complexity : O(n*root(n))
    static void printPrime(int n){
        for (int i=2;i<=n;i++){
            if (checkPrime(i))
                System.out.println(i);
        }
    }
    //Sieve of Eratosthenes Approach to print the Prime Number -> Complexity : O(root(n(log(log(n))))
    static void sievePrintPrime(int n){
        boolean[] prime = new boolean[n+1];
        for (int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for (int j=i*i;j<=n;j=j+i){
                    prime[j] = true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (prime[i]==false)
                System.out.println(i);
        }

    }
}
