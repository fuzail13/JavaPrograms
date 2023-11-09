//Write a program to check whether the Array is sorted or Not.

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {

        int array[] = {54,25,12,5,2};

        System.out.println(array.length);
        SortedCheck(array);
    }

    public static void SortedCheck(int array[]){
        boolean flag = true;
        int asc=0, desc =0;
        for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    asc += 1;
                    continue;
                }
                else if (array[i] > array[i+1]) {
                    desc += 1;
                    continue;
                }
                else
                    flag=false;


        }

        if (flag){
            if (asc== array.length-1)
                System.out.println("Array is Sorted in Ascending Order..!");
            else
                System.out.println("Array is Sorted in Descending Order..!");
        }
        else
            System.out.println("Array is Not Sorted..!");


    }


}

