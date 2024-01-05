/* Write a program to reverse a string using recursion.
 */

import java.util.Scanner;

public class ReversingString {

    static String reverseString(String str, String rev, int i){

        if(i < 0){
            return rev;
        }
        return reverseString(str,rev+str.charAt(i),i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String: ");
        String str = sc.next();

        System.out.println(reverseString(str,"",str.length()-1));
    }
}
