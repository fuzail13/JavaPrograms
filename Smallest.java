//Writa a Java Program to find smallest element in an array.


import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int largestnum = findSmall(array);

        System.out.println("The smallest element in the array is: " + largestnum);


    }

    public static int findSmall(int[] array){

        if (array.length==0){
            System.out.println("Array is Empty!!");
        }

        int smallest = array[0];

        for (int i=0;i<array.length;i++){
            if (array[i]<smallest){
                smallest=array[i];
            }
        }
        return smallest;

    }
}

