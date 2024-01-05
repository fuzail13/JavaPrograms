//Program to find the count of Set Bits(1) in a number.

//By using Kernighan's algorithm.

import java.util.Scanner;

public class CountSetBits {
    static int countSetBit(int n){

        int count = 0;
        while (n>0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println("The Number of Set Bits are: "+countSetBit(n));


    }
}

