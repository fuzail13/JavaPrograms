// Write a program to generate all the balanced parentheses using recursion.


import java.util.Scanner;

public class BalancedParameters {
    static void generatePara(char ar[],int n, int i, int o,int c){
        if (i==ar.length){
            System.out.println(ar);
        }
        if (o<n){
            ar[i] = '(';
            generatePara(ar,n,i+1,o+1,c);
        }
        if(c<o){
            ar[i] = ')';
            generatePara(ar,n,i+1,o,c+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number to generate all the balanced parentheses: ");
        int n = sc.nextInt();
        char[] array = new char[n*2];

        generatePara(array,n,0,0,0);
    }
}
