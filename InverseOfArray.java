/*
The inverse of an array means interchange the value and the index so that whatever is the value becomes the index and whatever is the index becomes the value.
For example consider the array 2, 3, 1, 0, 4. The inverse of this array will be 3, 2, 0, 1, 4.
 */

public class InverseOfArray {
    public static int[] inverse(int[] ar) {
        int[] temp = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            int val = ar[i];
            temp[val] = i;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 3, 1, 0, 4};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = inverse(array1);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}