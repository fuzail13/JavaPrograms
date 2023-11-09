//Program to find the factorial of a number.
import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter Any Number: ");
        int num = sc.nextInt();

        int fact = 1;
        while (num>0){
            fact *= num;
            num -= 1;
        }
        System.out.printf("The Factorial of a number is: "+fact);
    }
}
