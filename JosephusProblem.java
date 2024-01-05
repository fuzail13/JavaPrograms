//Solution of Josephus Problem

import java.util.Scanner;

public class JosephusProblem {
    static int jose(int n, int k){
        if(n==1){
            return 0;
        }
        return (jose(n-1,k) + k) % n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("The Total number of people: ");
        int n = sc.nextInt();
        System.out.println("The Total number of factor: ");

        int k =  sc.nextInt();

        System.out.println("The right position is: "+jose(n,k));
    }
}
