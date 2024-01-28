//Write a program to print count of smaller or equal elements in a sorted array.

public class CountSmallEqualElements {

    static int countSmallEqual(int[] ar, int key){

        int low=0; int mid=0;
        int high = ar.length-1;

        while (low <= high){

            mid = (low+high)/2;

            if (ar[mid] == key){
                while (mid+1 < ar.length && key == ar[mid+1]){
                    mid++;
                }
                break;
            } else if (ar[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if (ar[mid] > key){
            return mid;
        }
        else {
            return mid+1;
        }
    }

    public static void main(String[] args) {
        int array[] = {1,8,15,21,26,26,26,26};
        int key=25;
        System.out.println(countSmallEqual(array,key));

    }
}
