//Find the "Kth" biggest element of an array.

import java.util.Scanner;

public class SecondBiggest {

    public static void findBiggest(int[] arry) {


        int largest = arry[0];
        int secondlargest = 0;
        for (int i=1; i<arry.length ;i++){

            if (arry[i]>largest) {
                secondlargest= largest;
                largest = arry[i];
            }
            else if (arry[i]>secondlargest && arry[i] < largest){
                secondlargest=arry[i];
            }
        }

        System.out.println("Second Maximum element: " + secondlargest );

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arry = {3,1,2,3,2,2};

        findBiggest(arry);

    }
}

