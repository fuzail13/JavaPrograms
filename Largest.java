//Writa a Java Program to find largest element in an array

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int largestnum = findLarge(array);

        System.out.println("The largest element in the array is: " + largestnum);


    }
    // Method to find largest in array[]
    public static int findLarge(int[] array){

        if (array.length==0){
            System.out.println("Array is Empty!!");
        }
        // Initialize largest element
        int largest = array[0];

        for (int i=0;i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }
        }
        return largest;

    }
}

