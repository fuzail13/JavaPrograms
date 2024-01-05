import java.util.Scanner;

/* Write a program to check the string is palindrome or not.
 */
public class CheckPalindromeString {

    static boolean isPalindrome(String str, int i, int j){
        str  = str.toLowerCase();
        if (str.charAt(i) != str.charAt(j)){
            return false;
        }
        if (i>= j){
            return true;
        }
        return isPalindrome(str,i+1,j-1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String: ");
        String str = sc.next();
        int i = 0, j=str.length()-1;
        System.out.println(isPalindrome(str,i,j));
    }


}
