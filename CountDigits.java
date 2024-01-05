import java.util.Scanner;

/* Write a program to count the number of digits.
 */
public class CountDigits {

    static int countNumber(int n){
        if(n==0) {
            return 0;
        }
        return countNumber(n/10)+1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println("The Number of digits are: "+countNumber(n));
    }
}
