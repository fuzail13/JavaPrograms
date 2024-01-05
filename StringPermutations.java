//Print All The Permutations Of A String Using Recursion

import java.util.Scanner;

public class StringPermutations {

    static void permutations(char[] ar, int fix){

        if(fix == ar.length-1){
            System.out.println(ar);
            return;
        }

        for (int i =fix; i<ar.length;i++) {
            swap(ar, i, fix);
            permutations(ar, fix + 1);
            swap(ar, i, fix);
        }

    }
    static void swap(char[] ar, int i, int fix){
        char temp = ar[i];
        ar[i] = ar[fix];
        ar[fix] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String: ");
        String str = sc.next();
        permutations(str.toCharArray(),0);

    }
}
