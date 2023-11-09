// Java program to check if a string is Palindrome
public class PalindromeString {
        public static void main(String[] args) {

            String str = "Malayalame" ;
            str = str.toLowerCase();
            if (checkPalindrome(str))
                System.out.println("The Given String is a Palindrome.");
            else
                System.out.println("The Given String is Not a Palindrome.");

        }
        static boolean checkPalindrome(String str) {
            boolean flag = true;
            for (int i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
                if (str.charAt(i) != str.charAt(j)) {
                    flag = false;
                }
            }
            return flag;
        }

    }

