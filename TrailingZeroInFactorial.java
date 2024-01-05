import java.util.Scanner;

//Program to find the trailing zero's in a factorial.
public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Number: ");
        int num = sc.nextInt();
        int res = 0;
        int powOfFive = 5;
        while (num>=powOfFive){
            res = res + (num/powOfFive);
            powOfFive = powOfFive * 5;
        }
        System.out.println("The "+num+"! of Trailing zero's are :" + res);

    }
}
