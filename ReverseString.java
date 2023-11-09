// Java program to reverse a string.
public class ReverseString {

        public static void main(String[] args) {

            String str = "Malayalame" ;
            String res = ((reverseString(str)));

            System.out.println(res);
        }
        static String reverseString(String str) {
            String temp = "";
            for (int j=str.length()-1;j>=0;j--) {
                temp = temp + str.charAt(j);
                }

            return temp;
        }

}

