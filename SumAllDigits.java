import java.util.Scanner;

public class SumAllDigits {
    static int sumDigits(int n){
        if(n==0) {
            return 0;
        }
        return sumDigits(n/10) + n%10;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println("The Sum of digits are: "+sumDigits(n));
    }
}
