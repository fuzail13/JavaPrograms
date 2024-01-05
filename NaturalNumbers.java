import java.util.Scanner;

/* Write a program to print the n natural number */
public class NaturalNumbers {

    static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Number: ");
        int n = sc.nextInt();

        printNumbers(n);

    }
}
