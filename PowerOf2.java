//Write a program to find whether a number is a power of 2.

import java.util.Scanner;

public class PowerOf2 {
    static boolean checkPowerof2(int n){
        if(n == 0)
            return false;
        else if((n & n-1) == 0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println(checkPowerof2(n));
    }
}
