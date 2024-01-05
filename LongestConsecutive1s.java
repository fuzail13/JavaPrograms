/* Write a program to find the longest consecutive 1's in the binary representtion of a number.
*/

import java.util.Scanner;

public class LongestConsecutive1s {

        static int countConsecutive(int n){
            int count = 0;
            while (n>0){
                n = (n & (n<<1));
                count++;
            }
            return count;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any Number: ");
            int n = sc.nextInt();

            System.out.println("The "+n+" has "+countConsecutive((n))+" consecutive 1's.");
        }
}

