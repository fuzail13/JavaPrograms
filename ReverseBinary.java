import java.util.Scanner;

public class ReverseBinary {

    //Complexity -> O(log(n))
    static int reverseBinary(int n){

        int f=31, l=0;
        int rev = 0;

        while (f > l){

            if((n & 1<<f) != 0) {
                rev = rev | (1 << l);
            }

            if ((n & 1<<l) != 0) {
                rev = rev | (1 << f);
            }
            f--;
            l--;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println(reverseBinary(n));
    }
}

/* Write a program to find the nth number, whose binary representation
is a palindrome.

Note: 1. Consider the first number whose binary representation
as 1 instead of 0.
2. Do not consider the leading zeros, while considering
the binary representation.

 */