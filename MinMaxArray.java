//Find the maximum and minimum element in an array.

public class MinMaxArray {
    public static void main(String[] args) {

        int[] arry = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };

        // Call the function to find max and min.
        findMinMax(arry);

    }

    public static void findMinMax(int[] arry) {

        if (arry == null || arry.length == 0) {

            System.out.println("Array is empty!");
            return;

        }

        int min = arry[0];
        int max = arry[0];

        for (int i = 1; i < arry.length; i++) {

            if (arry[i] < min) {
                min = arry[i];
            }

            if (arry[i] > max) {
                max = arry[i];
            }

        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

    }

}
