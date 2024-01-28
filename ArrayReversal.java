//Write a Program to Reverse an Array.

import java.util.Arrays;

public class ArrayReversal {
	public static void main(String[] args) {
		int[] arry = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(arry));

		reverseArray(arry);

		System.out.println("Reversed Array: " + Arrays.toString(arry));

	}

	public static void reverseArray(int[] arry) {

		int start = 0;
		int end = arry.length - 1;

		while (start < end) {
			int temp = arry[start];
			arry[start] = arry[end];
			arry[end] = temp;

			start++;
			end--;

		}
	}

}
