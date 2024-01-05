/* Write a program to find the number of trailing zeros in the binary representation of a number.*/

import java.util.Scanner;

public class TrainlingZerosinBits {

    //Complexity -> O(1)
    static int numberofTZ(int n){

        return (int)(Math.log10((n & n-1) ^ n) / Math.log10(2));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();
        System.out.println("The Number of Trailing zeros are: "+numberofTZ(n));


    }
}
