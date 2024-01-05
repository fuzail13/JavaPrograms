//Program to find the greatest common factor.

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min;
        if(a<b)
            min = a;
        else
            min = b;
        for (int i = min; i>0;i--){
            if( a % i == 0 && b % i ==0) {
                System.out.println("The Greatest Common Factor is: " + i);
                break;
            }
        }
    }
}
