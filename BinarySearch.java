import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {7,3,6,5,8,4,9,1,2};
        int n = 4;
        Arrays.sort(array);
        int low = 0;
        int high = array.length-1;

        while (low<=high){

            int mid = low  + (high-low)/2;
            if (array[mid] == n){
                System.out.println("Data Found..!!");
                return;
            }
            else if (n > array[mid])
                low = mid + 1;
            else
                high = mid - 1 ;
        }
        System.out.println("Data Not Found in an array.");
    }
}
