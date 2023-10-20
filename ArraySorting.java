import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int low = 0; //Pointer for 0's.
        int mid = 0; //Pointer for 1's.
        int high = array.length-1;

        while (mid <= high){
            if(array[mid] == 0){
                //Swap the current element with the element at the low point.
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            } else if (array[mid]==1) {
                //Move the mid pointer to the right.
                mid++;
            }
            else {
                //Swap the current element with the element at the high point.
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;

            }
        }

        for (int arry : array){
            System.out.print(arry + " ");
        }
    }
}
