import java.util.Scanner;

public class LCMbyEuclids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Least Common Factor is: " +findLCM(a,b));
    }

    static int findLCM(int a, int b){
        return (a*b)/findGCD(a,b);
    }
    static int findGCD(int a, int b){
        while (a !=0 && b != 0 ) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if(a != 0)
            return a;
        else
            return b;
    }
}
