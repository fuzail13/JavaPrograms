/* Write a program to check the consecutive 1's in the binary represention of a number.
 */
import java.util.Scanner;

public class Consecutive1s {

    static boolean isConsecutive(int n){
        if((n & (n << 1)) != 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println("The number "+n+" contains consecutive 1's : "+isConsecutive(n));

    }
}
