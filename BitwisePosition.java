import java.util.Scanner;
import java.util.*;

//Program to find the Right Most Set Bit.
public class BitwisePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println(posOfRMSB(n));
        System.out.println(posOfRMSBit(n));
    }
    //Brute Force Approach -> Complexity : O(log(n))
    static int posOfRMSB(int n){
        int m = 1 ;
        int pos = 0;

        //To handle the infinite loop iteration.
        if(n == 0)
            return -1;

        while (( n & m) == 0 ) {
            m = m << 1;
            pos++;
        }
        return pos+1;
    }
    //Efficient Approach -> Complexity : O(1)
    static int posOfRMSBit(int n){

        return (int)(Math.log10(n ^ (n & (n-1))) / Math.log10(2) ) +1;
    }


}
