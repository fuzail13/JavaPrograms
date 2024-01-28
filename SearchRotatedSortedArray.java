//Search in Rotated Sorted Array - Leetcode Problem 33.

public class SearchRotatedSortedArray {

    public static int search(int[] ar, int target){
        int low = 0, high = ar.length-1, mid = 0;

        while (low <= high){

            mid = (low+high)/2;

            if (ar[mid] == target){
                return mid;

            }
            //Left Sorted Portion
            else if (ar[low] <= ar[mid]) {
                if (target >= ar[low] && target < ar[mid]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            //Right Sorted Portion
            else {
                if (target > ar[mid] && target <= ar[high]){
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {4,5,6,7,8,1,2};
        int target = 9;
        System.out.println(search(array,target));
    }
}
