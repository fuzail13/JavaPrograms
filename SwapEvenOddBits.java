/* Write a program to swap all the even & odd bits in a given number. */


import java.util.Scanner;

public class SwapEvenOddBits {

    //Complexity -> O(1)
    static int swapEvenOddBits(int n){

        return (((n & 0xaaaaaaaa) >>> 1) | (n & 0x55555555) << 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println(swapEvenOddBits(n));

    }
}
