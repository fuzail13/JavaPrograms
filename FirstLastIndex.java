//First And Last Position Of An Element In A Sorted Array.

import java.util.Arrays;

public class FirstLastIndex {

    static int[] searchPosition(int[] ar, int target){

        int low = 0;
        int high = ar.length-1;
        int[] res = {-1,-1};

        while (low <= high){
            int mid = (low+high)/2;

            if (ar[mid] == target){
                res[0] = mid;
                high = mid - 1;
            } else if (ar[mid] > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        low = 0; high = ar.length-1;

        while (low <= high){
            int mid = (low+high)/2;

            if (ar[mid] == target){
                res[1] = mid;
                low = mid + 1;

            } else if (ar[mid] > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,4,5,6};
        int target = 4;
        System.out.println(Arrays.toString(searchPosition(array,target)));


    }
}
