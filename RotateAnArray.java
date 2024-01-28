//Given an integer array, rotate the array to the anti-clockwise by k steps.

public class RotateAnArray {
    //Brute Force Approach -> Complexity: O(k*n)
    static void rotateOnce(int[] ar){
        int temp = ar[0];
        for (int i=1; i<ar.length;i++){
            ar[i-1] = ar[i];
        }
        ar[ar.length-1] = temp;
    }
    static void rotate(int[] ar, int k){
        k = k % ar.length;// Handle the case where k is greater than the length of the array
        if(k < 0){ // Handle the case where k is negative.
            k = k + ar.length;
        }
        /* Brute Force Approach
        for (int i=1;i<=k;i++){
            rotateOnce(ar);
        }

        Efficient Approach -> Complexity: O(n) */

        reverse(ar,0,k-1);
        reverse(ar,k,ar.length-1);
        reverse(ar,0, ar.length-1);

    }

    static void reverse(int[] ar, int start, int end){

        while (start<=end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int k = 7;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        rotate(array,k);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
