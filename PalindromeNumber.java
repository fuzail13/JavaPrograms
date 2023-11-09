// Java program to check if a number is Palindrome
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        int n = 121 ;
        if (checkPalindrome(n))
            System.out.println("The Given number is Palindrome.");
        else
            System.out.println("The Given number is not Palindrome.");

    }
    static boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (n!=0){
            reverse = (reverse * 10) + (n % 10);
            n = n/10;
        }
        if (reverse==temp)
            return true;
        else
            return false;
    }

}
